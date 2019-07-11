#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr 25 11:24:26 2019

@author: marinebrenet
"""

import os
import sys

directory = sys.argv[1]

#directory = "/Users/marinebrenet/Documents/workflowDescriptor2XSD/txt"

nInconsistency = 0
inconsistencyList = []
keyFilesDict = {}

dico = {}
contentList=[]

def readFile(path):
    global nInconsistency
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
                if "}" not in key and "{" not in key  :
                    key=key.replace("       ","")
                    key=key.replace("        ","")
                    key=key.replace("        ","")
                    key=key.replace("\n","")
                    
                    if key!="" and key!='' :
                        fileName = path.split("/")[-1]
                        if key not in keyFilesDict:
                            keyFilesDict[key] = [fileName]
                        else:
                            keyFilesDict[key].append(fileName)
                        
                        if key in dico:
                            if dico[key] != content:
                                print("inconsistency : "+key)
                                #print("Version 1 : "+"\n"+dico[key])
                                #print("Version 2 in file("+path+") :\n"+content)
                                #print("")
                                nInconsistency+=1
                                if key not in inconsistencyList:
                                    inconsistencyList.append(key)
                        else:
                            dico[key]=content
                            contentList.append(content)
                        
                        content=""
                key=line
    
    workflowDescriptor.close()
    
for file in os.listdir(directory):
    filename = os.fsdecode(file)
    if filename.endswith(".txt") : 
        path = os.path.join(directory, filename)
        readFile(path)
        continue
    else:
        continue
    
if nInconsistency>0: 
    inconsistencyFile = open(directory.replace("/txt","/inconsistencyList.txt"), "w")
    for inco in inconsistencyList:
        listeFichiers = ""
        for file in keyFilesDict[inco]:
            listeFichiers=listeFichiers+file+", "
        listeFichiers = listeFichiers[:-2]
        inconsistencyFile.write(inco+" : "+listeFichiers+"\n")
    inconsistencyFile.close()
    
sys.exit(nInconsistency)