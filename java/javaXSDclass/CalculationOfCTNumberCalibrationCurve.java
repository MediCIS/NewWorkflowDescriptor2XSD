//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.02 à 11:16:14 AM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CalculationOfCTNumberCalibrationCurve complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalculationOfCTNumberCalibrationCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="DICOMSeriesUIDCTReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CTNumberCalibrationCurveProduced" type="{https://www.irdbb-medirad.com}CTNumberCalibrationCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationOfCTNumberCalibrationCurve", propOrder = {
    "processExecutionContext",
    "dicomSeriesUIDCTReconUsed",
    "ctNumberCalibrationCurveProduced"
})
public class CalculationOfCTNumberCalibrationCurve {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "DICOMSeriesUIDCTReconUsed", required = true)
    protected String dicomSeriesUIDCTReconUsed;
    @XmlElement(name = "CTNumberCalibrationCurveProduced", required = true)
    protected CTNumberCalibrationCurve ctNumberCalibrationCurveProduced;

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
     * Obtient la valeur de la propriété ctNumberCalibrationCurveProduced.
     * 
     * @return
     *     possible object is
     *     {@link CTNumberCalibrationCurve }
     *     
     */
    public CTNumberCalibrationCurve getCTNumberCalibrationCurveProduced() {
        return ctNumberCalibrationCurveProduced;
    }

    /**
     * Définit la valeur de la propriété ctNumberCalibrationCurveProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNumberCalibrationCurve }
     *     
     */
    public void setCTNumberCalibrationCurveProduced(CTNumberCalibrationCurve value) {
        this.ctNumberCalibrationCurveProduced = value;
    }

}