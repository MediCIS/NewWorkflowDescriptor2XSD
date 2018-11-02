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
 * <p>Classe Java pour EnergyDepositionRateCalculation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnergyDepositionRateCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessExecutionContext" type="{https://www.irdbb-medirad.com}ProcessExecutionContext"/>
 *         &lt;element name="VoxelDataActivityAtTimePointIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMSeriesUIDCTReconResampledOnSPECTUsed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ThreeDimEnergyDepositionRateMatrixAtTimePointProduced" type="{https://www.irdbb-medirad.com}NonDICOMData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDepositionRateCalculation", propOrder = {
    "processExecutionContext",
    "voxelDataActivityAtTimePointIdentifier",
    "dicomSeriesUIDCTReconResampledOnSPECTUsed",
    "threeDimEnergyDepositionRateMatrixAtTimePointProduced"
})
public class EnergyDepositionRateCalculation {

    @XmlElement(name = "ProcessExecutionContext", required = true)
    protected ProcessExecutionContext processExecutionContext;
    @XmlElement(name = "VoxelDataActivityAtTimePointIdentifier", required = true)
    protected String voxelDataActivityAtTimePointIdentifier;
    @XmlElement(name = "DICOMSeriesUIDCTReconResampledOnSPECTUsed", required = true)
    protected String dicomSeriesUIDCTReconResampledOnSPECTUsed;
    @XmlElement(name = "ThreeDimEnergyDepositionRateMatrixAtTimePointProduced", required = true)
    protected NonDICOMData threeDimEnergyDepositionRateMatrixAtTimePointProduced;

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
     * Obtient la valeur de la propriété voxelDataActivityAtTimePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoxelDataActivityAtTimePointIdentifier() {
        return voxelDataActivityAtTimePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété voxelDataActivityAtTimePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoxelDataActivityAtTimePointIdentifier(String value) {
        this.voxelDataActivityAtTimePointIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété dicomSeriesUIDCTReconResampledOnSPECTUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMSeriesUIDCTReconResampledOnSPECTUsed() {
        return dicomSeriesUIDCTReconResampledOnSPECTUsed;
    }

    /**
     * Définit la valeur de la propriété dicomSeriesUIDCTReconResampledOnSPECTUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMSeriesUIDCTReconResampledOnSPECTUsed(String value) {
        this.dicomSeriesUIDCTReconResampledOnSPECTUsed = value;
    }

    /**
     * Obtient la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMData }
     *     
     */
    public NonDICOMData getThreeDimEnergyDepositionRateMatrixAtTimePointProduced() {
        return threeDimEnergyDepositionRateMatrixAtTimePointProduced;
    }

    /**
     * Définit la valeur de la propriété threeDimEnergyDepositionRateMatrixAtTimePointProduced.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMData }
     *     
     */
    public void setThreeDimEnergyDepositionRateMatrixAtTimePointProduced(NonDICOMData value) {
        this.threeDimEnergyDepositionRateMatrixAtTimePointProduced = value;
    }

}
