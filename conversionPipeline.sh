#!/bin/sh

#  conversionPipeline.sh
#  Created by Marine Brenet on 31/10/2018.

mainPath=/Users/marinebrenet/Documents/workflowDescriptor2XSD

# 1 Conversion txt to single xsd
cd $mainPath
./workflowDescriptor2NonDicomXSD.py

# 2 Conversion xsd to javaClass
cd xsd
for i in *.xsd
do
xjc -p javaXSDclass -d $mainPath/java -quiet $i
done

# 3 Conversion txt to multiple xsd
cd ../txt
for i in *.txt
do
../workflowDescriptor2XSD.py "$i" $mainPath/xsdSimple/$i
done
