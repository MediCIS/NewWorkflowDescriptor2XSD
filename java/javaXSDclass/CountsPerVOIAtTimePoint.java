//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.11.14 à 02:58:49 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CountsPerVOIAtTimePoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountsPerVOIAtTimePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountsValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CountsUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimePointIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountsPerVOIAtTimePoint", propOrder = {
    "countsValue",
    "countsUnit",
    "voiIdentifier",
    "timePointIdentifier"
})
public class CountsPerVOIAtTimePoint {

    @XmlElement(name = "CountsValue")
    protected float countsValue;
    @XmlElement(name = "CountsUnit", required = true)
    protected String countsUnit;
    @XmlElement(name = "VOIIdentifier", required = true)
    protected String voiIdentifier;
    @XmlElement(name = "TimePointIdentifier", required = true)
    protected String timePointIdentifier;

    /**
     * Obtient la valeur de la propriété countsValue.
     * 
     */
    public float getCountsValue() {
        return countsValue;
    }

    /**
     * Définit la valeur de la propriété countsValue.
     * 
     */
    public void setCountsValue(float value) {
        this.countsValue = value;
    }

    /**
     * Obtient la valeur de la propriété countsUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountsUnit() {
        return countsUnit;
    }

    /**
     * Définit la valeur de la propriété countsUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountsUnit(String value) {
        this.countsUnit = value;
    }

    /**
     * Obtient la valeur de la propriété voiIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOIIdentifier() {
        return voiIdentifier;
    }

    /**
     * Définit la valeur de la propriété voiIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOIIdentifier(String value) {
        this.voiIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété timePointIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimePointIdentifier() {
        return timePointIdentifier;
    }

    /**
     * Définit la valeur de la propriété timePointIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimePointIdentifier(String value) {
        this.timePointIdentifier = value;
    }

}
