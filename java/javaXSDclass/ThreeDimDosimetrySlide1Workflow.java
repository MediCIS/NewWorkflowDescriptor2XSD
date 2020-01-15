//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.15 à 03:15:48 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ThreeDimDosimetrySlide1workflow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ThreeDimDosimetrySlide1workflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPECTDataAcquisitionAndReconstruction" type="{https://www.irdbb-medirad.com}SPECTDataAcquisitionAndReconstruction"/>
 *         &lt;element name="RegistrationVOISegmentationAndPropagationContainer" type="{https://www.irdbb-medirad.com}RegistrationVOISegmentationAndPropagationContainer"/>
 *         &lt;element name="VOIActivityDeterminationContainer" type="{https://www.irdbb-medirad.com}VOIActivityDeterminationContainer"/>
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
@XmlType(name = "ThreeDimDosimetrySlide1workflow", propOrder = {
    "spectDataAcquisitionAndReconstruction",
    "registrationVOISegmentationAndPropagationContainer",
    "voiActivityDeterminationContainer",
    "timeActivityCurveFitIn3DDosimetry",
    "absorbedDoseCalculationInVOI",
    "radioBiologicalCalculationIn3DSlide1Dosimetry"
})
public class ThreeDimDosimetrySlide1Workflow {

    @XmlElement(name = "SPECTDataAcquisitionAndReconstruction", required = true)
    protected SPECTDataAcquisitionAndReconstruction spectDataAcquisitionAndReconstruction;
    @XmlElement(name = "RegistrationVOISegmentationAndPropagationContainer", required = true)
    protected RegistrationVOISegmentationAndPropagationContainer registrationVOISegmentationAndPropagationContainer;
    @XmlElement(name = "VOIActivityDeterminationContainer", required = true)
    protected VOIActivityDeterminationContainer voiActivityDeterminationContainer;
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
     * Obtient la valeur de la propriété registrationVOISegmentationAndPropagationContainer.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationVOISegmentationAndPropagationContainer }
     *     
     */
    public RegistrationVOISegmentationAndPropagationContainer getRegistrationVOISegmentationAndPropagationContainer() {
        return registrationVOISegmentationAndPropagationContainer;
    }

    /**
     * Définit la valeur de la propriété registrationVOISegmentationAndPropagationContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationVOISegmentationAndPropagationContainer }
     *     
     */
    public void setRegistrationVOISegmentationAndPropagationContainer(RegistrationVOISegmentationAndPropagationContainer value) {
        this.registrationVOISegmentationAndPropagationContainer = value;
    }

    /**
     * Obtient la valeur de la propriété voiActivityDeterminationContainer.
     * 
     * @return
     *     possible object is
     *     {@link VOIActivityDeterminationContainer }
     *     
     */
    public VOIActivityDeterminationContainer getVOIActivityDeterminationContainer() {
        return voiActivityDeterminationContainer;
    }

    /**
     * Définit la valeur de la propriété voiActivityDeterminationContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link VOIActivityDeterminationContainer }
     *     
     */
    public void setVOIActivityDeterminationContainer(VOIActivityDeterminationContainer value) {
        this.voiActivityDeterminationContainer = value;
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
