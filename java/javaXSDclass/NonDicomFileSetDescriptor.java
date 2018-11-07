//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.07 à 02:11:03 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferencedClinicalResearchStudy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClinicalResearchStudyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ClinicalResearchStudyTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CalibrationWorkflow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SPECTCTCalibrationWorkflow" type="{https://www.irdbb-medirad.com}SPECTCTCalibrationWorkflow"/>
 *                   &lt;element name="PlanarCalibrationWorkflow" type="{https://www.irdbb-medirad.com}PlanarCalibrationWorkflow"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WP2subtask212WorkflowData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CTSegmentation" type="{https://www.irdbb-medirad.com}CTSegmentation" minOccurs="0"/>
 *                   &lt;element name="SimpleCTMonteCarloDosimetry" type="{https://www.irdbb-medirad.com}SimpleCTMonteCarloDosimetry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TwoDimDosimetryworkflow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
 *                   &lt;element name="TwoDimDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
 *                   &lt;element name="TwoDimDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
 *                   &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HybridDosimetryworkflow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
 *                   &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing"/>
 *                   &lt;element name="HybridDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}HybridDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
 *                   &lt;element name="HybridDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}HybridDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
 *                   &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegistrationVOISegmentation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *                   &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DICOMSeriesUIDNMTomoReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DICOMSeriesUIDCTReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RegistrationAndSegmentationMethodMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CountsPerVOIAtTimePointProduced" type="{https://www.irdbb-medirad.com}CountsPerVOIAtTimePoint" maxOccurs="unbounded"/>
 *                   &lt;element name="VOIInSPECTProduced" type="{https://www.irdbb-medirad.com}VOI" maxOccurs="unbounded"/>
 *                   &lt;element name="CTReconResampledOnSPECTProduced" type="{https://www.irdbb-medirad.com}DICOMData"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ThreeDimDosimetryWorkflow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
 *                   &lt;element name="RegistrationVOISegmentationAndPropagation" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagation"/>
 *                   &lt;element name="VOIActivityDetermination" type="{https://www.irdbb-medirad.com}VOIActivityDetermination" maxOccurs="unbounded"/>
 *                   &lt;element name="TimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TimeActivityCurveFit" maxOccurs="unbounded"/>
 *                   &lt;element name="AbsorbedDoseCalculation" type="{https://www.irdbb-medirad.com}AbsorbedDoseCalculation"/>
 *                   &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
 *                   &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
 *                   &lt;element name="VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" maxOccurs="unbounded"/>
 *                   &lt;element name="DoseRateCurveFitVOITimeIntegration" type="{https://www.irdbb-medirad.com}DoseRateCurveFitVOITimeIntegration"/>
 *                   &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "referencedClinicalResearchStudy",
    "patientId",
    "calibrationWorkflow",
    "wp2Subtask212WorkflowData",
    "twoDimDosimetryworkflow",
    "hybridDosimetryworkflow",
    "registrationVOISegmentation",
    "threeDimDosimetryWorkflow"
})
@XmlRootElement(name = "NonDicomFileSetDescriptor")
public class NonDicomFileSetDescriptor {

    @XmlElement(name = "ReferencedClinicalResearchStudy", required = true)
    protected NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy referencedClinicalResearchStudy;
    @XmlElement(name = "PatientId", required = true)
    protected String patientId;
    @XmlElement(name = "CalibrationWorkflow")
    protected List<NonDicomFileSetDescriptor.CalibrationWorkflow> calibrationWorkflow;
    @XmlElement(name = "WP2subtask212WorkflowData")
    protected List<NonDicomFileSetDescriptor.WP2Subtask212WorkflowData> wp2Subtask212WorkflowData;
    @XmlElement(name = "TwoDimDosimetryworkflow")
    protected List<NonDicomFileSetDescriptor.TwoDimDosimetryworkflow> twoDimDosimetryworkflow;
    @XmlElement(name = "HybridDosimetryworkflow")
    protected List<NonDicomFileSetDescriptor.HybridDosimetryworkflow> hybridDosimetryworkflow;
    @XmlElement(name = "RegistrationVOISegmentation")
    protected List<NonDicomFileSetDescriptor.RegistrationVOISegmentation> registrationVOISegmentation;
    @XmlElement(name = "ThreeDimDosimetryWorkflow")
    protected List<NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow> threeDimDosimetryWorkflow;

