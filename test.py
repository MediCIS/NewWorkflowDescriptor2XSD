#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Feb 14 16:49:00 2020

@author: marinebrenet
"""

listeTypes = []

fileListeTypesPath = "listeTypes.txt"
fileListeTypes = open(fileListeTypesPath, "r")

for t in fileListeTypes:
    t = t.replace("\n","")
    listeTypes.append(t)

