//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.10.31 à 05:12:11 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SPECTReconstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SPECTReconstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDNMTomoUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDCTReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReconstructionMethodAndCorrectionsUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CalibrationFactorUsed" type="{https://www.irdbb-medirad.com}CalibrationFactor"/>
 *         &lt;element name="NMTomoReconProduced" type="{https://www.irdbb-medirad.com}DICOMData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPECTReconstruction", propOrder = {
    "processExecutionContext",
    "timePointIdentifierUsed",
    "dicomSeriesUIDNMTomoUsed",
    "dicomSeriesUIDCTReconUsed",
    "reconstructionMethodAndCorrectionsUsed",
    "calibrationFactorUsed",
    "nmTomoReconProduced"
})
public class SPECTReconstruction {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "DICOMSeriesUIDNMTomoUsed", required = true)
    protected String dicomSeriesUIDNMTomoUsed;
    @XmlElement(name = "DICOMSeriesUIDCTReconUsed", required = true)
    protected String dicomSeriesUIDCTReconUsed;
    @XmlElement(name = "ReconstructionMethodAndCorrectionsUsed", required = true)
    protected String reconstructionMethodAndCorrectionsUsed;
    @XmlElement(name = "CalibrationFactorUsed", required = true)
    protected CalibrationFactor calibrationFactorUsed;
    @XmlElement(name = "NMTomoReconProduced", required = true)
    protected DICOMData nmTomoReconProduced;

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
     * Obtient la valeur de la propriété dicomSeriesUIDNMTomoUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMSeriesUIDNMTomoUsed() {
        return dicomSeriesUIDNMTomoUsed;
    }

    /**
     * Définit la valeur de la propriété dicomSeriesUIDNMTomoUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMSeriesUIDNMTomoUsed(String value) {
        this.dicomSeriesUIDNMTomoUsed = value;
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
     * Obtient la valeur de la propriété reconstructionMethodAndCorrectionsUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconstructionMethodAndCorrectionsUsed() {
        return reconstructionMethodAndCorrectionsUsed;
    }

    /**
     * Définit la valeur de la propriété reconstructionMethodAndCorrectionsUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconstructionMethodAndCorrectionsUsed(String value) {
        this.reconstructionMethodAndCorrectionsUsed = value;
    }

    /**
     * Obtient la valeur de la propriété calibrationFactorUsed.
     * 
     * @return
     *     possible object is
     *     {@link CalibrationFactor }
     *     
     */
    public CalibrationFactor getCalibrationFactorUsed() {
        return calibrationFactorUsed;
    }

    /**
     * Définit la valeur de la propriété calibrationFactorUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link CalibrationFactor }
     *     
     */
    public void setCalibrationFactorUsed(CalibrationFactor value) {
        this.calibrationFactorUsed = value;
    }

    /**
     * Obtient la valeur de la propriété nmTomoReconProduced.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getNMTomoReconProduced() {
        return nmTomoReconProduced;
    }

    /**
     * Définit la valeur de la propriété nmTomoReconProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setNMTomoReconProduced(DICOMData value) {
        this.nmTomoReconProduced = value;
    }

}