    /**
     * Obtient la valeur de la propriété referencedClinicalResearchStudy.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy }
     *     
     */
    public NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy getReferencedClinicalResearchStudy() {
        return referencedClinicalResearchStudy;
    }

    /**
     * Définit la valeur de la propriété referencedClinicalResearchStudy.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy }
     *     
     */
    public void setReferencedClinicalResearchStudy(NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy value) {
        this.referencedClinicalResearchStudy = value;
    }

    /**
     * Obtient la valeur de la propriété patientId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Définit la valeur de la propriété patientId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the calibrationWorkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calibrationWorkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalibrationWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.CalibrationWorkflow }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.CalibrationWorkflow> getCalibrationWorkflow() {
        if (calibrationWorkflow == null) {
            calibrationWorkflow = new ArrayList<NonDicomFileSetDescriptor.CalibrationWorkflow>();
        }
        return this.calibrationWorkflow;
    }

    /**
     * Gets the value of the wp2Subtask212WorkflowData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wp2Subtask212WorkflowData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWP2Subtask212WorkflowData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.WP2Subtask212WorkflowData }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.WP2Subtask212WorkflowData> getWP2Subtask212WorkflowData() {
        if (wp2Subtask212WorkflowData == null) {
            wp2Subtask212WorkflowData = new ArrayList<NonDicomFileSetDescriptor.WP2Subtask212WorkflowData>();
        }
        return this.wp2Subtask212WorkflowData;
    }

    /**
     * Gets the value of the twoDimDosimetryworkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twoDimDosimetryworkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwoDimDosimetryworkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.TwoDimDosimetryworkflow }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.TwoDimDosimetryworkflow> getTwoDimDosimetryworkflow() {
        if (twoDimDosimetryworkflow == null) {
            twoDimDosimetryworkflow = new ArrayList<NonDicomFileSetDescriptor.TwoDimDosimetryworkflow>();
        }
        return this.twoDimDosimetryworkflow;
    }

    /**
     * Gets the value of the hybridDosimetryworkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hybridDosimetryworkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHybridDosimetryworkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.HybridDosimetryworkflow }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.HybridDosimetryworkflow> getHybridDosimetryworkflow() {
        if (hybridDosimetryworkflow == null) {
            hybridDosimetryworkflow = new ArrayList<NonDicomFileSetDescriptor.HybridDosimetryworkflow>();
        }
        return this.hybridDosimetryworkflow;
    }

    /**
     * Gets the value of the registrationVOISegmentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationVOISegmentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationVOISegmentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.RegistrationVOISegmentation }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.RegistrationVOISegmentation> getRegistrationVOISegmentation() {
        if (registrationVOISegmentation == null) {
            registrationVOISegmentation = new ArrayList<NonDicomFileSetDescriptor.RegistrationVOISegmentation>();
        }
        return this.registrationVOISegmentation;
    }

    /**
     * Gets the value of the threeDimDosimetryWorkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDimDosimetryWorkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDimDosimetryWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow }
     * 
     * 
     */
    public List<NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow> getThreeDimDosimetryWorkflow() {
        if (threeDimDosimetryWorkflow == null) {
            threeDimDosimetryWorkflow = new ArrayList<NonDicomFileSetDescriptor.ThreeDimDosimetryWorkflow>();
        }
        return this.threeDimDosimetryWorkflow;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SPECTCTCalibrationWorkflow" type="{https://www.irdbb-medirad.com}SPECTCTCalibrationWorkflow"/>
     *         &lt;element name="PlanarCalibrationWorkflow" type="{https://www.irdbb-medirad.com}PlanarCalibrationWorkflow"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "spectctCalibrationWorkflow",
        "planarCalibrationWorkflow"
    })
    public static class CalibrationWorkflow {

