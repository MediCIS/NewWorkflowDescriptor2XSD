//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.08 à 10:03:35 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CalibrationWorkflow">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPECTCTCalibrationWorkflow" type="{https://www.irdbb-medirad.com}SPECTCTCalibrationWorkflow"/>
 *                   &lt;element name="PlanarCalibrationWorkflow" type="{https://www.irdbb-medirad.com}PlanarCalibrationWorkflow"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WP2subtask212WorkflowData">
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
 *         &lt;element name="ThreeDimDosimetrySlide1workflow">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPECTDataAcquisitionAndReconstruction" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndReconstruction"/>
 *                   &lt;element name="RegistrationVOISegmentationAndPropagation" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagation"/>
 *                   &lt;element name="VOIActivityDetermination" type="{https://www.irdbb-medirad.com}VOIActivityDetermination"/>
 *                   &lt;element name="TimeActivityCurveFitIn3DDosimetry" type="{https://www.irdbb-medirad.com}TimeActivityCurveFitIn3DDosimetry"/>
 *                   &lt;element name="AbsorbedDoseCalculationInVOI" type="{https://www.irdbb-medirad.com}AbsorbedDoseCalculationInVOI"/>
 *                   &lt;element name="RadioBiologicalCalculationIn3DSlide1Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationIn3DSlide1Dosimetry"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TwoDimDosimetryworkflow">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PlanarDataAcquisitionAndProcessingContainer" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessingContainer"/>
 *                   &lt;element name="TwoDimDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
 *                   &lt;element name="TwoDimDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
 *                   &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HybridDosimetryworkflow">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
 *                   &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing"/>
 *                   &lt;element name="HybridDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}HybridDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
 *                   &lt;element name="HybridDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}HybridDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
 *                   &lt;element name="RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ThreeDimDosimetrySlide2workflow">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPECTDataAcquisitionAndReconstruction" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndReconstruction" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" maxOccurs="unbounded"/>
 *                   &lt;element name="DoseRateCurveFitVOITimeIntegration" type="{https://www.irdbb-medirad.com}DoseRateCurveFitVOITimeIntegration"/>
 *                   &lt;element name="RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" minOccurs="0"/>
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
    "threeDimDosimetrySlide1Workflow",
    "twoDimDosimetryworkflow",
    "hybridDosimetryworkflow",
    "threeDimDosimetrySlide2Workflow"
})
@XmlRootElement(name = "NonDicomFileSetDescriptor")
public class NonDicomFileSetDescriptor {

