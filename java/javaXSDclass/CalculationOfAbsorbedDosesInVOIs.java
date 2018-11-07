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
 * <p>Classe Java pour CalculationOfAbsorbedDosesInVOIs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalculationOfAbsorbedDosesInVOIs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeProcessStarted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PerformingInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VoxelBasedDistributionOfAbsorbedDoseUsed" type="{https://www.irdbb-medirad.com}VoxelBasedDistributionOfAbsorbedDoseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VOIDescriptorUsed" type="{https://www.irdbb-medirad.com}VOI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbsorbedDosePerVOI" type="{https://www.irdbb-medirad.com}AbsorbedDosePerVOIType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationOfAbsorbedDosesInVOIs", propOrder = {
    "dateTimeProcessStarted",
    "performingInstitution",
    "voxelBasedDistributionOfAbsorbedDoseUsed",
    "voiDescriptorUsed",
    "absorbedDosePerVOI"
})
public class CalculationOfAbsorbedDosesInVOIs {

    @XmlElement(name = "DateTimeProcessStarted", required = true)
    protected String dateTimeProcessStarted;
    @XmlElement(name = "PerformingInstitution", required = true)
    protected String performingInstitution;
    @XmlElement(name = "VoxelBasedDistributionOfAbsorbedDoseUsed")
    protected List<VoxelBasedDistributionOfAbsorbedDoseType> voxelBasedDistributionOfAbsorbedDoseUsed;
    @XmlElement(name = "VOIDescriptorUsed")
    protected List<VOI> voiDescriptorUsed;
    @XmlElement(name = "AbsorbedDosePerVOI")
    protected List<AbsorbedDosePerVOIType> absorbedDosePerVOI;

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
     * Gets the value of the voxelBasedDistributionOfAbsorbedDoseUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voxelBasedDistributionOfAbsorbedDoseUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoxelBasedDistributionOfAbsorbedDoseUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoxelBasedDistributionOfAbsorbedDoseType }
     * 
     * 
     */
    public List<VoxelBasedDistributionOfAbsorbedDoseType> getVoxelBasedDistributionOfAbsorbedDoseUsed() {
        if (voxelBasedDistributionOfAbsorbedDoseUsed == null) {
            voxelBasedDistributionOfAbsorbedDoseUsed = new ArrayList<VoxelBasedDistributionOfAbsorbedDoseType>();
        }
        return this.voxelBasedDistributionOfAbsorbedDoseUsed;
    }

    /**
     * Gets the value of the voiDescriptorUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiDescriptorUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIDescriptorUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOI }
     * 
     * 
     */
    public List<VOI> getVOIDescriptorUsed() {
        if (voiDescriptorUsed == null) {
            voiDescriptorUsed = new ArrayList<VOI>();
        }
        return this.voiDescriptorUsed;
    }

    /**
     * Gets the value of the absorbedDosePerVOI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absorbedDosePerVOI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsorbedDosePerVOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsorbedDosePerVOIType }
     * 
     * 
     */
    public List<AbsorbedDosePerVOIType> getAbsorbedDosePerVOI() {
        if (absorbedDosePerVOI == null) {
            absorbedDosePerVOI = new ArrayList<AbsorbedDosePerVOIType>();
        }
        return this.absorbedDosePerVOI;
    }

}