        @XmlElement(name = "SPECTCTCalibrationWorkflow")
        protected SPECTCTCalibrationWorkflow spectctCalibrationWorkflow;
        @XmlElement(name = "PlanarCalibrationWorkflow")
        protected PlanarCalibrationWorkflow planarCalibrationWorkflow;

        /**
         * Obtient la valeur de la propriété spectctCalibrationWorkflow.
         * 
         * @return
         *     possible object is
         *     {@link SPECTCTCalibrationWorkflow }
         *     
         */
        public SPECTCTCalibrationWorkflow getSPECTCTCalibrationWorkflow() {
            return spectctCalibrationWorkflow;
        }

        /**
         * Définit la valeur de la propriété spectctCalibrationWorkflow.
         * 
         * @param value
         *     allowed object is
         *     {@link SPECTCTCalibrationWorkflow }
         *     
         */
        public void setSPECTCTCalibrationWorkflow(SPECTCTCalibrationWorkflow value) {
            this.spectctCalibrationWorkflow = value;
        }

        /**
         * Obtient la valeur de la propriété planarCalibrationWorkflow.
         * 
         * @return
         *     possible object is
         *     {@link PlanarCalibrationWorkflow }
         *     
         */
        public PlanarCalibrationWorkflow getPlanarCalibrationWorkflow() {
            return planarCalibrationWorkflow;
        }

        /**
         * Définit la valeur de la propriété planarCalibrationWorkflow.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanarCalibrationWorkflow }
         *     
         */
        public void setPlanarCalibrationWorkflow(PlanarCalibrationWorkflow value) {
            this.planarCalibrationWorkflow = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
     *         &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing"/>
     *         &lt;element name="HybridDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}HybridDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
     *         &lt;element name="HybridDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}HybridDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
     *         &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "patientId",
        "patientName",
        "clinicalResearchStudyId",
        "planarDataAcquisitionAndProcessing",
        "spectDataAcquisitionAndProcessing",
        "hybridDosimetryViaAbsorbedDoseRateCalculation",
        "hybridDosimetryViaTimeActivityCurveFit",
        "radioBiologicalCalculation"
    })
    public static class HybridDosimetryworkflow {

        @XmlElement(name = "PatientId", required = true)
        protected String patientId;
        @XmlElement(name = "PatientName", required = true)
        protected String patientName;
        @XmlElement(name = "ClinicalResearchStudyId", required = true)
        protected String clinicalResearchStudyId;
        @XmlElement(name = "PlanarDataAcquisitionAndProcessing", required = true)
        protected List<PlanarDataAcquisitionAndProcessing> planarDataAcquisitionAndProcessing;
        @XmlElement(name = "SPECTDataAcquisitionAndProcessing", required = true)
        protected SPECTDataAcquisitionAndProcessing spectDataAcquisitionAndProcessing;
        @XmlElement(name = "HybridDosimetryViaAbsorbedDoseRateCalculation")
        protected HybridDosimetryViaAbsorbedDoseRateCalculation hybridDosimetryViaAbsorbedDoseRateCalculation;
        @XmlElement(name = "HybridDosimetryViaTimeActivityCurveFit")
        protected HybridDosimetryViaTimeActivityCurveFit hybridDosimetryViaTimeActivityCurveFit;
        @XmlElement(name = "RadioBiologicalCalculation", required = true)
        protected RadioBiologicalCalculation radioBiologicalCalculation;

        /**
         * Obtient la valeur de la propriété patientId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatientId() {
            return patientId;
        }

        /**
         * Définit la valeur de la propriété patientId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPatientId(String value) {
            this.patientId = value;
        }

        /**
         * Obtient la valeur de la propriété patientName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatientName() {
            return patientName;
        }

        /**
         * Définit la valeur de la propriété patientName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPatientName(String value) {
            this.patientName = value;
        }

        /**
         * Obtient la valeur de la propriété clinicalResearchStudyId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinicalResearchStudyId() {
            return clinicalResearchStudyId;
        }

        /**
         * Définit la valeur de la propriété clinicalResearchStudyId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinicalResearchStudyId(String value) {
            this.clinicalResearchStudyId = value;
        }

        /**
         * Gets the value of the planarDataAcquisitionAndProcessing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the planarDataAcquisitionAndProcessing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlanarDataAcquisitionAndProcessing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanarDataAcquisitionAndProcessing }
         * 
         * 
         */
        public List<PlanarDataAcquisitionAndProcessing> getPlanarDataAcquisitionAndProcessing() {
            if (planarDataAcquisitionAndProcessing == null) {
                planarDataAcquisitionAndProcessing = new ArrayList<PlanarDataAcquisitionAndProcessing>();
            }
            return this.planarDataAcquisitionAndProcessing;
        }

