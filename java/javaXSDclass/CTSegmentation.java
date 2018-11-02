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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CTSegmentation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CTSegmentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="DICOMSeriesUIDNMTomoReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDCTReconUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentationMethodMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOIInCTProduced" type="{https://www.irdbb-medirad.com}VOIInCT" maxOccurs="unbounded"/>
 *         &lt;element name="VOIInSPECTProduced" type="{https://www.irdbb-medirad.com}VOIInSPECT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTSegmentation", propOrder = {
    "processExecutionContext",
    "dicomSeriesUIDNMTomoReconUsed",
    "dicomSeriesUIDCTReconUsed",
    "segmentationMethodMethodUsed",
    "voiInCTProduced",
    "voiInSPECTProduced"
})
public class CTSegmentation {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "DICOMSeriesUIDNMTomoReconUsed", required = true)
    protected String dicomSeriesUIDNMTomoReconUsed;
    @XmlElement(name = "DICOMSeriesUIDCTReconUsed", required = true)
    protected String dicomSeriesUIDCTReconUsed;
    @XmlElement(name = "SegmentationMethodMethodUsed", required = true)
    protected String segmentationMethodMethodUsed;
    @XmlElement(name = "VOIInCTProduced", required = true)
    protected List<VOIInCT> voiInCTProduced;
    @XmlElement(name = "VOIInSPECTProduced", required = true)
    protected List<VOIInSPECT> voiInSPECTProduced;

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
     * Obtient la valeur de la propriété dicomSeriesUIDNMTomoReconUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMSeriesUIDNMTomoReconUsed() {
        return dicomSeriesUIDNMTomoReconUsed;
    }

    /**
     * Définit la valeur de la propriété dicomSeriesUIDNMTomoReconUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMSeriesUIDNMTomoReconUsed(String value) {
        this.dicomSeriesUIDNMTomoReconUsed = value;
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
     * Obtient la valeur de la propriété segmentationMethodMethodUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentationMethodMethodUsed() {
        return segmentationMethodMethodUsed;
    }

    /**
     * Définit la valeur de la propriété segmentationMethodMethodUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentationMethodMethodUsed(String value) {
        this.segmentationMethodMethodUsed = value;
    }

    /**
     * Gets the value of the voiInCTProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiInCTProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIInCTProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIInCT }
     * 
     * 
     */
    public List<VOIInCT> getVOIInCTProduced() {
        if (voiInCTProduced == null) {
            voiInCTProduced = new ArrayList<VOIInCT>();
        }
        return this.voiInCTProduced;
    }

    /**
     * Gets the value of the voiInSPECTProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiInSPECTProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIInSPECTProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIInSPECT }
     * 
     * 
     */
    public List<VOIInSPECT> getVOIInSPECTProduced() {
        if (voiInSPECTProduced == null) {
            voiInSPECTProduced = new ArrayList<VOIInSPECT>();
        }
        return this.voiInSPECTProduced;
    }

}
