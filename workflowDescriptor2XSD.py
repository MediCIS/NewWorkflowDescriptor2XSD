#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 14 15:55:40 2018

@author: marinebrenet
"""
import sys

path = sys.argv[1]
#path = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/txt/3D-DosimetrySlide1Workflow.txt"

dico = {}
dicoClean = {}
contentList=[]
inside=False
key=""
content=""

xmlRootElements = "\n\t\t\t\t<!--xmlRootElements-->"
xmlElements = "\n\t<!--xmlElements-->"
xmlTypes = "\n\t<!--xmlTypes-->"

listeTypes = []

fileListeTypesPath = "../listeTypes.txt"
fileListeTypes = open(fileListeTypesPath, "r")

for t in fileListeTypes:
    t = t.replace("\n","")
    listeTypes.append(t)

nVersion = sys.argv[3]
#nVersion = "002"
if len(nVersion)==1:
    nVersion="00"+nVersion
elif len(nVersion)==2:
    nVersion="0"+nVersion

print("Read the Text File : "+path)
workflowDescriptor = open(path, "r")

for line in workflowDescriptor:
    if not "==" in line and not "//" in line and not "#" in line and line != "" :
        if "{" in line or "[" in line :
            inside=True
        if "}" in line  or "]" in line :
            content=content+line
            inside=False
        if inside:
            content=content+line
        else:
            if key!="" and "}" not in key and "{" not in key :
                key=key.replace("       ","")
                key=key.replace("        ","")
                key=key.replace("        ","")
                if len(content)>0:
                    dico[key.replace("\n","")]=content
                    contentList.append(content)
                content=""
            key=line

workflowDescriptor.close()

# Transform in XSD
print("Conversion in XSD")

def convertType(typeName):
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
    return typeName

def generateSimpleObject(nombre, name, typeName):
    xsdString = '\t\t\t<xs:element name="'+name.replace(" ","")+'" type="'+convertType(typeName)
    nombre=nombre.replace(" ","")
    if nombre=="1" :
        xsdString += '"/>'
    elif nombre=="0,1":
        xsdString += '" minOccurs="0" />'
    elif nombre=="1,n" or nombre=="1,m":
        xsdString += '" maxOccurs="unbounded" />'
    elif nombre=="0,n" or nombre=="0,m":
        xsdString += '" minOccurs="0" maxOccurs="unbounded" />'
    else:
        xsdString += '" minOccurs="0" />'
    return xsdString

def generateElementRestricted(nombre, string, typeName):   
    nameElement = string.split(":")[0]
    #listValues = string.split(":")[1]
    xsd =  '\t\t<xs:element name="'+nameElement+'" type="irdbb:'+nameElement
    
    nombre=nombre.replace(" ","")
    if nombre=="1" :
        xsd += '" />'+'\n'
    elif nombre=="0,1":
        xsd += '" minOccurs="0" />'+'\n'
    elif nombre=="1,n" or nombre=="1,m":
       xsd += '" maxOccurs="unbounded" />'+'\n'
    elif nombre=="0,n" or nombre=="0,m":
        xsd += '" minOccurs="0" maxOccurs="unbounded" />'+'\n'
    else:
       xsd += '" minOccurs="0" />'+'\n'
    return xsd

def generateRestrictedType(string, typeName):
    nameElement = string.split(":")[0]
    listValues = string.split(":")[1]
    xmlTypes = '\n\t<xs:simpleType name="'+nameElement+'">\n'
    xmlTypes += '\t\t<xs:restriction base="'+convertType(typeName)+'">\n'
    for value in listValues.split("/"):
        xmlTypes += '\t\t\t<xs:enumeration value="'+value+'"/>\n'
    xmlTypes += '\t\t</xs:restriction>\n'
    xmlTypes += '\t</xs:simpleType>\n'
    return xmlTypes

def generateComplexObject(name, sousObj):
    if choice==True:
        xsdString =  '\n\t<xs:element name="'+name.replace("\n","").replace(" ","")+'" type="'+name.replace("\n","").replace(" ","")+'" >'+"\n" #minOccurs="0" maxOccurs="unbounded"
    else:
        xsdString =  '\n\t<xs:element name="'+name.replace("\n","").replace(" ","")+'" >'+"\n" #minOccurs="0" maxOccurs="unbounded"
    xsdString += "\t\t<xs:complexType>"+"\n"
    if choice==True:
        xsdString += "\t\t\t<xs:choice>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t\t</xs:choice>"+"\n"
    else:
        xsdString += "\t\t\t<xs:sequence>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t\t</xs:sequence>"+"\n"
    xsdString += "\t\t</xs:complexType>\n"
    xsdString += "\t</xs:element>"+"\n"
    return xsdString

def generateComplexType(name, sousObj):
    if choice==True:
        xsdString='\n\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'type="'+name.replace("\n","").replace(" ","")+'">'+"\n"
        xsdString += "\t\t<xs:choice>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t</xs:choice>"+"\n"
    else:
        xsdString='\n\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'">'+"\n"
        xsdString += "\t\t<xs:sequence>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t</xs:sequence>"+"\n"
    xsdString += "\t</xs:complexType>"+"\n"
    return xsdString

def generateRootType(name):
    return '\t\t\t\t<xs:element name="'+name+'" type="irdbb:'+name+'" />\n'

def generateComplexRoot(name, sousObj):
    if choice==True:
        xsdString='\n\t\t\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'">'+"\n"
        #xsdString += "\t\t\t\t<xs:complexType>"+"\n"
        xsdString += "\t\t\t\t\t<xs:choice>"+"\n"
        xsdString += "\t\t\t"+sousObj.replace("\n","\n\t\t\t\t")
        xsdString += "\t\t\t\t\t\t</xs:choice>"+"\n"
    else:
        xsdString='\n\t\t\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'">'+"\n"
        #xsdString += "\t\t\t\t<xs:complexType>"+"\n"
        xsdString += "\t\t\t\t<xs:sequence>"+"\n"
        xsdString += "\t\t"+sousObj.replace("\n","\n\t\t")
        xsdString += "\t\t\t\t</xs:sequence>"+"\n"
    
    xsdString += "\t\t\t\t</xs:complexType>"+"\n"
    #xsdString += "\t\t\t</xs:element>"+"\n"
    xsdString = xsdString.replace("										</xs:sequence>","\t\t\t\t\t\t</xs:sequence>")
    return xsdString

def generateXSD(elements, types, rootElements):
    XSD = '<?xml version="1.0"?>'+"\n"
    XSD+= '<!--VersionSchemas : '+nVersion+'-->'+"\n"
    XSD+= '<xs:schema'+"\n"
    XSD+= 'targetNamespace="https://www.irdbb-medirad.com"'+"\n"
    XSD+= 'elementFormDefault="qualified"'+"\n"
    XSD+= 'attributeFormDefault="unqualified"'+"\n"
    XSD+= 'xmlns:xs="http://www.w3.org/2001/XMLSchema"'+"\n"
    XSD+= 'xmlns:xsd="http://www.w3.org/2001/XMLSchema"'+"\n"
    XSD+= 'xmlns:irdbb="https://www.irdbb-medirad.com">'+"\n"
    XSD+= '\t<xs:element name="NonDicomFileSetDescriptor"  type="irdbb:NonDicomFileSetDescriptor" />'+"\n"
    XSD+= '\t<xs:complexType name="NonDicomFileSetDescriptor">'+"\n"
    XSD+= '\t\t<xs:sequence>'+"\n"
    XSD+= '\t\t\t<xs:element name="ReferencedClinicalResearchStudy" type="irdbb:ReferencedClinicalResearchStudy" />'+"\n"
    XSD+= '\t\t\t<xs:element name="PatientId" type="xs:string"/>'+"\n"
    if "AcquisitionSettings" in types or "AcquisitionSettings" in elements:
        XSD+= '\t\t\t<xs:element name="AcquisitionSettings" type="irdbb:AcquisitionSettings"  minOccurs="0" />'+"\n"
    XSD+=rootElements
    XSD+= '\t\t</xs:sequence>'+"\n"
    XSD+= '\t</xs:complexType>'+"\n"+"\n"
    XSD+= '\t\t\t<xs:complexType name="ReferencedClinicalResearchStudy">'+"\n"
    XSD+= '\t\t\t\t\t<xs:sequence>'+"\n"
    XSD+= '\t\t\t\t\t\t<xs:element name="ClinicalResearchStudyID" type="xs:string"/>'+"\n"
    XSD+= '\t\t\t\t\t\t<xs:element name="ClinicalResearchStudyTitle" type="xs:string"/>'+"\n"
    XSD+= '\t\t\t\t\t</xs:sequence>'+"\n"
    XSD+= '\t\t\t\t</xs:complexType>'+"\n"    
    XSD+=elements
    XSD+=types        
    XSD+='\n</xs:schema>'
    return XSD

xmlElements = ""
xmlTypes = ""
xmlRootElements = ""

listeTypesRestricted=[]

listeRacines = ["ThreeDimDosimetrySlide1workflow", "WP2subtask212WorkflowData", "TwoDimDosimetryworkflow", "HybridDosimetryworkflow", "CalibrationWorkflow", "ThreeDimDosimetrySlide2workflow"]
                
for key in dico:
    if len(key)>1:
        content = dico[key]
        if "[" == content[0]:
            choice=True
        else:
            choice=False
        sousObjets = ""
        for line in content.split("\n"):   
            if not "{" in line and not "}" in line and not "[" in line and not "]" in line and " " in line:
                typeName=line.split("-")[1]
                name=line.split("-")[2]
                nombre=line.split("-")[0]
                listeTypes.append(typeName)
                if name != "" and name.replace("\n","").replace(" ","") != "":
                    if ":" in name in name: #and "/" 
                        sousObjets += generateElementRestricted(nombre, name, typeName)
                        if name not in listeTypesRestricted:
                            xmlTypes += generateRestrictedType(name, typeName)
                            listeTypesRestricted.append(name)
                    else:
                        sousObjets += generateSimpleObject(nombre, name, typeName)+"\n"
        key = key.replace("\n","").replace(" ","")
        if key != "" :
            #print(key)
            if key in listeRacines:
                xmlRootElements += generateRootType(key)
                xmlElements += generateComplexRoot(key,sousObjets)
            elif key in listeTypes or "VOIcontainer" in key or "VOIIdentifierContainer" in key :
                xmlTypes += generateComplexType(key,sousObjets)
            else:
                xmlElements += generateComplexObject(key,sousObjets)        
       


if len(sys.argv) < 2:
    pathXSD = path.replace("txt", "xsd")
else:
    pathXSD = sys.argv[2].replace(".txt", ".xsd")

print("XSD file : "+pathXSD)

fileXSD = open(pathXSD, "w")
contenu = generateXSD(xmlElements, xmlTypes, xmlRootElements)

fileXSD.write(contenu)
fileXSD.close()

print("Converted")