        /**
         * Obtient la valeur de la propriété spectDataAcquisitionAndProcessing.
         * 
         * @return
         *     possible object is
         *     {@link SPECTDataAcquisitionAndProcessing }
         *     
         */
        public SPECTDataAcquisitionAndProcessing getSPECTDataAcquisitionAndProcessing() {
            return spectDataAcquisitionAndProcessing;
        }

        /**
         * Définit la valeur de la propriété spectDataAcquisitionAndProcessing.
         * 
         * @param value
         *     allowed object is
         *     {@link SPECTDataAcquisitionAndProcessing }
         *     
         */
        public void setSPECTDataAcquisitionAndProcessing(SPECTDataAcquisitionAndProcessing value) {
            this.spectDataAcquisitionAndProcessing = value;
        }

        /**
         * Obtient la valeur de la propriété hybridDosimetryViaAbsorbedDoseRateCalculation.
         * 
         * @return
         *     possible object is
         *     {@link HybridDosimetryViaAbsorbedDoseRateCalculation }
         *     
         */
        public HybridDosimetryViaAbsorbedDoseRateCalculation getHybridDosimetryViaAbsorbedDoseRateCalculation() {
            return hybridDosimetryViaAbsorbedDoseRateCalculation;
        }

        /**
         * Définit la valeur de la propriété hybridDosimetryViaAbsorbedDoseRateCalculation.
         * 
         * @param value
         *     allowed object is
         *     {@link HybridDosimetryViaAbsorbedDoseRateCalculation }
         *     
         */
        public void setHybridDosimetryViaAbsorbedDoseRateCalculation(HybridDosimetryViaAbsorbedDoseRateCalculation value) {
            this.hybridDosimetryViaAbsorbedDoseRateCalculation = value;
        }

        /**
         * Obtient la valeur de la propriété hybridDosimetryViaTimeActivityCurveFit.
         * 
         * @return
         *     possible object is
         *     {@link HybridDosimetryViaTimeActivityCurveFit }
         *     
         */
        public HybridDosimetryViaTimeActivityCurveFit getHybridDosimetryViaTimeActivityCurveFit() {
            return hybridDosimetryViaTimeActivityCurveFit;
        }

        /**
         * Définit la valeur de la propriété hybridDosimetryViaTimeActivityCurveFit.
         * 
         * @param value
         *     allowed object is
         *     {@link HybridDosimetryViaTimeActivityCurveFit }
         *     
         */
        public void setHybridDosimetryViaTimeActivityCurveFit(HybridDosimetryViaTimeActivityCurveFit value) {
            this.hybridDosimetryViaTimeActivityCurveFit = value;
        }

        /**
         * Obtient la valeur de la propriété radioBiologicalCalculation.
         * 
         * @return
         *     possible object is
         *     {@link RadioBiologicalCalculation }
         *     
         */
        public RadioBiologicalCalculation getRadioBiologicalCalculation() {
            return radioBiologicalCalculation;
        }

        /**
         * Définit la valeur de la propriété radioBiologicalCalculation.
         * 
         * @param value
         *     allowed object is
         *     {@link RadioBiologicalCalculation }
         *     
         */
        public void setRadioBiologicalCalculation(RadioBiologicalCalculation value) {
            this.radioBiologicalCalculation = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClinicalResearchStudyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ClinicalResearchStudyTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clinicalResearchStudyID",
        "clinicalResearchStudyTitle"
    })
    public static class ReferencedClinicalResearchStudy {

