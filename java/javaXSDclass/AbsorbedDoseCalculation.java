//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.07 à 02:11:03 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbsorbedDoseCalculation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbsorbedDoseCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="VOIIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="DICOMSeriesUIDCTReconResampledOnCommonReferenceUsed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="DICOMSeriesUIDNMTomoReconResampledOnCommonReferenceUsed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="AbsorbedDoseCalculationMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeanAbsorbedDoseInVOIProduced" type="{https://www.irdbb-medirad.com}MeanAbsorbedDoseInVOI" maxOccurs="unbounded"/>
 *         &lt;element name="VoxelAbsorbedDoseMapProduced" type="{https://www.irdbb-medirad.com}NonDICOMData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsorbedDoseCalculation", propOrder = {
    "processExecutionContext",
    "voiIdentifierUsed",
    "dicomSeriesUIDCTReconResampledOnCommonReferenceUsed",
    "dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed",
    "absorbedDoseCalculationMethodUsed",
    "meanAbsorbedDoseInVOIProduced",
    "voxelAbsorbedDoseMapProduced"
})
public class AbsorbedDoseCalculation {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "VOIIdentifierUsed", required = true)
    protected List<String> voiIdentifierUsed;
    @XmlElement(name = "DICOMSeriesUIDCTReconResampledOnCommonReferenceUsed", required = true)
    protected List<String> dicomSeriesUIDCTReconResampledOnCommonReferenceUsed;
    @XmlElement(name = "DICOMSeriesUIDNMTomoReconResampledOnCommonReferenceUsed", required = true)
    protected List<String> dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed;
    @XmlElement(name = "AbsorbedDoseCalculationMethodUsed", required = true)
    protected String absorbedDoseCalculationMethodUsed;
    @XmlElement(name = "MeanAbsorbedDoseInVOIProduced", required = true)
    protected List<MeanAbsorbedDoseInVOI> meanAbsorbedDoseInVOIProduced;
    @XmlElement(name = "VoxelAbsorbedDoseMapProduced")
    protected List<NonDICOMData> voxelAbsorbedDoseMapProduced;

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
     * Gets the value of the voiIdentifierUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiIdentifierUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIIdentifierUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVOIIdentifierUsed() {
        if (voiIdentifierUsed == null) {
            voiIdentifierUsed = new ArrayList<String>();
        }
        return this.voiIdentifierUsed;
    }

    /**
     * Gets the value of the dicomSeriesUIDCTReconResampledOnCommonReferenceUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dicomSeriesUIDCTReconResampledOnCommonReferenceUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDICOMSeriesUIDCTReconResampledOnCommonReferenceUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDICOMSeriesUIDCTReconResampledOnCommonReferenceUsed() {
        if (dicomSeriesUIDCTReconResampledOnCommonReferenceUsed == null) {
            dicomSeriesUIDCTReconResampledOnCommonReferenceUsed = new ArrayList<String>();
        }
        return this.dicomSeriesUIDCTReconResampledOnCommonReferenceUsed;
    }

    /**
     * Gets the value of the dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDICOMSeriesUIDNMTomoReconResampledOnCommonReferenceUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDICOMSeriesUIDNMTomoReconResampledOnCommonReferenceUsed() {
        if (dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed == null) {
            dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed = new ArrayList<String>();
        }
        return this.dicomSeriesUIDNMTomoReconResampledOnCommonReferenceUsed;
    }

    /**
     * Obtient la valeur de la propriété absorbedDoseCalculationMethodUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsorbedDoseCalculationMethodUsed() {
        return absorbedDoseCalculationMethodUsed;
    }

    /**
     * Définit la valeur de la propriété absorbedDoseCalculationMethodUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsorbedDoseCalculationMethodUsed(String value) {
        this.absorbedDoseCalculationMethodUsed = value;
    }

    /**
     * Gets the value of the meanAbsorbedDoseInVOIProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meanAbsorbedDoseInVOIProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeanAbsorbedDoseInVOIProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeanAbsorbedDoseInVOI }
     * 
     * 
     */
    public List<MeanAbsorbedDoseInVOI> getMeanAbsorbedDoseInVOIProduced() {
        if (meanAbsorbedDoseInVOIProduced == null) {
            meanAbsorbedDoseInVOIProduced = new ArrayList<MeanAbsorbedDoseInVOI>();
        }
        return this.meanAbsorbedDoseInVOIProduced;
    }

    /**
     * Gets the value of the voxelAbsorbedDoseMapProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voxelAbsorbedDoseMapProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoxelAbsorbedDoseMapProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDICOMData }
     * 
     * 
     */
    public List<NonDICOMData> getVoxelAbsorbedDoseMapProduced() {
        if (voxelAbsorbedDoseMapProduced == null) {
            voxelAbsorbedDoseMapProduced = new ArrayList<NonDICOMData>();
        }
        return this.voxelAbsorbedDoseMapProduced;
    }

}
