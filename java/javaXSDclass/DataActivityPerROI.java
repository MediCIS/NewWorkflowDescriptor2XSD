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
 * <p>Classe Java pour DataActivityPerROI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataActivityPerROI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataActivityValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="DataActivityUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DataActivityPerROI", propOrder = {
    "dataActivityValue",
    "dataActivityUnit",
    "roiIdentifier"
})
public class DataActivityPerROI {

    @XmlElement(name = "DataActivityValue")
    protected float dataActivityValue;
    @XmlElement(name = "DataActivityUnit", required = true)
    protected String dataActivityUnit;
    @XmlElement(name = "ROIIdentifier", required = true)
    protected String roiIdentifier;

    /**
     * Obtient la valeur de la propriété dataActivityValue.
     * 
     */
    public float getDataActivityValue() {
        return dataActivityValue;
    }

    /**
     * Définit la valeur de la propriété dataActivityValue.
     * 
     */
    public void setDataActivityValue(float value) {
        this.dataActivityValue = value;
    }

    /**
     * Obtient la valeur de la propriété dataActivityUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataActivityUnit() {
        return dataActivityUnit;
    }

    /**
     * Définit la valeur de la propriété dataActivityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataActivityUnit(String value) {
        this.dataActivityUnit = value;
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
