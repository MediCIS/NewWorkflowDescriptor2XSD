//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.06.25 à 10:43:07 AM CEST 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MeanAbsorbedDoseRateInVOI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeanAbsorbedDoseRateInVOI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeanAbsorbedDoseRateInVOIValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MeanAbsorbedDoseRateInVOIUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeanAbsorbedDoseRateInVOI", propOrder = {
    "meanAbsorbedDoseRateInVOIValue",
    "meanAbsorbedDoseRateInVOIUnit",
    "voiIdentifier"
})
public class MeanAbsorbedDoseRateInVOI {

    @XmlElement(name = "MeanAbsorbedDoseRateInVOIValue")
    protected float meanAbsorbedDoseRateInVOIValue;
    @XmlElement(name = "MeanAbsorbedDoseRateInVOIUnit", required = true)
    protected String meanAbsorbedDoseRateInVOIUnit;
    @XmlElement(name = "VOIIdentifier", required = true)
    protected String voiIdentifier;

    /**
     * Obtient la valeur de la propriété meanAbsorbedDoseRateInVOIValue.
     * 
     */
    public float getMeanAbsorbedDoseRateInVOIValue() {
        return meanAbsorbedDoseRateInVOIValue;
    }

    /**
     * Définit la valeur de la propriété meanAbsorbedDoseRateInVOIValue.
     * 
     */
    public void setMeanAbsorbedDoseRateInVOIValue(float value) {
        this.meanAbsorbedDoseRateInVOIValue = value;
    }

    /**
     * Obtient la valeur de la propriété meanAbsorbedDoseRateInVOIUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanAbsorbedDoseRateInVOIUnit() {
        return meanAbsorbedDoseRateInVOIUnit;
    }

    /**
     * Définit la valeur de la propriété meanAbsorbedDoseRateInVOIUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanAbsorbedDoseRateInVOIUnit(String value) {
        this.meanAbsorbedDoseRateInVOIUnit = value;
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

}
