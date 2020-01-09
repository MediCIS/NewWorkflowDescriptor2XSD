//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.11 à 04:46:08 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VOIActivityDetermination complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VOIActivityDetermination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="VOIContainer" type="{https://www.irdbb-medirad.com}VOIContainer"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPECTCalibrationFactorReferenceUsed" type="{https://www.irdbb-medirad.com}NMRelevantCalibrationReference"/>
 *         &lt;element name="SPECTRecoveryCoefficientCurveReferenceUsed" type="{https://www.irdbb-medirad.com}NMRelevantCalibrationReference"/>
 *         &lt;element name="DataActivityPerVOIAtTimePointContainer" type="{https://www.irdbb-medirad.com}DataActivityPerVOIAtTimePointContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VOIActivityDetermination", propOrder = {
    "processExecutionContext",
    "voiContainer",
    "timePointIdentifierUsed",
    "spectCalibrationFactorReferenceUsed",
    "spectRecoveryCoefficientCurveReferenceUsed",
    "dataActivityPerVOIAtTimePointContainer"
})
public class VOIActivityDetermination {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "VOIContainer", required = true)
    protected VOIContainer voiContainer;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "SPECTCalibrationFactorReferenceUsed", required = true)
    protected NMRelevantCalibrationReference spectCalibrationFactorReferenceUsed;
    @XmlElement(name = "SPECTRecoveryCoefficientCurveReferenceUsed", required = true)
    protected NMRelevantCalibrationReference spectRecoveryCoefficientCurveReferenceUsed;
    @XmlElement(name = "DataActivityPerVOIAtTimePointContainer", required = true)
    protected DataActivityPerVOIAtTimePointContainer dataActivityPerVOIAtTimePointContainer;

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
     * Obtient la valeur de la propriété voiContainer.
     * 
     * @return
     *     possible object is
     *     {@link VOIContainer }
     *     
     */
    public VOIContainer getVOIContainer() {
        return voiContainer;
    }

    /**
     * Définit la valeur de la propriété voiContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link VOIContainer }
     *     
     */
    public void setVOIContainer(VOIContainer value) {
        this.voiContainer = value;
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
     * Obtient la valeur de la propriété spectCalibrationFactorReferenceUsed.
     * 
     * @return
     *     possible object is
     *     {@link NMRelevantCalibrationReference }
     *     
     */
    public NMRelevantCalibrationReference getSPECTCalibrationFactorReferenceUsed() {
        return spectCalibrationFactorReferenceUsed;
    }

    /**
     * Définit la valeur de la propriété spectCalibrationFactorReferenceUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link NMRelevantCalibrationReference }
     *     
     */
    public void setSPECTCalibrationFactorReferenceUsed(NMRelevantCalibrationReference value) {
        this.spectCalibrationFactorReferenceUsed = value;
    }

    /**
     * Obtient la valeur de la propriété spectRecoveryCoefficientCurveReferenceUsed.
     * 
     * @return
     *     possible object is
     *     {@link NMRelevantCalibrationReference }
     *     
     */
    public NMRelevantCalibrationReference getSPECTRecoveryCoefficientCurveReferenceUsed() {
        return spectRecoveryCoefficientCurveReferenceUsed;
    }

    /**
     * Définit la valeur de la propriété spectRecoveryCoefficientCurveReferenceUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link NMRelevantCalibrationReference }
     *     
     */
    public void setSPECTRecoveryCoefficientCurveReferenceUsed(NMRelevantCalibrationReference value) {
        this.spectRecoveryCoefficientCurveReferenceUsed = value;
    }

    /**
     * Obtient la valeur de la propriété dataActivityPerVOIAtTimePointContainer.
     * 
     * @return
     *     possible object is
     *     {@link DataActivityPerVOIAtTimePointContainer }
     *     
     */
    public DataActivityPerVOIAtTimePointContainer getDataActivityPerVOIAtTimePointContainer() {
        return dataActivityPerVOIAtTimePointContainer;
    }

    /**
     * Définit la valeur de la propriété dataActivityPerVOIAtTimePointContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link DataActivityPerVOIAtTimePointContainer }
     *     
     */
    public void setDataActivityPerVOIAtTimePointContainer(DataActivityPerVOIAtTimePointContainer value) {
        this.dataActivityPerVOIAtTimePointContainer = value;
    }

}
