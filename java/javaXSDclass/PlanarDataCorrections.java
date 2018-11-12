//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.12 à 05:36:08 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PlanarDataCorrections complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PlanarDataCorrections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDNMStaticUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrectionsUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NMStaticCorrectedProduced" type="{https://www.irdbb-medirad.com}DICOMData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanarDataCorrections", propOrder = {
    "processExecutionContext",
    "timePointIdentifierUsed",
    "dicomSeriesUIDNMStaticUsed",
    "correctionsUsed",
    "nmStaticCorrectedProduced"
})
public class PlanarDataCorrections {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "DICOMSeriesUIDNMStaticUsed", required = true)
    protected String dicomSeriesUIDNMStaticUsed;
    @XmlElement(name = "CorrectionsUsed", required = true)
    protected String correctionsUsed;
    @XmlElement(name = "NMStaticCorrectedProduced", required = true)
    protected DICOMData nmStaticCorrectedProduced;

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
     * Obtient la valeur de la propriété dicomSeriesUIDNMStaticUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMSeriesUIDNMStaticUsed() {
        return dicomSeriesUIDNMStaticUsed;
    }

    /**
     * Définit la valeur de la propriété dicomSeriesUIDNMStaticUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMSeriesUIDNMStaticUsed(String value) {
        this.dicomSeriesUIDNMStaticUsed = value;
    }

    /**
     * Obtient la valeur de la propriété correctionsUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionsUsed() {
        return correctionsUsed;
    }

    /**
     * Définit la valeur de la propriété correctionsUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionsUsed(String value) {
        this.correctionsUsed = value;
    }

    /**
     * Obtient la valeur de la propriété nmStaticCorrectedProduced.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getNMStaticCorrectedProduced() {
        return nmStaticCorrectedProduced;
    }

    /**
     * Définit la valeur de la propriété nmStaticCorrectedProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setNMStaticCorrectedProduced(DICOMData value) {
        this.nmStaticCorrectedProduced = value;
    }

}
