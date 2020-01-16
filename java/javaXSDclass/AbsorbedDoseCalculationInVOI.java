//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.16 à 05:10:16 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbsorbedDoseCalculationInVOI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbsorbedDoseCalculationInVOI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="SegmentationIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CTReconResampledOnCommonReferenceUsed" type="{https://www.irdbb-medirad.com}DICOMDataContainer"/>
 *         &lt;element name="NMTomoReconResampledOnCommonReferenceUsed" type="{https://www.irdbb-medirad.com}DICOMDataContainer"/>
 *         &lt;element name="AbsorbedDoseCalculationMethodUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VoxelAbsorbedDoseMapProduced" type="{https://www.irdbb-medirad.com}NonDICOMDataContainer" minOccurs="0"/>
 *         &lt;element name="DensityImageUsed" type="{https://www.irdbb-medirad.com}NonDICOMDataContainer" minOccurs="0"/>
 *         &lt;element name="ActivityMapImageUsed" type="{https://www.irdbb-medirad.com}NonDICOMDataContainer" minOccurs="0"/>
 *         &lt;element name="AbsorbedDoseInVOIContainer" type="{https://www.irdbb-medirad.com}AbsorbedDoseInVOIContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsorbedDoseCalculationInVOI", propOrder = {
    "processExecutionContext",
    "segmentationIdentifierUsed",
    "ctReconResampledOnCommonReferenceUsed",
    "nmTomoReconResampledOnCommonReferenceUsed",
    "absorbedDoseCalculationMethodUsed",
    "voxelAbsorbedDoseMapProduced",
    "densityImageUsed",
    "activityMapImageUsed",
    "absorbedDoseInVOIContainer"
})
public class AbsorbedDoseCalculationInVOI {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "SegmentationIdentifierUsed", required = true)
    protected String segmentationIdentifierUsed;
    @XmlElement(name = "CTReconResampledOnCommonReferenceUsed", required = true)
    protected DICOMDataContainer ctReconResampledOnCommonReferenceUsed;
    @XmlElement(name = "NMTomoReconResampledOnCommonReferenceUsed", required = true)
    protected DICOMDataContainer nmTomoReconResampledOnCommonReferenceUsed;
    @XmlElement(name = "AbsorbedDoseCalculationMethodUsed", required = true)
    protected String absorbedDoseCalculationMethodUsed;
    @XmlElement(name = "VoxelAbsorbedDoseMapProduced")
    protected NonDICOMDataContainer voxelAbsorbedDoseMapProduced;
    @XmlElement(name = "DensityImageUsed")
    protected NonDICOMDataContainer densityImageUsed;
    @XmlElement(name = "ActivityMapImageUsed")
    protected NonDICOMDataContainer activityMapImageUsed;
    @XmlElement(name = "AbsorbedDoseInVOIContainer")
    protected AbsorbedDoseInVOIContainer absorbedDoseInVOIContainer;

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
     * Obtient la valeur de la propriété segmentationIdentifierUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentationIdentifierUsed() {
        return segmentationIdentifierUsed;
    }

    /**
     * Définit la valeur de la propriété segmentationIdentifierUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentationIdentifierUsed(String value) {
        this.segmentationIdentifierUsed = value;
    }

    /**
     * Obtient la valeur de la propriété ctReconResampledOnCommonReferenceUsed.
     * 
     * @return
     *     possible object is
     *     {@link DICOMDataContainer }
     *     
     */
    public DICOMDataContainer getCTReconResampledOnCommonReferenceUsed() {
        return ctReconResampledOnCommonReferenceUsed;
    }

    /**
     * Définit la valeur de la propriété ctReconResampledOnCommonReferenceUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMDataContainer }
     *     
     */
    public void setCTReconResampledOnCommonReferenceUsed(DICOMDataContainer value) {
        this.ctReconResampledOnCommonReferenceUsed = value;
    }

    /**
     * Obtient la valeur de la propriété nmTomoReconResampledOnCommonReferenceUsed.
     * 
     * @return
     *     possible object is
     *     {@link DICOMDataContainer }
     *     
     */
    public DICOMDataContainer getNMTomoReconResampledOnCommonReferenceUsed() {
        return nmTomoReconResampledOnCommonReferenceUsed;
    }

    /**
     * Définit la valeur de la propriété nmTomoReconResampledOnCommonReferenceUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMDataContainer }
     *     
     */
    public void setNMTomoReconResampledOnCommonReferenceUsed(DICOMDataContainer value) {
        this.nmTomoReconResampledOnCommonReferenceUsed = value;
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
     * Obtient la valeur de la propriété voxelAbsorbedDoseMapProduced.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public NonDICOMDataContainer getVoxelAbsorbedDoseMapProduced() {
        return voxelAbsorbedDoseMapProduced;
    }

    /**
     * Définit la valeur de la propriété voxelAbsorbedDoseMapProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public void setVoxelAbsorbedDoseMapProduced(NonDICOMDataContainer value) {
        this.voxelAbsorbedDoseMapProduced = value;
    }

    /**
     * Obtient la valeur de la propriété densityImageUsed.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public NonDICOMDataContainer getDensityImageUsed() {
        return densityImageUsed;
    }

    /**
     * Définit la valeur de la propriété densityImageUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public void setDensityImageUsed(NonDICOMDataContainer value) {
        this.densityImageUsed = value;
    }

    /**
     * Obtient la valeur de la propriété activityMapImageUsed.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public NonDICOMDataContainer getActivityMapImageUsed() {
        return activityMapImageUsed;
    }

    /**
     * Définit la valeur de la propriété activityMapImageUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public void setActivityMapImageUsed(NonDICOMDataContainer value) {
        this.activityMapImageUsed = value;
    }

    /**
     * Obtient la valeur de la propriété absorbedDoseInVOIContainer.
     * 
     * @return
     *     possible object is
     *     {@link AbsorbedDoseInVOIContainer }
     *     
     */
    public AbsorbedDoseInVOIContainer getAbsorbedDoseInVOIContainer() {
        return absorbedDoseInVOIContainer;
    }

    /**
     * Définit la valeur de la propriété absorbedDoseInVOIContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsorbedDoseInVOIContainer }
     *     
     */
    public void setAbsorbedDoseInVOIContainer(AbsorbedDoseInVOIContainer value) {
        this.absorbedDoseInVOIContainer = value;
    }

}
