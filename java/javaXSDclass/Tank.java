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
 * <p>Classe Java pour Tank complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Tank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreAdminBackgroundActivityValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PreAdminBackgroundActivityUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreAdminBackgroundActivityTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostAdminBackgroundActivityValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PostAdminBackgroundActivityUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostAdminBackgroundActivityTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TankIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tank", propOrder = {
    "volumeValue",
    "volumeUnit",
    "preAdminBackgroundActivityValue",
    "preAdminBackgroundActivityUnit",
    "preAdminBackgroundActivityTimestamp",
    "postAdminBackgroundActivityValue",
    "postAdminBackgroundActivityUnit",
    "postAdminBackgroundActivityTimestamp",
    "tankIdentifier"
})
public class Tank {

    @XmlElement(name = "VolumeValue")
    protected float volumeValue;
    @XmlElement(name = "VolumeUnit", required = true)
    protected String volumeUnit;
    @XmlElement(name = "PreAdminBackgroundActivityValue")
    protected float preAdminBackgroundActivityValue;
    @XmlElement(name = "PreAdminBackgroundActivityUnit", required = true)
    protected String preAdminBackgroundActivityUnit;
    @XmlElement(name = "PreAdminBackgroundActivityTimestamp", required = true)
    protected String preAdminBackgroundActivityTimestamp;
    @XmlElement(name = "PostAdminBackgroundActivityValue")
    protected float postAdminBackgroundActivityValue;
    @XmlElement(name = "PostAdminBackgroundActivityUnit", required = true)
    protected String postAdminBackgroundActivityUnit;
    @XmlElement(name = "PostAdminBackgroundActivityTimestamp", required = true)
    protected String postAdminBackgroundActivityTimestamp;
    @XmlElement(name = "TankIdentifier", required = true)
    protected String tankIdentifier;

    /**
     * Obtient la valeur de la propriété volumeValue.
     * 
     */
    public float getVolumeValue() {
        return volumeValue;
    }

    /**
     * Définit la valeur de la propriété volumeValue.
     * 
     */
    public void setVolumeValue(float value) {
        this.volumeValue = value;
    }

    /**
     * Obtient la valeur de la propriété volumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Définit la valeur de la propriété volumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUnit(String value) {
        this.volumeUnit = value;
    }

    /**
     * Obtient la valeur de la propriété preAdminBackgroundActivityValue.
     * 
     */
    public float getPreAdminBackgroundActivityValue() {
        return preAdminBackgroundActivityValue;
    }

    /**
     * Définit la valeur de la propriété preAdminBackgroundActivityValue.
     * 
     */
    public void setPreAdminBackgroundActivityValue(float value) {
        this.preAdminBackgroundActivityValue = value;
    }

    /**
     * Obtient la valeur de la propriété preAdminBackgroundActivityUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAdminBackgroundActivityUnit() {
        return preAdminBackgroundActivityUnit;
    }

    /**
     * Définit la valeur de la propriété preAdminBackgroundActivityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAdminBackgroundActivityUnit(String value) {
        this.preAdminBackgroundActivityUnit = value;
    }

    /**
     * Obtient la valeur de la propriété preAdminBackgroundActivityTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAdminBackgroundActivityTimestamp() {
        return preAdminBackgroundActivityTimestamp;
    }

    /**
     * Définit la valeur de la propriété preAdminBackgroundActivityTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAdminBackgroundActivityTimestamp(String value) {
        this.preAdminBackgroundActivityTimestamp = value;
    }

    /**
     * Obtient la valeur de la propriété postAdminBackgroundActivityValue.
     * 
     */
    public float getPostAdminBackgroundActivityValue() {
        return postAdminBackgroundActivityValue;
    }

    /**
     * Définit la valeur de la propriété postAdminBackgroundActivityValue.
     * 
     */
    public void setPostAdminBackgroundActivityValue(float value) {
        this.postAdminBackgroundActivityValue = value;
    }

    /**
     * Obtient la valeur de la propriété postAdminBackgroundActivityUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAdminBackgroundActivityUnit() {
        return postAdminBackgroundActivityUnit;
    }

    /**
     * Définit la valeur de la propriété postAdminBackgroundActivityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAdminBackgroundActivityUnit(String value) {
        this.postAdminBackgroundActivityUnit = value;
    }

    /**
     * Obtient la valeur de la propriété postAdminBackgroundActivityTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAdminBackgroundActivityTimestamp() {
        return postAdminBackgroundActivityTimestamp;
    }

    /**
     * Définit la valeur de la propriété postAdminBackgroundActivityTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAdminBackgroundActivityTimestamp(String value) {
        this.postAdminBackgroundActivityTimestamp = value;
    }

    /**
     * Obtient la valeur de la propriété tankIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTankIdentifier() {
        return tankIdentifier;
    }

    /**
     * Définit la valeur de la propriété tankIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTankIdentifier(String value) {
        this.tankIdentifier = value;
    }

}