    @XmlElement(name = "ReferencedClinicalResearchStudy", required = true)
    protected NonDicomFileSetDescriptor.ReferencedClinicalResearchStudy referencedClinicalResearchStudy;
    @XmlElement(name = "PatientId", required = true)
    protected String patientId;
    @XmlElement(name = "CalibrationWorkflow", required = true)
    protected NonDicomFileSetDescriptor.CalibrationWorkflow calibrationWorkflow;
    @XmlElement(name = "WP2subtask212WorkflowData", required = true)
    protected NonDicomFileSetDescriptor.WP2Subtask212WorkflowData wp2Subtask212WorkflowData;
    @XmlElement(name = "ThreeDimDosimetrySlide1workflow", required = true)
    protected NonDicomFileSetDescriptor.ThreeDimDosimetrySlide1Workflow threeDimDosimetrySlide1Workflow;
    @XmlElement(name = "TwoDimDosimetryworkflow", required = true)
    protected NonDicomFileSetDescriptor.TwoDimDosimetryworkflow twoDimDosimetryworkflow;
    @XmlElement(name = "HybridDosimetryworkflow", required = true)
    protected NonDicomFileSetDescriptor.HybridDosimetryworkflow hybridDosimetryworkflow;
    @XmlElement(name = "ThreeDimDosimetrySlide2workflow", required = true)
    protected NonDicomFileSetDescriptor.ThreeDimDosimetrySlide2Workflow threeDimDosimetrySlide2Workflow;

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
     * Obtient la valeur de la propriété calibrationWorkflow.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.CalibrationWorkflow }
     *     
     */
    public NonDicomFileSetDescriptor.CalibrationWorkflow getCalibrationWorkflow() {
        return calibrationWorkflow;
    }

    /**
     * Définit la valeur de la propriété calibrationWorkflow.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.CalibrationWorkflow }
     *     
     */
    public void setCalibrationWorkflow(NonDicomFileSetDescriptor.CalibrationWorkflow value) {
        this.calibrationWorkflow = value;
    }

    /**
     * Obtient la valeur de la propriété wp2Subtask212WorkflowData.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.WP2Subtask212WorkflowData }
     *     
     */
    public NonDicomFileSetDescriptor.WP2Subtask212WorkflowData getWP2Subtask212WorkflowData() {
        return wp2Subtask212WorkflowData;
    }

    /**
     * Définit la valeur de la propriété wp2Subtask212WorkflowData.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.WP2Subtask212WorkflowData }
     *     
     */
    public void setWP2Subtask212WorkflowData(NonDicomFileSetDescriptor.WP2Subtask212WorkflowData value) {
        this.wp2Subtask212WorkflowData = value;
    }

    /**
     * Obtient la valeur de la propriété threeDimDosimetrySlide1Workflow.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.ThreeDimDosimetrySlide1Workflow }
     *     
     */
    public NonDicomFileSetDescriptor.ThreeDimDosimetrySlide1Workflow getThreeDimDosimetrySlide1Workflow() {
        return threeDimDosimetrySlide1Workflow;
    }

    /**
     * Définit la valeur de la propriété threeDimDosimetrySlide1Workflow.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.ThreeDimDosimetrySlide1Workflow }
     *     
     */
    public void setThreeDimDosimetrySlide1Workflow(NonDicomFileSetDescriptor.ThreeDimDosimetrySlide1Workflow value) {
        this.threeDimDosimetrySlide1Workflow = value;
    }

    /**
     * Obtient la valeur de la propriété twoDimDosimetryworkflow.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.TwoDimDosimetryworkflow }
     *     
     */
    public NonDicomFileSetDescriptor.TwoDimDosimetryworkflow getTwoDimDosimetryworkflow() {
        return twoDimDosimetryworkflow;
    }

    /**
     * Définit la valeur de la propriété twoDimDosimetryworkflow.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.TwoDimDosimetryworkflow }
     *     
     */
    public void setTwoDimDosimetryworkflow(NonDicomFileSetDescriptor.TwoDimDosimetryworkflow value) {
        this.twoDimDosimetryworkflow = value;
    }

    /**
     * Obtient la valeur de la propriété hybridDosimetryworkflow.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.HybridDosimetryworkflow }
     *     
     */
    public NonDicomFileSetDescriptor.HybridDosimetryworkflow getHybridDosimetryworkflow() {
        return hybridDosimetryworkflow;
    }

    /**
     * Définit la valeur de la propriété hybridDosimetryworkflow.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.HybridDosimetryworkflow }
     *     
     */
    public void setHybridDosimetryworkflow(NonDicomFileSetDescriptor.HybridDosimetryworkflow value) {
        this.hybridDosimetryworkflow = value;
    }

    /**
     * Obtient la valeur de la propriété threeDimDosimetrySlide2Workflow.
     * 
     * @return
     *     possible object is
     *     {@link NonDicomFileSetDescriptor.ThreeDimDosimetrySlide2Workflow }
     *     
     */
    public NonDicomFileSetDescriptor.ThreeDimDosimetrySlide2Workflow getThreeDimDosimetrySlide2Workflow() {
        return threeDimDosimetrySlide2Workflow;
    }

    /**
     * Définit la valeur de la propriété threeDimDosimetrySlide2Workflow.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDicomFileSetDescriptor.ThreeDimDosimetrySlide2Workflow }
     *     
     */
    public void setThreeDimDosimetrySlide2Workflow(NonDicomFileSetDescriptor.ThreeDimDosimetrySlide2Workflow value) {
        this.threeDimDosimetrySlide2Workflow = value;
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
     *         &lt;element name="SPECTCTCalibrationWorkflow" type="{https://www.irdbb-medirad.com}SPECTCTCalibrationWorkflow"/>
     *         &lt;element name="PlanarCalibrationWorkflow" type="{https://www.irdbb-medirad.com}PlanarCalibrationWorkflow"/>
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
        "spectctCalibrationWorkflow",
        "planarCalibrationWorkflow"
    })
    public static class CalibrationWorkflow {

        @XmlElement(name = "SPECTCTCalibrationWorkflow", required = true)
        protected SPECTCTCalibrationWorkflow spectctCalibrationWorkflow;
        @XmlElement(name = "PlanarCalibrationWorkflow", required = true)
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
     *         &lt;element name="PlanarDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessing" maxOccurs="unbounded"/>
     *         &lt;element name="SPECTDataAcquisitionAndProcessing" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndProcessing"/>
     *         &lt;element name="HybridDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}HybridDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
     *         &lt;element name="HybridDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}HybridDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
     *         &lt;element name="RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" minOccurs="0"/>
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
        "planarDataAcquisitionAndProcessing",
        "spectDataAcquisitionAndProcessing",
        "hybridDosimetryViaAbsorbedDoseRateCalculation",
        "hybridDosimetryViaTimeActivityCurveFit",
        "radioBiologicalCalculationInHybridOr3DSlide2Dosimetry"
    })
    public static class HybridDosimetryworkflow {

        @XmlElement(name = "PlanarDataAcquisitionAndProcessing", required = true)
        protected List<PlanarDataAcquisitionAndProcessing> planarDataAcquisitionAndProcessing;
        @XmlElement(name = "SPECTDataAcquisitionAndProcessing", required = true)
        protected SPECTDataAcquisitionAndProcessing spectDataAcquisitionAndProcessing;
        @XmlElement(name = "HybridDosimetryViaAbsorbedDoseRateCalculation")
        protected HybridDosimetryViaAbsorbedDoseRateCalculation hybridDosimetryViaAbsorbedDoseRateCalculation;
        @XmlElement(name = "HybridDosimetryViaTimeActivityCurveFit")
        protected HybridDosimetryViaTimeActivityCurveFit hybridDosimetryViaTimeActivityCurveFit;
        @XmlElement(name = "RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry")
        protected RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry radioBiologicalCalculationInHybridOr3DSlide2Dosimetry;

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
         * Obtient la valeur de la propriété radioBiologicalCalculationInHybridOr3DSlide2Dosimetry.
         * 
         * @return
         *     possible object is
         *     {@link RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry }
         *     
         */
        public RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry getRadioBiologicalCalculationInHybridOr3DSlide2Dosimetry() {
            return radioBiologicalCalculationInHybridOr3DSlide2Dosimetry;
        }

        /**
         * Définit la valeur de la propriété radioBiologicalCalculationInHybridOr3DSlide2Dosimetry.
         * 
         * @param value
         *     allowed object is
         *     {@link RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry }
         *     
         */
        public void setRadioBiologicalCalculationInHybridOr3DSlide2Dosimetry(RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry value) {
            this.radioBiologicalCalculationInHybridOr3DSlide2Dosimetry = value;
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
     *         &lt;element name="SPECTDataAcquisitionAndReconstruction" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndReconstruction"/>
     *         &lt;element name="RegistrationVOISegmentationAndPropagation" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagation"/>
     *         &lt;element name="VOIActivityDetermination" type="{https://www.irdbb-medirad.com}VOIActivityDetermination"/>
     *         &lt;element name="TimeActivityCurveFitIn3DDosimetry" type="{https://www.irdbb-medirad.com}TimeActivityCurveFitIn3DDosimetry"/>
     *         &lt;element name="AbsorbedDoseCalculationInVOI" type="{https://www.irdbb-medirad.com}AbsorbedDoseCalculationInVOI"/>
     *         &lt;element name="RadioBiologicalCalculationIn3DSlide1Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationIn3DSlide1Dosimetry"/>
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
        "spectDataAcquisitionAndReconstruction",
        "registrationVOISegmentationAndPropagation",
        "voiActivityDetermination",
        "timeActivityCurveFitIn3DDosimetry",
        "absorbedDoseCalculationInVOI",
        "radioBiologicalCalculationIn3DSlide1Dosimetry"
    })
    public static class ThreeDimDosimetrySlide1Workflow {

        @XmlElement(name = "SPECTDataAcquisitionAndReconstruction", required = true)
        protected SPECTDataAcquisitionAndReconstruction spectDataAcquisitionAndReconstruction;
        @XmlElement(name = "RegistrationVOISegmentationAndPropagation", required = true)
        protected RegistrationVOISegmentationAndPropagation registrationVOISegmentationAndPropagation;
        @XmlElement(name = "VOIActivityDetermination", required = true)
        protected VOIActivityDetermination voiActivityDetermination;
        @XmlElement(name = "TimeActivityCurveFitIn3DDosimetry", required = true)
        protected TimeActivityCurveFitIn3DDosimetry timeActivityCurveFitIn3DDosimetry;
        @XmlElement(name = "AbsorbedDoseCalculationInVOI", required = true)
        protected AbsorbedDoseCalculationInVOI absorbedDoseCalculationInVOI;
        @XmlElement(name = "RadioBiologicalCalculationIn3DSlide1Dosimetry", required = true)
        protected RadioBiologicalCalculationIn3DSlide1Dosimetry radioBiologicalCalculationIn3DSlide1Dosimetry;

        /**
         * Obtient la valeur de la propriété spectDataAcquisitionAndReconstruction.
         * 
         * @return
         *     possible object is
         *     {@link SPECTDataAcquisitionAndReconstruction }
         *     
         */
        public SPECTDataAcquisitionAndReconstruction getSPECTDataAcquisitionAndReconstruction() {
            return spectDataAcquisitionAndReconstruction;
        }

        /**
         * Définit la valeur de la propriété spectDataAcquisitionAndReconstruction.
         * 
         * @param value
         *     allowed object is
         *     {@link SPECTDataAcquisitionAndReconstruction }
         *     
         */
        public void setSPECTDataAcquisitionAndReconstruction(SPECTDataAcquisitionAndReconstruction value) {
            this.spectDataAcquisitionAndReconstruction = value;
        }

        /**
         * Obtient la valeur de la propriété registrationVOISegmentationAndPropagation.
         * 
         * @return
         *     possible object is
         *     {@link RegistrationVOISegmentationAndPropagation }
         *     
         */
        public RegistrationVOISegmentationAndPropagation getRegistrationVOISegmentationAndPropagation() {
            return registrationVOISegmentationAndPropagation;
        }

        /**
         * Définit la valeur de la propriété registrationVOISegmentationAndPropagation.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrationVOISegmentationAndPropagation }
         *     
         */
        public void setRegistrationVOISegmentationAndPropagation(RegistrationVOISegmentationAndPropagation value) {
            this.registrationVOISegmentationAndPropagation = value;
        }

        /**
         * Obtient la valeur de la propriété voiActivityDetermination.
         * 
         * @return
         *     possible object is
         *     {@link VOIActivityDetermination }
         *     
         */
        public VOIActivityDetermination getVOIActivityDetermination() {
            return voiActivityDetermination;
        }

        /**
         * Définit la valeur de la propriété voiActivityDetermination.
         * 
         * @param value
         *     allowed object is
         *     {@link VOIActivityDetermination }
         *     
         */
        public void setVOIActivityDetermination(VOIActivityDetermination value) {
            this.voiActivityDetermination = value;
        }

        /**
         * Obtient la valeur de la propriété timeActivityCurveFitIn3DDosimetry.
         * 
         * @return
         *     possible object is
         *     {@link TimeActivityCurveFitIn3DDosimetry }
         *     
         */
        public TimeActivityCurveFitIn3DDosimetry getTimeActivityCurveFitIn3DDosimetry() {
            return timeActivityCurveFitIn3DDosimetry;
        }

        /**
         * Définit la valeur de la propriété timeActivityCurveFitIn3DDosimetry.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeActivityCurveFitIn3DDosimetry }
         *     
         */
        public void setTimeActivityCurveFitIn3DDosimetry(TimeActivityCurveFitIn3DDosimetry value) {
            this.timeActivityCurveFitIn3DDosimetry = value;
        }

        /**
         * Obtient la valeur de la propriété absorbedDoseCalculationInVOI.
         * 
         * @return
         *     possible object is
         *     {@link AbsorbedDoseCalculationInVOI }
         *     
         */
        public AbsorbedDoseCalculationInVOI getAbsorbedDoseCalculationInVOI() {
            return absorbedDoseCalculationInVOI;
        }

        /**
         * Définit la valeur de la propriété absorbedDoseCalculationInVOI.
         * 
         * @param value
         *     allowed object is
         *     {@link AbsorbedDoseCalculationInVOI }
         *     
         */
        public void setAbsorbedDoseCalculationInVOI(AbsorbedDoseCalculationInVOI value) {
            this.absorbedDoseCalculationInVOI = value;
        }

        /**
         * Obtient la valeur de la propriété radioBiologicalCalculationIn3DSlide1Dosimetry.
         * 
         * @return
         *     possible object is
         *     {@link RadioBiologicalCalculationIn3DSlide1Dosimetry }
         *     
         */
        public RadioBiologicalCalculationIn3DSlide1Dosimetry getRadioBiologicalCalculationIn3DSlide1Dosimetry() {
            return radioBiologicalCalculationIn3DSlide1Dosimetry;
        }

        /**
         * Définit la valeur de la propriété radioBiologicalCalculationIn3DSlide1Dosimetry.
         * 
         * @param value
         *     allowed object is
         *     {@link RadioBiologicalCalculationIn3DSlide1Dosimetry }
         *     
         */
        public void setRadioBiologicalCalculationIn3DSlide1Dosimetry(RadioBiologicalCalculationIn3DSlide1Dosimetry value) {
            this.radioBiologicalCalculationIn3DSlide1Dosimetry = value;
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
     *         &lt;element name="SPECTDataAcquisitionAndReconstruction" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndReconstruction" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation" maxOccurs="unbounded"/>
     *         &lt;element name="DoseRateCurveFitVOITimeIntegration" type="{https://www.irdbb-medirad.com}DoseRateCurveFitVOITimeIntegration"/>
     *         &lt;element name="RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry" minOccurs="0"/>
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
        "spectDataAcquisitionAndReconstruction",
        "voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation",
        "doseRateCurveFitVOITimeIntegration",
        "radioBiologicalCalculationInHybridOr3DSlide2Dosimetry"
    })
    public static class ThreeDimDosimetrySlide2Workflow {

        @XmlElement(name = "SPECTDataAcquisitionAndReconstruction")
        protected List<SPECTDataAcquisitionAndReconstruction> spectDataAcquisitionAndReconstruction;
        @XmlElement(name = "VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation", required = true)
        protected List<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation> voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation;
        @XmlElement(name = "DoseRateCurveFitVOITimeIntegration", required = true)
        protected DoseRateCurveFitVOITimeIntegration doseRateCurveFitVOITimeIntegration;
        @XmlElement(name = "RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry")
        protected RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry radioBiologicalCalculationInHybridOr3DSlide2Dosimetry;

        /**
         * Gets the value of the spectDataAcquisitionAndReconstruction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spectDataAcquisitionAndReconstruction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSPECTDataAcquisitionAndReconstruction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPECTDataAcquisitionAndReconstruction }
         * 
         * 
         */
        public List<SPECTDataAcquisitionAndReconstruction> getSPECTDataAcquisitionAndReconstruction() {
            if (spectDataAcquisitionAndReconstruction == null) {
                spectDataAcquisitionAndReconstruction = new ArrayList<SPECTDataAcquisitionAndReconstruction>();
            }
            return this.spectDataAcquisitionAndReconstruction;
        }

        /**
         * Gets the value of the voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation }
         * 
         * 
         */
        public List<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation> getVOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation() {
            if (voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation == null) {
                voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation = new ArrayList<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation>();
            }
            return this.voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation;
        }

        /**
         * Obtient la valeur de la propriété doseRateCurveFitVOITimeIntegration.
         * 
         * @return
         *     possible object is
         *     {@link DoseRateCurveFitVOITimeIntegration }
         *     
         */
        public DoseRateCurveFitVOITimeIntegration getDoseRateCurveFitVOITimeIntegration() {
            return doseRateCurveFitVOITimeIntegration;
        }

        /**
         * Définit la valeur de la propriété doseRateCurveFitVOITimeIntegration.
         * 
         * @param value
         *     allowed object is
         *     {@link DoseRateCurveFitVOITimeIntegration }
         *     
         */
        public void setDoseRateCurveFitVOITimeIntegration(DoseRateCurveFitVOITimeIntegration value) {
            this.doseRateCurveFitVOITimeIntegration = value;
        }

        /**
         * Obtient la valeur de la propriété radioBiologicalCalculationInHybridOr3DSlide2Dosimetry.
         * 
         * @return
         *     possible object is
         *     {@link RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry }
         *     
         */
        public RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry getRadioBiologicalCalculationInHybridOr3DSlide2Dosimetry() {
            return radioBiologicalCalculationInHybridOr3DSlide2Dosimetry;
        }

        /**
         * Définit la valeur de la propriété radioBiologicalCalculationInHybridOr3DSlide2Dosimetry.
         * 
         * @param value
         *     allowed object is
         *     {@link RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry }
         *     
         */
        public void setRadioBiologicalCalculationInHybridOr3DSlide2Dosimetry(RadioBiologicalCalculationInHybridOr3DSlide2Dosimetry value) {
            this.radioBiologicalCalculationInHybridOr3DSlide2Dosimetry = value;
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
     *         &lt;element name="PlanarDataAcquisitionAndProcessingContainer" type="{https://www.irdbb-medirad.com}PlanarDataAcquisitionAndProcessingContainer"/>
     *         &lt;element name="TwoDimDosimetryViaAbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaAbsorbedDoseRateCalculation" minOccurs="0"/>
     *         &lt;element name="TwoDimDosimetryViaTimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TwoDimDosimetryViaTimeActivityCurveFit" minOccurs="0"/>
     *         &lt;element name="RadioBiologicalCalculation" type="{https://www.irdbb-medirad.com}RadioBiologicalCalculation" minOccurs="0"/>
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
        "planarDataAcquisitionAndProcessingContainer",
        "twoDimDosimetryViaAbsorbedDoseRateCalculation",
        "twoDimDosimetryViaTimeActivityCurveFit",
        "radioBiologicalCalculation"
    })
    public static class TwoDimDosimetryworkflow {

        @XmlElement(name = "PlanarDataAcquisitionAndProcessingContainer", required = true)
        protected PlanarDataAcquisitionAndProcessingContainer planarDataAcquisitionAndProcessingContainer;
        @XmlElement(name = "TwoDimDosimetryViaAbsorbedDoseRateCalculation")
        protected TwoDimDosimetryViaAbsorbedDoseRateCalculation twoDimDosimetryViaAbsorbedDoseRateCalculation;
        @XmlElement(name = "TwoDimDosimetryViaTimeActivityCurveFit")
        protected TwoDimDosimetryViaTimeActivityCurveFit twoDimDosimetryViaTimeActivityCurveFit;
        @XmlElement(name = "RadioBiologicalCalculation")
        protected RadioBiologicalCalculation radioBiologicalCalculation;

        /**
         * Obtient la valeur de la propriété planarDataAcquisitionAndProcessingContainer.
         * 
         * @return
         *     possible object is
         *     {@link PlanarDataAcquisitionAndProcessingContainer }
         *     
         */
        public PlanarDataAcquisitionAndProcessingContainer getPlanarDataAcquisitionAndProcessingContainer() {
            return planarDataAcquisitionAndProcessingContainer;
        }

        /**
         * Définit la valeur de la propriété planarDataAcquisitionAndProcessingContainer.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanarDataAcquisitionAndProcessingContainer }
         *     
         */
        public void setPlanarDataAcquisitionAndProcessingContainer(PlanarDataAcquisitionAndProcessingContainer value) {
            this.planarDataAcquisitionAndProcessingContainer = value;
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
