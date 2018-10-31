#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 14 15:55:40 2018

@author: marinebrenet
"""

import sys

path = sys.argv[1]
#path = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/calibrationWorkflow.txt"

dico = {}
dicoClean = {}
contentList=[]
inside=False
key=""
content=""

# Read the file
print("Read the Text File : "+path)
workflowDescriptor = open(path, "r")

for line in workflowDescriptor:
    if not "==" in line and not "//" in line and not "#" in line and line != "" :
        if "{" in line:
            inside=True
        if "}" in line: 
            content=content+line
            inside=False
        if inside:
            content=content+line
        else:
            if key!="" and "}" not in key and "{" not in key :
                key=key.replace("       ","")
                key=key.replace("        ","")
                key=key.replace("        ","")
                dico[key.replace("\n","")]=content
                contentList.append(content)
                content=""
            key=line

workflowDescriptor.close()

# Transform in XSD
print("Conversion in XSD")

def generateSimpleObject(nombre, name, typeName):
    if typeName.lower()=="string":
        typeName="xs:string"
    elif typeName.lower()=="integer" :
        typeName="xs:integer"
    elif typeName.lower()=="float" :
        typeName="xs:float"  
    elif typeName.lower()=="decimal" :
        typeName="xs:decimal"     
    elif typeName.lower()=="double" :
        typeName="xs:double" 
        
    elif typeName.lower()=="duration" :
        typeName="xs:duration"
    elif typeName.lower()=="dateTime" :
        typeName="xs:dateTime"
    elif typeName.lower()=="time" :
        typeName="xs:time"
    elif typeName.lower()=="date" :
        typeName="xs:date"   
    
    elif typeName.lower()=="gYearMonth" :
        typeName="xs:gYearMonth"     
    elif typeName.lower()=="gYear" :
        typeName="xs:gYear" 
    elif typeName.lower()=="gMonthDay" :
        typeName="xs:gMonthDay"
    elif typeName.lower()=="gDay" :
        typeName="xs:gDay"
    elif typeName.lower()=="gMonth" :
        typeName="xs:gMonth"  
    
    else:
        typeName="irdbb:"+typeName
    xsdString = '\t\t\t\t<xs:element name="'+name.replace(" ","")+'" type="'+typeName
    nombre=nombre.replace(" ","")
    if nombre=="1" :
        xsdString = xsdString +'"/>'
    elif nombre=="0,1":
        xsdString = xsdString +'" minOccurs="0" />'
    elif nombre=="1,n" or nombre=="1,m":
        xsdString = xsdString +'" maxOccurs="unbounded" />'
    elif nombre=="0,n" or nombre=="0,m":
        xsdString = xsdString +'" minOccurs="0" maxOccurs="unbounded" />'
    else:
        xsdString = xsdString +'"/>'
    return xsdString

def generateElementRestricted(string, typeName):   
    nameElement = string.split(":")[0]
    listValues = string.split(":")[1]
    xsd = '\t\t<xs:element name="'+nameElement+'">\n'
    xsd += '\t\t\t<xs:simpleType>\n'
    xsd += '\t\t\t\t<xs:restriction base="'+typeName+'">\n'
    for value in listValues.split("/"):
        xsd += '\t\t\t\t\t<xs:enumeration value="'+value+'"/>\n'
    xsd += '\t\t\t\t</xs:restriction>\n'
    xsd += '\t\t\t</xs:simpleType>\n'
    xsd += '\t\t</xs:element>\n'
    return xsd

def generateComplexObject(name, sousObj):
    xsdString='\n\t<xs:element name="'+name.replace("\n","").replace(" ","")+'">'
    xsdString=xsdString +"\n"+"\t\t<xs:complexType>"+"\n"+ "\t\t\t<xs:sequence>"+"\n"
    xsdString=xsdString+sousObj
    xsdString=xsdString+"\t\t\t</xs:sequence>\n"+"\t\t</xs:complexType>\n"+"\t</xs:element>"+"\n"
    return xsdString

def generateComplexType(name, sousObj):
    xsdString='\n\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'">'
    xsdString=xsdString +"\n"+"\t\t<xs:sequence>"+"\n"
    xsdString=xsdString+sousObj
    xsdString=xsdString+"\t\t</xs:sequence>\n"+"\t</xs:complexType>"+"\n"
    return xsdString

def generateXSD(content):
    XSD = '<?xml version="1.0"?>'+"\n"
    XSD+='<xs:schema'+"\n"
    XSD+='targetNamespace="https://www.irdbb-medirad.com"'+"\n"
    XSD+='elementFormDefault="qualified"'+"\n"
    XSD+='attributeFormDefault="unqualified"'+"\n"
    XSD+='xmlns:xs="http://www.w3.org/2001/XMLSchema"'+"\n"
    XSD+='xmlns:irdbb="https://www.irdbb-medirad.com">'+"\n"
    XSD+=content
    XSD+='</xs:schema>'
    return XSD

xmlContent = ""
listeTypes=[]
    
for key in dico:
    if len(key)>1:
        content = dico[key]
        sousObjets = ""
        for line in content.split("\n"):
            if not "{" in line and not "}" in line and " " in line:
                typeName=line.split("-")[1]
                name=line.split("-")[2]
                nombre=line.split("-")[0]
                listeTypes.append(typeName)
                if name != "" and name.replace("\n","").replace(" ","") != "":
                    if ":" in name and "/" in name:
                        sousObjets+=generateElementRestricted(name, typeName)
                    else:
                        sousObjets+=generateSimpleObject(nombre, name, typeName)+"\n"
        if key != "" and key.replace("\n","").replace(" ","") != "":
            if key in listeTypes:
                xmlContent+=generateComplexType(key,sousObjets)
            else:
                xmlContent+=generateComplexObject(key,sousObjets)
        
print("XSD file : "+path.replace(".txt", ".xsd"))

fileXSD = open(path.replace(".txt", ".xsd"), "w")

fileXSD.write(generateXSD(xmlContent))

fileXSD.close()
print("Converted")