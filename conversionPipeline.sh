#!/bin/sh

#  conversionPipeline.sh
#  Created by Marine Brenet on 31/10/2018.

# 1 Conversion txt to xsd
mainPath=/Users/marinebrenet/Documents/workflowDescriptor2XSD

cd $mainPath/txt

for i in *.txt
do
../workflowDescriptor2XSD.py "$i" $mainPath/xsd/$i
done

cd ../xsd

for i in *.xsd
do
xjc -p javaXSDclass -d $mainPath/java $i
done
