#!/bin/sh

#  Created by Marine Brenet on 31/10/2018.

cd /Users/marinebrenet/Documents/workflowDescriptor2XSD/
cp xsd/nonDicomFileSetDescriptor.xsd oldNonDicomFileSetDescriptor.xsd

# 0 Get Version Number
fileVersion="versionNonDicom.txt"

oldVersion=$(($(cat $fileVersion)))
version=$(($(cat $fileVersion) + 1))

echo "Nouvelle Version : ""$version"
echo "Ancienne Version : ""$oldVersion"
#echo "$version" > "$fileVersion"

# 1 Coherence Test
rm inconsistencyList.txt
if ./testCoherence.py ./txt
then echo "Coherents Files"
else
echo "Incoherents Files"
echo "See inconsistencyList.txt for details"

exit 1
fi

# 2 Conversion txt to single xsd
./workflowDescriptor2NonDicomXSD.py ./txt $version

# 3 Conversion xsd to javaClass
cd java
for i in  ../xsd/*.xsd
do
xjc -p javaXSDclass $i
done

# 4 Conversion txt to multiple xsd
cd ../txt
for i in *.txt
do
../workflowDescriptor2XSD.py "$i" ../xsdSimple/$i $version
done

# 5 Diff
cd /Users/marinebrenet/Documents/workflowDescriptor2XSD/

diff xsd/nonDicomFileSetDescriptor.xsd oldNonDicomFileSetDescriptor.xsd > diffXsd$oldVersion-$version.txt