        @XmlElement(name = "ClinicalResearchStudyID", required = true)
        protected String clinicalResearchStudyID;
        @XmlElement(name = "ClinicalResearchStudyTitle", required = true)
        protected String clinicalResearchStudyTitle;

        /**
         * Obtient la valeur de la propriété clinicalResearchStudyID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinicalResearchStudyID() {
            return clinicalResearchStudyID;
        }

        /**
         * Définit la valeur de la propriété clinicalResearchStudyID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinicalResearchStudyID(String value) {
            this.clinicalResearchStudyID = value;
        }

        /**
         * Obtient la valeur de la propriété clinicalResearchStudyTitle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinicalResearchStudyTitle() {
            return clinicalResearchStudyTitle;
        }

        /**
         * Définit la valeur de la propriété clinicalResearchStudyTitle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinicalResearchStudyTitle(String value) {
            this.clinicalResearchStudyTitle = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
     *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DICOMSeriesUIDNMTomoReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DICOMSeriesUIDCTReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RegistrationAndSegmentationMethodMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CountsPerVOIAtTimePointProduced" type="{https://www.irdbb-medirad.com}CountsPerVOIAtTimePoint" maxOccurs="unbounded"/>
     *         &lt;element name="VOIInSPECTProduced" type="{https://www.irdbb-medirad.com}VOI" maxOccurs="unbounded"/>
     *         &lt;element name="CTReconResampledOnSPECTProduced" type="{https://www.irdbb-medirad.com}DICOMData"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "processExecutionContext",
        "timePointIdentifierUsed",
        "dicomSeriesUIDNMTomoReconUsed",
        "dicomSeriesUIDCTReconUsed",
        "registrationAndSegmentationMethodMethodUsed",
        "countsPerVOIAtTimePointProduced",
        "voiInSPECTProduced",
        "ctReconResampledOnSPECTProduced"
    })
    public static class RegistrationVOISegmentation {

        @XmlElement(name = "ProcessExecutionContext", required = true)
        protected ProcessExecutionContext processExecutionContext;
        @XmlElement(name = "TimePointIdentifierUsed", required = true)
        protected String timePointIdentifierUsed;
        @XmlElement(name = "DICOMSeriesUIDNMTomoReconUsed", required = true)
        protected String dicomSeriesUIDNMTomoReconUsed;
        @XmlElement(name = "DICOMSeriesUIDCTReconUsed", required = true)
        protected String dicomSeriesUIDCTReconUsed;
        @XmlElement(name = "RegistrationAndSegmentationMethodMethodUsed", required = true)
        protected String registrationAndSegmentationMethodMethodUsed;
        @XmlElement(name = "CountsPerVOIAtTimePointProduced", required = true)
        protected List<CountsPerVOIAtTimePoint> countsPerVOIAtTimePointProduced;
        @XmlElement(name = "VOIInSPECTProduced", required = true)
        protected List<VOI> voiInSPECTProduced;
        @XmlElement(name = "CTReconResampledOnSPECTProduced", required = true)
        protected DICOMData ctReconResampledOnSPECTProduced;

        /**
         * Obtient la valeur de la propriété processExecutionContext.
         * 
         * @return
         *     possible object is
         *     {@link ProcessExecutionContext }
         *     
         */
        public ProcessExecutionContext getProcessExecutionContext() {
            return processExecutionContext;
        }

        /**
         * Définit la valeur de la propriété processExecutionContext.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcessExecutionContext }
         *     
         */
        public void setProcessExecutionContext(ProcessExecutionContext value) {
            this.processExecutionContext = value;
        }

