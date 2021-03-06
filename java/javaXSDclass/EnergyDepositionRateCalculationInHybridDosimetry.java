//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.27 à 05:04:20 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnergyDepositionRateCalculationInHybridDosimetry complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnergyDepositionRateCalculationInHybridDosimetry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="TimePointIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VoxelDataActivityAtTimePointIdentifier" type="{https://www.irdbb-medirad.com}DICOMData" minOccurs="0"/>
 *         &lt;element name="NonDicomVoxelDataActivityAtTimePointIdentifier" type="{https://www.irdbb-medirad.com}NonDICOMData" minOccurs="0"/>
 *         &lt;element name="CTReconResampledOnSPECTUsed" type="{https://www.irdbb-medirad.com}DICOMData"/>
 *         &lt;element name="ThreeDimEnergyDepositionRateMatrixAtTimePointProduced" type="{https://www.irdbb-medirad.com}DICOMData"/>
 *         &lt;element name="NonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced" type="{https://www.irdbb-medirad.com}NonDICOMData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDepositionRateCalculationInHybridDosimetry", propOrder = {
    "processExecutionContext",
    "timePointIdentifierUsed",
    "voxelDataActivityAtTimePointIdentifier",
    "nonDicomVoxelDataActivityAtTimePointIdentifier",
    "ctReconResampledOnSPECTUsed",
    "threeDimEnergyDepositionRateMatrixAtTimePointProduced",
    "nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced"
})
public class EnergyDepositionRateCalculationInHybridDosimetry {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "TimePointIdentifierUsed", required = true)
    protected String timePointIdentifierUsed;
    @XmlElement(name = "VoxelDataActivityAtTimePointIdentifier")
    protected DICOMData voxelDataActivityAtTimePointIdentifier;
    @XmlElement(name = "NonDicomVoxelDataActivityAtTimePointIdentifier")
    protected NonDICOMData nonDicomVoxelDataActivityAtTimePointIdentifier;
    @XmlElement(name = "CTReconResampledOnSPECTUsed", required = true)
    protected DICOMData ctReconResampledOnSPECTUsed;
    @XmlElement(name = "ThreeDimEnergyDepositionRateMatrixAtTimePointProduced", required = true)
    protected DICOMData threeDimEnergyDepositionRateMatrixAtTimePointProduced;
    @XmlElement(name = "NonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced", required = true)
    protected NonDICOMData nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced;

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
     * Obtient la valeur de la propriété voxelDataActivityAtTimePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getVoxelDataActivityAtTimePointIdentifier() {
        return voxelDataActivityAtTimePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété voxelDataActivityAtTimePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setVoxelDataActivityAtTimePointIdentifier(DICOMData value) {
        this.voxelDataActivityAtTimePointIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété nonDicomVoxelDataActivityAtTimePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMData }
     *     
     */
    public NonDICOMData getNonDicomVoxelDataActivityAtTimePointIdentifier() {
        return nonDicomVoxelDataActivityAtTimePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété nonDicomVoxelDataActivityAtTimePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMData }
     *     
     */
    public void setNonDicomVoxelDataActivityAtTimePointIdentifier(NonDICOMData value) {
        this.nonDicomVoxelDataActivityAtTimePointIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété ctReconResampledOnSPECTUsed.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getCTReconResampledOnSPECTUsed() {
        return ctReconResampledOnSPECTUsed;
    }

    /**
     * Définit la valeur de la propriété ctReconResampledOnSPECTUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setCTReconResampledOnSPECTUsed(DICOMData value) {
        this.ctReconResampledOnSPECTUsed = value;
    }

    /**
     * Obtient la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getThreeDimEnergyDepositionRateMatrixAtTimePointProduced() {
        return threeDimEnergyDepositionRateMatrixAtTimePointProduced;
    }

    /**
     * Définit la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setThreeDimEnergyDepositionRateMatrixAtTimePointProduced(DICOMData value) {
        this.threeDimEnergyDepositionRateMatrixAtTimePointProduced = value;
    }

    /**
     * Obtient la valeur de la propriété nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMData }
     *     
     */
    public NonDICOMData getNonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced() {
        return nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced;
    }

    /**
     * Définit la valeur de la propriété nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMData }
     *     
     */
    public void setNonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced(NonDICOMData value) {
        this.nonDICOMThreeDimEnergyDepositionRateMatrixAtTimePointProduced = value;
    }

}
