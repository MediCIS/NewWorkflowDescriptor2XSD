//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.10.31 à 04:55:21 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CountsPerROI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountsPerROI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountsValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CountsUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountsPerROI", propOrder = {
    "countsValue",
    "countsUnit",
    "roiIdentifier"
})
public class CountsPerROI {

    @XmlElement(name = "CountsValue")
    protected float countsValue;
    @XmlElement(name = "CountsUnit", required = true)
    protected String countsUnit;
    @XmlElement(name = "ROIIdentifier", required = true)
    protected String roiIdentifier;

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
     * Obtient la valeur de la propriété roiIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROIIdentifier() {
        return roiIdentifier;
    }

    /**
     * Définit la valeur de la propriété roiIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROIIdentifier(String value) {
        this.roiIdentifier = value;
    }

}
