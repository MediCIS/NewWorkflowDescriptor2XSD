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
 * <p>Classe Java pour PlanarDataSegmentationWithoutRegistration complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PlanarDataSegmentationWithoutRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDNMStaticCorrectedUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentationMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountsPerROIAtTimePointProduced" type="{https://www.irdbb-medirad.com}CountsPerROIAtTimePoint" maxOccurs="unbounded"/>
 *         &lt;element name="ROIProduced" type="{https://www.irdbb-medirad.com}ROI" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanarDataSegmentationWithoutRegistration", propOrder = {
    "processExecutionContext",
    "timePointIdentifierUsed",
    "dicomSeriesUIDNMStaticCorrectedUsed",
    "segmentationMethodUsed",
    "countsPerROIAtTimePointProduced",
    "roiProduced"
})
public class PlanarDataSegmentationWithoutRegistration {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "DICOMSeriesUIDNMStaticCorrectedUsed", required = true)
    protected String dicomSeriesUIDNMStaticCorrectedUsed;
    @XmlElement(name = "SegmentationMethodUsed", required = true)
    protected String segmentationMethodUsed;
    @XmlElement(name = "CountsPerROIAtTimePointProduced", required = true)
    protected List<CountsPerROIAtTimePoint> countsPerROIAtTimePointProduced;
    @XmlElement(name = "ROIProduced", required = true)
    protected List<ROI> roiProduced;

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
     * Obtient la valeur de la propriété dicomSeriesUIDNMStaticCorrectedUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMSeriesUIDNMStaticCorrectedUsed() {
        return dicomSeriesUIDNMStaticCorrectedUsed;
    }

    /**
     * Définit la valeur de la propriété dicomSeriesUIDNMStaticCorrectedUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMSeriesUIDNMStaticCorrectedUsed(String value) {
        this.dicomSeriesUIDNMStaticCorrectedUsed = value;
    }

    /**
     * Obtient la valeur de la propriété segmentationMethodUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentationMethodUsed() {
        return segmentationMethodUsed;
    }

    /**
     * Définit la valeur de la propriété segmentationMethodUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentationMethodUsed(String value) {
        this.segmentationMethodUsed = value;
    }

    /**
     * Gets the value of the countsPerROIAtTimePointProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countsPerROIAtTimePointProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountsPerROIAtTimePointProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountsPerROIAtTimePoint }
     * 
     * 
     */
    public List<CountsPerROIAtTimePoint> getCountsPerROIAtTimePointProduced() {
        if (countsPerROIAtTimePointProduced == null) {
            countsPerROIAtTimePointProduced = new ArrayList<CountsPerROIAtTimePoint>();
        }
        return this.countsPerROIAtTimePointProduced;
    }

    /**
     * Gets the value of the roiProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roiProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROIProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROI }
     * 
     * 
     */
    public List<ROI> getROIProduced() {
        if (roiProduced == null) {
            roiProduced = new ArrayList<ROI>();
        }
        return this.roiProduced;
    }

}
