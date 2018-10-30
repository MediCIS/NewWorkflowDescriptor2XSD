#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct 30 15:39:39 2018

@author: marinebrenet
"""

test = "VOILabel:bone/breast/esophagus/heart/lungs/skin"

def generateElementRestricted(string):   
    nameElement = string.split(":")[0]
    listValues = string.split(":")[1]
    
    xsd = '<xs:element name="'+nameElement+'">\n'
    xsd += '\t<xs:simpleType>\n'
    xsd += '\t\t<xs:restriction base="xs:string">\n'
    
    for value in listValues.split("/"):
        xsd += '\t\t\t<xs:enumeration value="'+value+'"/>\n'
    
    
    xsd += '\t\t</xs:restriction>\n'
    xsd += '\t</xs:simpleType>\n'
    xsd += '</xs:element>\n'
    
    return xsd

print(generateElementRestricted(test))