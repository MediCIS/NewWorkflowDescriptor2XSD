#!/bin/sh

#  Created by Marine Brenet on 31/10/2018.

# 1 Conversion txt to single xsd
./workflowDescriptor2NonDicomXSD.py

# 2 Conversion xsd to javaClass
cd java
for i in  ../xsd/*.xsd
do
xjc -p javaXSDclass -quiet $i
done

## 3 Conversion txt to multiple xsd
cd ../txt
for i in *.txt
do
../workflowDescriptor2XSD.py "$i" ../xsdSimple/$i
done
