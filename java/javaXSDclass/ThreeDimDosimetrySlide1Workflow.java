//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.02 à 11:16:13 AM CET 
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
 *         &lt;element name="RegistrationVOISegmentationAndPropagation" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagation"/>
 *         &lt;element name="VOIActivityDetermination" type="{https://www.irdbb-medirad.com}VOIActivityDetermination" maxOccurs="unbounded"/>
 *         &lt;element name="TimeActivityCurveFit" type="{https://www.irdbb-medirad.com}TimeActivityCurveFit" maxOccurs="unbounded"/>
 *         &lt;element name="AbsorbedDoseCalculation" type="{https://www.irdbb-medirad.com}AbsorbedDoseCalculation"/>
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
    "registrationVOISegmentationAndPropagation",
    "voiActivityDetermination",
    "timeActivityCurveFit",
    "absorbedDoseCalculation",
    "radioBiologicalCalculation"
})
@XmlRootElement(name = "ThreeDimDosimetrySlide1workflow")
public class ThreeDimDosimetrySlide1Workflow {

    @XmlElement(name = "PatientId", required = true)
    protected String patientId;
    @XmlElement(name = "PatientName", required = true)
    protected String patientName;
    @XmlElement(name = "ClinicalResearchStudyId", required = true)
    protected String clinicalResearchStudyId;
    @XmlElement(name = "SPECTDataAcquisitionAndProcessing", required = true)
    protected List<SPECTDataAcquisitionAndProcessing> spectDataAcquisitionAndProcessing;
    @XmlElement(name = "RegistrationVOISegmentationAndPropagation", required = true)
    protected RegistrationVOISegmentationAndPropagation registrationVOISegmentationAndPropagation;
    @XmlElement(name = "VOIActivityDetermination", required = true)
    protected List<VOIActivityDetermination> voiActivityDetermination;
    @XmlElement(name = "TimeActivityCurveFit", required = true)
    protected List<TimeActivityCurveFit> timeActivityCurveFit;
    @XmlElement(name = "AbsorbedDoseCalculation", required = true)
    protected AbsorbedDoseCalculation absorbedDoseCalculation;
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
     * Gets the value of the voiActivityDetermination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiActivityDetermination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIActivityDetermination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIActivityDetermination }
     * 
     * 
     */
    public List<VOIActivityDetermination> getVOIActivityDetermination() {
        if (voiActivityDetermination == null) {
            voiActivityDetermination = new ArrayList<VOIActivityDetermination>();
        }
        return this.voiActivityDetermination;
    }

    /**
     * Gets the value of the timeActivityCurveFit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeActivityCurveFit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeActivityCurveFit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeActivityCurveFit }
     * 
     * 
     */
    public List<TimeActivityCurveFit> getTimeActivityCurveFit() {
        if (timeActivityCurveFit == null) {
            timeActivityCurveFit = new ArrayList<TimeActivityCurveFit>();
        }
        return this.timeActivityCurveFit;
    }

    /**
     * Obtient la valeur de la propriété absorbedDoseCalculation.
     * 
     * @return
     *     possible object is
     *     {@link AbsorbedDoseCalculation }
     *     
     */
    public AbsorbedDoseCalculation getAbsorbedDoseCalculation() {
        return absorbedDoseCalculation;
    }

    /**
     * Définit la valeur de la propriété absorbedDoseCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsorbedDoseCalculation }
     *     
     */
    public void setAbsorbedDoseCalculation(AbsorbedDoseCalculation value) {
        this.absorbedDoseCalculation = value;
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
