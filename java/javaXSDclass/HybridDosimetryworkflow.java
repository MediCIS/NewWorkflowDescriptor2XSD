//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.02 à 11:16:14 AM CET 
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
@XmlRootElement(name = "HybridDosimetryworkflow")
public class HybridDosimetryworkflow {

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