        /**
         * Obtient la valeur de la propriété timePointIdentifierUsed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimePointIdentifierUsed() {
            return timePointIdentifierUsed;
        }

        /**
         * Définit la valeur de la propriété timePointIdentifierUsed.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimePointIdentifierUsed(String value) {
            this.timePointIdentifierUsed = value;
        }

        /**
         * Obtient la valeur de la propriété dicomSeriesUIDNMTomoReconUsed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDICOMSeriesUIDNMTomoReconUsed() {
            return dicomSeriesUIDNMTomoReconUsed;
        }

        /**
         * Définit la valeur de la propriété dicomSeriesUIDNMTomoReconUsed.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDICOMSeriesUIDNMTomoReconUsed(String value) {
            this.dicomSeriesUIDNMTomoReconUsed = value;
        }

        /**
         * Obtient la valeur de la propriété dicomSeriesUIDCTReconUsed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDICOMSeriesUIDCTReconUsed() {
            return dicomSeriesUIDCTReconUsed;
        }

        /**
         * Définit la valeur de la propriété dicomSeriesUIDCTReconUsed.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDICOMSeriesUIDCTReconUsed(String value) {
            this.dicomSeriesUIDCTReconUsed = value;
        }

        /**
         * Obtient la valeur de la propriété registrationAndSegmentationMethodMethodUsed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationAndSegmentationMethodMethodUsed() {
            return registrationAndSegmentationMethodMethodUsed;
        }

        /**
         * Définit la valeur de la propriété registrationAndSegmentationMethodMethodUsed.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationAndSegmentationMethodMethodUsed(String value) {
            this.registrationAndSegmentationMethodMethodUsed = value;
        }

        /**
         * Gets the value of the countsPerVOIAtTimePointProduced property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countsPerVOIAtTimePointProduced property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountsPerVOIAtTimePointProduced().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountsPerVOIAtTimePoint }
         * 
         * 
         */
        public List<CountsPerVOIAtTimePoint> getCountsPerVOIAtTimePointProduced() {
            if (countsPerVOIAtTimePointProduced == null) {
                countsPerVOIAtTimePointProduced = new ArrayList<CountsPerVOIAtTimePoint>();
            }
            return this.countsPerVOIAtTimePointProduced;
        }

        /**
         * Gets the value of the voiInSPECTProduced property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voiInSPECTProduced property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVOIInSPECTProduced().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VOI }
         * 
         * 
         */
        public List<VOI> getVOIInSPECTProduced() {
            if (voiInSPECTProduced == null) {
                voiInSPECTProduced = new ArrayList<VOI>();
            }
            return this.voiInSPECTProduced;
        }

        /**
         * Obtient la valeur de la propriété ctReconResampledOnSPECTProduced.
         * 
         * @return
         *     possible object is
         *     {@link DICOMData }
         *     
         */
        public DICOMData getCTReconResampledOnSPECTProduced() {
            return ctReconResampledOnSPECTProduced;
        }

        /**
         * Définit la valeur de la propriété ctReconResampledOnSPECTProduced.
         * 
         * @param value
         *     allowed object is
         *     {@link DICOMData }
         *     
         */
        public void setCTReconResampledOnSPECTProduced(DICOMData value) {
            this.ctReconResampledOnSPECTProduced = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
     *         &lt;element name="RegistrationVOISegmentationAndPropagation" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagation"/>
     *         &lt;element name="VOIActivityDetermination" type="{https://www.irdbb-medirad.com}VOIActivityDetermination" maxOccurs="unbounded"/>
     *         &lt;element name="TimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TimeActivityCurveFit" maxOccurs="unbounded"/>
     *         &lt;element name="AbsorbedDoseCalculation" type="{https://www.irdbb-medirad.com}AbsorbedDoseCalculation"/>
     *         &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
     *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
     *         &lt;element name="VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" maxOccurs="unbounded"/>
     *         &lt;element name="DoseRateCurveFitVOITimeIntegration" type="{https://www.irdbb-medirad.com}DoseRateCurveFitVOITimeIntegration"/>
     *         &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class ThreeDimDosimetryWorkflow {

        @XmlElementRefs({
            @XmlElementRef(name = "AbsorbedDoseCalculation", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SPECTDataAcquisitionAndProcessing", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PatientId", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "VOIActivityDetermination", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RegistrationVOISegmentationAndPropagation", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RadioBiologicalCalculation", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ClinicalResearchStudyId", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PatientName", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DoseRateCurveFitVOITimeIntegration", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TimeActivityCurveFit", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Obtient le reste du modèle de contenu. 
         * 
         * <p>
         * Vous obtenez la propriété "catch-all" pour la raison suivante : 
         * Le nom de champ "PatientId" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
         * ligne 95 sur file:/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsd/nonDicomFileSetDescriptor.xsd
         * ligne 86 sur file:/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsd/nonDicomFileSetDescriptor.xsd
         * <p>
         * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
         * des deux déclarations suivantes afin de modifier leurs noms : 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link AbsorbedDoseCalculation }{@code >}
         * {@link JAXBElement }{@code <}{@link SPECTDataAcquisitionAndProcessing }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link VOIActivityDetermination }{@code >}
         * {@link JAXBElement }{@code <}{@link RegistrationVOISegmentationAndPropagation }{@code >}
         * {@link JAXBElement }{@code <}{@link RadioBiologicalCalculation }{@code >}
         * {@link JAXBElement }{@code <}{@link VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link DoseRateCurveFitVOITimeIntegration }{@code >}
         * {@link JAXBElement }{@code <}{@link TimeActivityCurveFit }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<?>>();
            }
            return this.content;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PatientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PatientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ClinicalResearchStudyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
     *         &lt;element name="TwoDimDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
     *         &lt;element name="TwoDimDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
     *         &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "patientId",
        "patientName",
        "clinicalResearchStudyId",
        "planarDataAcquisitionAndProcessing",
        "twoDimDosimetryViaAbsorbedDoseRateCalculation",
        "twoDimDosimetryViaTimeActivityCurveFit",
        "radioBiologicalCalculation"
    })
    public static class TwoDimDosimetryworkflow {

