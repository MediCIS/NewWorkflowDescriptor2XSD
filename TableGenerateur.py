#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Nov 22 15:05:19 2018

@author: marinebrenet
"""
import sys


nVersion = sys.argv[1]

print(nVersion)


if len(nVersion)==1:
    nVersion="00"+nVersion
elif len(nVersion)==2:
    nVersion="0"+nVersion

version = "Version " +nVersion
print(version)

pathRef = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsdTableauRef.txt"
pathOut = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsdTableau.txt"

refFile = open(pathRef, "r")

outFile = open(pathOut, "w")

for line in refFile:
    name = line.split(";")[0]
    fileName = line.split(";")[1]
    description = line.split(";")[2]

    newName = name+" ("+version+")"

    newLine = newName+";"+fileName+";"+description+"\n"
    print(newLine)
    outFile.write(newLine)

refFile.close()
outFile.close()