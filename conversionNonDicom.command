#!/bin/sh

#  Created by Marine Brenet on 31/10/2018.

#echo $0
echo "$( dirname "${BASH_SOURCE[0]}" )"

cd "$( dirname "${BASH_SOURCE[0]}" )"

cp xsd/nonDicomFileSetDescriptor.xsd oldNonDicomFileSetDescriptor.xsd

# 0 Coherence Test
rm inconsistencyList.txt
if ./testCoherence.py ./txt
then echo "Coherents Files"
else
echo "Incoherents Files"
echo "See inconsistencyList.txt for details"
exit 1
fi

# 1 Version Number
fileVersion="versionNonDicom.txt"
oldVersion=$(($(cat $fileVersion)))
version=$(($(cat $fileVersion) + 1))
#version=$(($(cat $fileVersion)))

echo "Nouvelle Version : ""$version"
echo "Ancienne Version : ""$oldVersion"
echo "$version" > "$fileVersion"

# 2 Conversion txt to single xsd
./workflowDescriptor2NonDicomXSD.py ./txt $version

# 3 Conversion xsd to javaClass
cd java
for i in  ../xsd/*.xsd
do
xjc -readOnly -p javaXSDclass $i
done

# 4 Conversion txt to multiple xsd
cd ../txt
for i in *.txt
do
../workflowDescriptor2XSD.py "$i" ../xsdSimple/$i $version
done

# 5 Diff
cd "$( dirname "${BASH_SOURCE[0]}" )"
diff xsd/nonDicomFileSetDescriptor.xsd oldNonDicomFileSetDescriptor.xsd > diffXsd$oldVersion-$version.txt

# 6 Compress XSD simple Files
tar -czf XSD_$version.tar.gz xsdSimple/*

# 6 Compress XSD simple Files
cd schemas
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/WP2subtask212WorkflowData.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/calibrationWorkflow.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/Hybrid-DosimetryWorkflow.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/2D-DosimetryWorkflow.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/3D-DosimetrySlide2Workflow.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsdSimple/3D-DosimetrySlide1Workflow.xsd
java -jar ../xsdvi/dist/lib/xsdvi.jar ../xsd/nonDicomFileSetDescriptor.xsd
