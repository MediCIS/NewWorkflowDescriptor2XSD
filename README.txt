README Tool producing the XSD files from simple textual descriptions

The Semantic Translator software is dependent on the structure of the XML schema against which the XML File set descriptors provided in the users’ non-DICOM file sets must be valid.

The function of this software developed in Python 3 is to automatically produce automatically the XSD files corresponding to application workflows, from simple text descriptions of these workflows contained in the /txt directory.

The current list of the text versions of the workflows is as follows:
- 2D-DosimetryWorkflow.txt
- 3D-DosimetrySlide2Workflow.txt
- WP2subtask212WorkflowData.txt
- 3D-DosimetrySlide1Workflow.txt	
- Hybrid-DosimetryWorkflow.txt
- calibrationWorkflow.txt

The generation of the XSD is performed by the execution of the conversionNonDicom.command program. 
This program :
- checks the consistency of the XML blocks across the different workflows and reports any errors
- generates a comprenhensive XSD file (in the /xsd directory)
- generates a set of partial XSD files covering each workflow (in the /xsdSimple directory)
- generates .svg diagrams of the XSD (in the /schemas directory)
- generates a set of Java classes used to read/write the xml data (in the java/javaXSDclass directory).

A more detailed documentation of this program is provided in Section 5. Management the XML File set descriptors of the MEDIRAD_Documentation_of_Semantic_translatorV1.1.pdf file located in the DOC/documentation-semantic-graph/ directory

