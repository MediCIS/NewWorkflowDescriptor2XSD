#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 14 15:55:40 2018

@author: marinebrenet
"""
import os

dico = {}
dicoClean = {}
contentList=[]


def readFile(path):
    inside=False
    key=""
    content=""

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
                    dico[key.replace("\n","")]=content
                    contentList.append(content)
                    content=""
                key=line
    
    workflowDescriptor.close()
    


directory = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/txt/"

for file in os.listdir(directory):
    filename = os.fsdecode(file)
    if filename.endswith(".txt") : 
        path = os.path.join(directory, filename)
        readFile(path)
        continue
    else:
        continue

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
    xsdString = '\t\t\t\t<xs:element name="'+name.replace(" ","")+'" type="'+convertType(typeName)
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
        xsdString = xsdString +'" minOccurs="0" />'
    return xsdString

def generateElementRestricted(string, typeName):   
    print("generateElementRestricted")
    print("typeName : "+typeName)

    nameElement = string.split(":")[0]
    print("nameElement : "+nameElement)

    listValues = string.split(":")[1]
    xsd =  '\t\t<xs:element name="'+nameElement+'">\n'
    xsd += '\t\t\t<xs:simpleType>\n'
    xsd += '\t\t\t\t<xs:restriction base="'+convertType(typeName)+'">\n'
    for value in listValues.split("/"):
        xsd += '\t\t\t\t\t<xs:enumeration value="'+value+'"/>\n'
    xsd += '\t\t\t\t</xs:restriction>\n'
    xsd += '\t\t\t</xs:simpleType>\n'
    xsd += '\t\t</xs:element>\n'
    return xsd

def generateComplexObject(name, sousObj):
    xsdString =  '\n\t<xs:element name="'+name.replace("\n","").replace(" ","")+'" minOccurs="0" maxOccurs="unbounded">'+"\n"
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
    xsdString='\n\t<xs:complexType name="'+name.replace("\n","").replace(" ","")+'">'+"\n"
    if choice==True:
        xsdString += "\t\t<xs:choice>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t</xs:choice>"+"\n"
    else:
        xsdString += "\t\t<xs:sequence>"+"\n"
        xsdString += sousObj
        xsdString += "\t\t</xs:sequence>"+"\n"
    xsdString += "\t</xs:complexType>"+"\n"
    return xsdString


def generateXSD(elements, types):
    XSD = '<?xml version="1.0"?>'+"\n"
    XSD+= '<xs:schema'+"\n"
    XSD+= 'targetNamespace="https://www.irdbb-medirad.com"'+"\n"
    XSD+= 'elementFormDefault="qualified"'+"\n"
    XSD+= 'attributeFormDefault="unqualified"'+"\n"
    XSD+= 'xmlns:xs="http://www.w3.org/2001/XMLSchema"'+"\n"
    XSD+= 'xmlns:irdbb="https://www.irdbb-medirad.com">'+"\n"
    
    XSD+= '\t<xs:element name="NonDicomFileSetDescriptor">'+"\n"
    XSD+= '\t\t<xs:complexType>'+"\n"
    XSD+= '\t\t\t<xs:sequence>'+"\n"
    XSD+= '\t\t\t\t<xs:element name="ReferencedClinicalResearchStudy">'+"\n"
    XSD+= '\t\t\t\t\t<xs:complexType>'+"\n"
    XSD+= '\t\t\t\t\t\t<xs:sequence>'+"\n"
    XSD+= '\t\t\t\t\t\t\t<xs:element name="ClinicalResearchStudyID" type="xs:string"/>'+"\n"
    XSD+= '\t\t\t\t\t\t\t<xs:element name="ClinicalResearchStudyTitle" type="xs:string"/>'+"\n"
    XSD+= '\t\t\t\t\t\t</xs:sequence>'+"\n"
    XSD+= '\t\t\t\t\t</xs:complexType>'+"\n"
    XSD+= '\t\t\t\t</xs:element>'+"\n"
    XSD+= '\t\t\t<xs:element name="PatientId" type="xs:string"/>'+"\n"
    
    XSD+=elements
    
    XSD+='\t\t\t</xs:sequence>'+"\n"
    XSD+='\t\t</xs:complexType>'+"\n"
    XSD+='\t</xs:element>'+"\n"
    
    XSD+=types    
    
#    XSD+='<xs:complexType name="SegmentationMethodType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="SegmentationMethod" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="SoftwareName" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>'+"\n"
#    XSD+='        <xs:element name="SegmentationMethodSetting" type="irdbb:MethodSettingType" minOccurs="0" maxOccurs="unbounded" />'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"
    
#    XSD+='<xs:complexType name="MonteCarloMethodType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="MonteCarloMethod" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="SoftwareName" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>'+"\n"
#    XSD+='        <xs:element name="SimulatedImagingDevice" type="xs:string" minOccurs="0" maxOccurs="unbounded" />'+"\n"
#    XSD+='        <xs:element name="MonteCarloMethodSetting" type="irdbb:MethodSettingType" minOccurs="0" maxOccurs="unbounded" />'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"

#    XSD+='<xs:complexType name="MethodSettingType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="MethodSetting" minOccurs="0" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="MethodSettingValue" minOccurs="0" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="MethodSettingUnit" minOccurs="0" type="xs:string"/>'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"


#    XSD+='<xs:complexType name="DICOMData">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="DICOMStudyUID" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="DICOMSeriesUID" maxOccurs="unbounded" type="xs:string"/>'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"

#    XSD+='<xs:complexType name="NonDICOMDataType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="NonDICOMDataClass">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="VOI"/>'+"\n"
#    XSD+='                    <xs:enumeration value="VOI superimposed on images"/>'+"\n"
#    XSD+='                    <xs:enumeration value="3D dose map"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="NonDICOMDataFormat">'+"\n"
#    XSD+='        <xs:simpleType>'+"\n"
#    XSD+='            <xs:restriction base="xs:string">'+"\n"
#    XSD+='                <xs:enumeration value="zipped imageJ contours format"/>'+"\n"
#    XSD+='                <xs:enumeration value="TIFF format embedding imageJ contours"/>'+"\n"
#    XSD+='                <xs:enumeration value="zipped pseudo-DICOM ImpactMC"/>'+"\n"
#    XSD+='            </xs:restriction>'+"\n"
#    XSD+='        </xs:simpleType>'+"\n"
#    XSD+='    </xs:element>'+"\n"
#    XSD+='    <xs:element name="NonDICOMDataFileName" type="xs:string" maxOccurs="unbounded" />'+"\n"
#    XSD+='    <xs:element name="FHIRId" minOccurs="0" type="xs:string"/>'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"
    
#    XSD+='<xs:complexType name="AttenuatorType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="AttenuatorCategory" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="EquivalentAttenuatorDescription" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="EquivalentAttenuatorMaterial" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="EquivalentAttenuatorThicknessValue" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="EquivalentAttenuatorThicknessUnit" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="EquivalentAttenuatorModel" type="xs:string"/>'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"
    
#    XSD+='<xs:complexType name="AbsorbedDosePerVOIType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="AbsorbedDoseCategory">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="mean absorbed dose normalized to CTDI-free-in-air normalized to tube load"/>'+"\n"
#    XSD+='                    <xs:enumeration value="mean absorbed dose normalized to CTDI-vol normalized to tube load"/>'+"\n"
#    XSD+='                    <xs:enumeration value="mean absorbed radiation dose"/>'+"\n"
#    XSD+='                    <xs:enumeration value="maximum absorbed radiation dose"/>'+"\n"
#    XSD+='                    <xs:enumeration value="minimum absorbed radiation dose"/>'+"\n"
#    XSD+='                    <xs:enumeration value="median absorbed radiation dose"/>'+"\n"
#    XSD+='                    <xs:enumeration value="mode absorbed radiation dose"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="StatisticalSubCategory" minOccurs="0">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="mean"/>'+"\n"
#    XSD+='                    <xs:enumeration value="maximum"/>'+"\n"
#    XSD+='                    <xs:enumeration value="minimum"/>'+"\n"
#    XSD+='                    <xs:enumeration value="median"/>'+"\n"
#    XSD+='                    <xs:enumeration value="mode"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="AbsorbedDoseValue" type="xs:string"/>'+"\n"
#    XSD+='        <xs:element name="AbsorbedDoseUnit">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="milligray per (milligray per (100 milliampere second))"/>'+"\n"
#    XSD+='                    <xs:enumeration value="milligray per (100 milliampere second)"/>'+"\n"
#    XSD+='                    <xs:enumeration value="milligray"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="VOI" type="irdbb:VOIDescriptorType"/>'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"
#    
#    XSD+='<xs:complexType name="VoxelBasedDistributionOfAbsorbedDoseType">'+"\n"
#    XSD+='    <xs:sequence>'+"\n"
#    XSD+='        <xs:element name="VoxelBasedDistributionOfAbsorbedDoseCategory">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="absorbed dose normalized to CTDI-free-in-air normalized to tube load"/>'+"\n"
#    XSD+='                    <xs:enumeration value="absorbed dose normalized to CTDI-vol normalized to tube load"/>'+"\n"
#    XSD+='                    <xs:enumeration value="absorbed dose"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="AbsorbedDoseUnit">'+"\n"
#    XSD+='            <xs:simpleType>'+"\n"
#    XSD+='                <xs:restriction base="xs:string">'+"\n"
#    XSD+='                    <xs:enumeration value="milligray per (milligray per (100 milliampere second))"/>'+"\n"
#    XSD+='                    <xs:enumeration value="milligray per (100 milliampere second)"/>'+"\n"
#    XSD+='                    <xs:enumeration value="milligray"/>'+"\n"
#    XSD+='                </xs:restriction>'+"\n"
#    XSD+='            </xs:simpleType>'+"\n"
#    XSD+='        </xs:element>'+"\n"
#    XSD+='        <xs:element name="NonDICOMVoxelBasedAbsorbedDoseDistribution" type="irdbb:NonDICOMDataType" minOccurs="0" />'+"\n"
#    XSD+='        <xs:element name="DICOMVoxelBasedAbsorbedDoseDistribution" type="irdbb:DICOMDataType" minOccurs="0" />'+"\n"
#    XSD+='    </xs:sequence>'+"\n"
#    XSD+='</xs:complexType>'+"\n"
    
    XSD+='</xs:schema>'
    return XSD

xmlElements = ""
xmlTypes = ""
listeTypes=[]
listeTypes.append("DataActivityPerVOIAtTimePoint")

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
                    if ":" in name and "/" in name:
                        sousObjets+=generateElementRestricted(name, typeName)
                    else:
                        sousObjets+=generateSimpleObject(nombre, name, typeName)+"\n"
        
        if key != "" and key.replace("\n","").replace(" ","") != "":
            if key in listeTypes:
                xmlTypes+=generateComplexType(key,sousObjets)
            else:
                xmlElements+=generateComplexObject(key,sousObjets)

pathXSD = "xsd/nondicomFileSetDescriptorTest.xsd"

print("XSD file : "+pathXSD)

fileXSD = open(pathXSD, "w")

fileXSD.write(generateXSD(xmlElements, xmlTypes))

fileXSD.close()
print("Converted")