        @XmlElement(name = "PatientId", required = true)
        protected String patientId;
        @XmlElement(name = "PatientName", required = true)
        protected String patientName;
        @XmlElement(name = "ClinicalResearchStudyId", required = true)
        protected String clinicalResearchStudyId;
        @XmlElement(name = "PlanarDataAcquisitionAndProcessing", required = true)
        protected List<PlanarDataAcquisitionAndProcessing> planarDataAcquisitionAndProcessing;
        @XmlElement(name = "TwoDimDosimetryViaAbsorbedDoseRateCalculation")
        protected TwoDimDosimetryViaAbsorbedDoseRateCalculation twoDimDosimetryViaAbsorbedDoseRateCalculation;
        @XmlElement(name = "TwoDimDosimetryViaTimeActivityCurveFit")
        protected TwoDimDosimetryViaTimeActivityCurveFit twoDimDosimetryViaTimeActivityCurveFit;
        @XmlElement(name = "RadioBiologicalCalculation", required = true)
        protected RadioBiologicalCalculation radioBiologicalCalculation;

        /**
         * Obtient la valeur de la propriété patientId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatientId() {
            return patientId;
        }

        /**
         * Définit la valeur de la propriété patientId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPatientId(String value) {
            this.patientId = value;
        }

        /**
         * Obtient la valeur de la propriété patientName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatientName() {
            return patientName;
        }

        /**
         * Définit la valeur de la propriété patientName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPatientName(String value) {
            this.patientName = value;
        }

        /**
         * Obtient la valeur de la propriété clinicalResearchStudyId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinicalResearchStudyId() {
            return clinicalResearchStudyId;
        }

        /**
         * Définit la valeur de la propriété clinicalResearchStudyId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinicalResearchStudyId(String value) {
            this.clinicalResearchStudyId = value;
        }

        /**
         * Gets the value of the planarDataAcquisitionAndProcessing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the planarDataAcquisitionAndProcessing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlanarDataAcquisitionAndProcessing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanarDataAcquisitionAndProcessing }
         * 
         * 
         */
        public List<PlanarDataAcquisitionAndProcessing> getPlanarDataAcquisitionAndProcessing() {
            if (planarDataAcquisitionAndProcessing == null) {
                planarDataAcquisitionAndProcessing = new ArrayList<PlanarDataAcquisitionAndProcessing>();
            }
            return this.planarDataAcquisitionAndProcessing;
        }

        /**
         * Obtient la valeur de la propriété twoDimDosimetryViaAbsorbedDoseRateCalculation.
         * 
         * @return
         *     possible object is
         *     {@link TwoDimDosimetryViaAbsorbedDoseRateCalculation }
         *     
         */
        public TwoDimDosimetryViaAbsorbedDoseRateCalculation getTwoDimDosimetryViaAbsorbedDoseRateCalculation() {
            return twoDimDosimetryViaAbsorbedDoseRateCalculation;
        }

