//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.14 à 12:22:41 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ThreeDimDosimetrySlide2workflow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ThreeDimDosimetrySlide2workflow">
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
@XmlType(name = "ThreeDimDosimetrySlide2workflow", propOrder = {
    "spectDataAcquisitionAndReconstruction",
    "voiSegmentationEnergyDepositionCalculationAbsorbedDoseRateCalculation",
    "doseRateCurveFitVOITimeIntegration",
    "radioBiologicalCalculationInHybridOr3DSlide2Dosimetry"
})
public class ThreeDimDosimetrySlide2Workflow {

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
