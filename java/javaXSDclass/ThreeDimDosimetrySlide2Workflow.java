//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.10.31 à 05:12:11 PM CET 
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
    "patientId",
    "patientName",
    "clinicalResearchStudyId",
    "spectDataAcquisitionAndProcessing",
    "voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation",
    "doseRateCurveFitVOITimeIntegration",
    "radioBiologicalCalculation"
})
@XmlRootElement(name = "ThreeDimDosimetrySlide2workflow")
public class ThreeDimDosimetrySlide2Workflow {

    @XmlElement(name = "PatientId", required = true)
    protected String patientId;
    @XmlElement(name = "PatientName", required = true)
    protected String patientName;
    @XmlElement(name = "ClinicalResearchStudyId", required = true)
    protected String clinicalResearchStudyId;
    @XmlElement(name = "SPECTDataAcquisitionAndProcessing", required = true)
    protected List<SPECTDataAcquisitionAndProcessing> spectDataAcquisitionAndProcessing;
    @XmlElement(name = "VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation", required = true)
    protected List<VOISegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation> voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation;
    @XmlElement(name = "DoseRateCurveFitVOITimeIntegration", required = true)
    protected DoseRateCurveFitVOITimeIntegration doseRateCurveFitVOITimeIntegration;
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
     * Gets the value of the spectDataAcquisitionAndProcessing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectDataAcquisitionAndProcessing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPECTDataAcquisitionAndProcessing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPECTDataAcquisitionAndProcessing }
     * 
     * 
     */
    public List<SPECTDataAcquisitionAndProcessing> getSPECTDataAcquisitionAndProcessing() {
        if (spectDataAcquisitionAndProcessing == null) {
            spectDataAcquisitionAndProcessing = new ArrayList<SPECTDataAcquisitionAndProcessing>();
        }
        return this.spectDataAcquisitionAndProcessing;
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
