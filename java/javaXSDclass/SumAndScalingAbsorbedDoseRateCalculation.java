//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.08 à 10:03:35 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SumAndScalingAbsorbedDoseRateCalculation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SumAndScalingAbsorbedDoseRateCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="VOIIdentifierUsed" type="{https://www.irdbb-medirad.com}VOIidentifierContainer"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOIUsed" type="{https://www.irdbb-medirad.com}VOIContainer"/>
 *         &lt;element name="ThreeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AbsorbedDoseRatePerVOIAtTimePointProduced" type="{https://www.irdbb-medirad.com}AbsorbedDoseRatePerVOIAtTimePointContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumAndScalingAbsorbedDoseRateCalculation", propOrder = {
    "processExecutionContext",
    "voiIdentifierUsed",
    "timePointIdentifierUsed",
    "voiUsed",
    "threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed",
    "absorbedDoseRatePerVOIAtTimePointProduced"
})
public class SumAndScalingAbsorbedDoseRateCalculation {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "VOIIdentifierUsed", required = true)
    protected VOIidentifierContainer voiIdentifierUsed;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "VOIUsed", required = true)
    protected VOIContainer voiUsed;
    @XmlElement(name = "ThreeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed", required = true)
    protected String threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed;
    @XmlElement(name = "AbsorbedDoseRatePerVOIAtTimePointProduced", required = true)
    protected AbsorbedDoseRatePerVOIAtTimePointContainer absorbedDoseRatePerVOIAtTimePointProduced;

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
     * Obtient la valeur de la propriété voiIdentifierUsed.
     * 
     * @return
     *     possible object is
     *     {@link VOIidentifierContainer }
     *     
     */
    public VOIidentifierContainer getVOIIdentifierUsed() {
        return voiIdentifierUsed;
    }

    /**
     * Définit la valeur de la propriété voiIdentifierUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link VOIidentifierContainer }
     *     
     */
    public void setVOIIdentifierUsed(VOIidentifierContainer value) {
        this.voiIdentifierUsed = value;
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
     * Obtient la valeur de la propriété voiUsed.
     * 
     * @return
     *     possible object is
     *     {@link VOIContainer }
     *     
     */
    public VOIContainer getVOIUsed() {
        return voiUsed;
    }

    /**
     * Définit la valeur de la propriété voiUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link VOIContainer }
     *     
     */
    public void setVOIUsed(VOIContainer value) {
        this.voiUsed = value;
    }

    /**
     * Obtient la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed() {
        return threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed;
    }

    /**
     * Définit la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed(String value) {
        this.threeDimEnergyDepositionRateMatrixAtTimePointIdentifierUsed = value;
    }

    /**
     * Obtient la valeur de la propriété absorbedDoseRatePerVOIAtTimePointProduced.
     * 
     * @return
     *     possible object is
     *     {@link AbsorbedDoseRatePerVOIAtTimePointContainer }
     *     
     */
    public AbsorbedDoseRatePerVOIAtTimePointContainer getAbsorbedDoseRatePerVOIAtTimePointProduced() {
        return absorbedDoseRatePerVOIAtTimePointProduced;
    }

    /**
     * Définit la valeur de la propriété absorbedDoseRatePerVOIAtTimePointProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsorbedDoseRatePerVOIAtTimePointContainer }
     *     
     */
    public void setAbsorbedDoseRatePerVOIAtTimePointProduced(AbsorbedDoseRatePerVOIAtTimePointContainer value) {
        this.absorbedDoseRatePerVOIAtTimePointProduced = value;
    }

}