        /**
         * Définit la valeur de la propriété twoDimDosimetryViaAbsorbedDoseRateCalculation.
         * 
         * @param value
         *     allowed object is
         *     {@link TwoDimDosimetryViaAbsorbedDoseRateCalculation }
         *     
         */
        public void setTwoDimDosimetryViaAbsorbedDoseRateCalculation(TwoDimDosimetryViaAbsorbedDoseRateCalculation value) {
            this.twoDimDosimetryViaAbsorbedDoseRateCalculation = value;
        }

        /**
         * Obtient la valeur de la propriété twoDimDosimetryViaTimeActivityCurveFit.
         * 
         * @return
         *     possible object is
         *     {@link TwoDimDosimetryViaTimeActivityCurveFit }
         *     
         */
        public TwoDimDosimetryViaTimeActivityCurveFit getTwoDimDosimetryViaTimeActivityCurveFit() {
            return twoDimDosimetryViaTimeActivityCurveFit;
        }

        /**
         * Définit la valeur de la propriété twoDimDosimetryViaTimeActivityCurveFit.
         * 
         * @param value
         *     allowed object is
         *     {@link TwoDimDosimetryViaTimeActivityCurveFit }
         *     
         */
        public void setTwoDimDosimetryViaTimeActivityCurveFit(TwoDimDosimetryViaTimeActivityCurveFit value) {
            this.twoDimDosimetryViaTimeActivityCurveFit = value;
        }

        /**
         * Obtient la valeur de la propriété radioBiologicalCalculation.
         * 
         * @return
         *     possible object is
         *     {@link RadioBiologicalCalculation }
         *     
         */
        public RadioBiologicalCalculation getRadioBiologicalCalculation() {
            return radioBiologicalCalculation;
        }

        /**
         * Définit la valeur de la propriété radioBiologicalCalculation.
         * 
         * @param value
         *     allowed object is
         *     {@link RadioBiologicalCalculation }
         *     
         */
        public void setRadioBiologicalCalculation(RadioBiologicalCalculation value) {
            this.radioBiologicalCalculation = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CTSegmentation" type="{https://www.irdbb-medirad.com}CTSegmentation" minOccurs="0"/>
     *         &lt;element name="SimpleCTMonteCarloDosimetry" type="{https://www.irdbb-medirad.com}SimpleCTMonteCarloDosimetry" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ctSegmentation",
        "simpleCTMonteCarloDosimetry"
    })
    public static class WP2Subtask212WorkflowData {

        @XmlElement(name = "CTSegmentation")
        protected CTSegmentation ctSegmentation;
        @XmlElement(name = "SimpleCTMonteCarloDosimetry")
        protected List<SimpleCTMonteCarloDosimetry> simpleCTMonteCarloDosimetry;

        /**
         * Obtient la valeur de la propriété ctSegmentation.
         * 
         * @return
         *     possible object is
         *     {@link CTSegmentation }
         *     
         */
        public CTSegmentation getCTSegmentation() {
            return ctSegmentation;
        }

        /**
         * Définit la valeur de la propriété ctSegmentation.
         * 
         * @param value
         *     allowed object is
         *     {@link CTSegmentation }
         *     
         */
        public void setCTSegmentation(CTSegmentation value) {
            this.ctSegmentation = value;
        }

        /**
         * Gets the value of the simpleCTMonteCarloDosimetry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleCTMonteCarloDosimetry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleCTMonteCarloDosimetry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleCTMonteCarloDosimetry }
         * 
         * 
         */
        public List<SimpleCTMonteCarloDosimetry> getSimpleCTMonteCarloDosimetry() {
            if (simpleCTMonteCarloDosimetry == null) {
                simpleCTMonteCarloDosimetry = new ArrayList<SimpleCTMonteCarloDosimetry>();
            }
            return this.simpleCTMonteCarloDosimetry;
        }

    }

}
