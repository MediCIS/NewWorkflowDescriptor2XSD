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
 * <p>Classe Java pour CalculationOfVoxelMap complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalculationOfVoxelMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeProcessStarted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PerformingInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttenuatorUsed" type="{https://www.irdbb-medirad.com}AttenuatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MonteCarloMethodUsed" type="{https://www.irdbb-medirad.com}MonteCarloMethodType" minOccurs="0"/>
 *         &lt;element name="DICOMCTImageDataUsed" type="{https://www.irdbb-medirad.com}DICOMData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VoxelBasedDistributionOfAbsorbedDoseProduced" type="{https://www.irdbb-medirad.com}VoxelBasedDistributionOfAbsorbedDoseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationOfVoxelMap", propOrder = {
    "dateTimeProcessStarted",
    "performingInstitution",
    "attenuatorUsed",
    "monteCarloMethodUsed",
    "dicomctImageDataUsed",
    "voxelBasedDistributionOfAbsorbedDoseProduced"
})
public class CalculationOfVoxelMap {

    @XmlElement(name = "DateTimeProcessStarted", required = true)
    protected String dateTimeProcessStarted;
    @XmlElement(name = "PerformingInstitution", required = true)
    protected String performingInstitution;
    @XmlElement(name = "AttenuatorUsed")
    protected List<AttenuatorType> attenuatorUsed;
    @XmlElement(name = "MonteCarloMethodUsed")
    protected MonteCarloMethodType monteCarloMethodUsed;
    @XmlElement(name = "DICOMCTImageDataUsed")
    protected List<DICOMData> dicomctImageDataUsed;
    @XmlElement(name = "VoxelBasedDistributionOfAbsorbedDoseProduced")
    protected List<VoxelBasedDistributionOfAbsorbedDoseType> voxelBasedDistributionOfAbsorbedDoseProduced;

    /**
     * Obtient la valeur de la propriété dateTimeProcessStarted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeProcessStarted() {
        return dateTimeProcessStarted;
    }

    /**
     * Définit la valeur de la propriété dateTimeProcessStarted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeProcessStarted(String value) {
        this.dateTimeProcessStarted = value;
    }

    /**
     * Obtient la valeur de la propriété performingInstitution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformingInstitution() {
        return performingInstitution;
    }

    /**
     * Définit la valeur de la propriété performingInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformingInstitution(String value) {
        this.performingInstitution = value;
    }

    /**
     * Gets the value of the attenuatorUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attenuatorUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttenuatorUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttenuatorType }
     * 
     * 
     */
    public List<AttenuatorType> getAttenuatorUsed() {
        if (attenuatorUsed == null) {
            attenuatorUsed = new ArrayList<AttenuatorType>();
        }
        return this.attenuatorUsed;
    }

    /**
     * Obtient la valeur de la propriété monteCarloMethodUsed.
     * 
     * @return
     *     possible object is
     *     {@link MonteCarloMethodType }
     *     
     */
    public MonteCarloMethodType getMonteCarloMethodUsed() {
        return monteCarloMethodUsed;
    }

    /**
     * Définit la valeur de la propriété monteCarloMethodUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link MonteCarloMethodType }
     *     
     */
    public void setMonteCarloMethodUsed(MonteCarloMethodType value) {
        this.monteCarloMethodUsed = value;
    }

    /**
     * Gets the value of the dicomctImageDataUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dicomctImageDataUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDICOMCTImageDataUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DICOMData }
     * 
     * 
     */
    public List<DICOMData> getDICOMCTImageDataUsed() {
        if (dicomctImageDataUsed == null) {
            dicomctImageDataUsed = new ArrayList<DICOMData>();
        }
        return this.dicomctImageDataUsed;
    }

    /**
     * Gets the value of the voxelBasedDistributionOfAbsorbedDoseProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voxelBasedDistributionOfAbsorbedDoseProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoxelBasedDistributionOfAbsorbedDoseProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoxelBasedDistributionOfAbsorbedDoseType }
     * 
     * 
     */
    public List<VoxelBasedDistributionOfAbsorbedDoseType> getVoxelBasedDistributionOfAbsorbedDoseProduced() {
        if (voxelBasedDistributionOfAbsorbedDoseProduced == null) {
            voxelBasedDistributionOfAbsorbedDoseProduced = new ArrayList<VoxelBasedDistributionOfAbsorbedDoseType>();
        }
        return this.voxelBasedDistributionOfAbsorbedDoseProduced;
    }

}
