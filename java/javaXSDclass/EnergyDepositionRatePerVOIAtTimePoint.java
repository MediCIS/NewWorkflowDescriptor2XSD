//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.27 à 05:04:20 PM CET 
//


package javaXSDclass;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnergyDepositionRatePerVOIAtTimePoint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnergyDepositionRatePerVOIAtTimePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnergyDepositionRateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="EnergyDepositionRateUnit" type="{https://www.irdbb-medirad.com}EnergyDepositionRateUnit"/>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "EnergyDepositionRatePerVOIAtTimePoint", propOrder = {
    "energyDepositionRateValue",
    "energyDepositionRateUnit",
    "voiIdentifier",
    "timePointIdentifier"
})
public class EnergyDepositionRatePerVOIAtTimePoint {

    @XmlElement(name = "EnergyDepositionRateValue")
    protected float energyDepositionRateValue;
    @XmlElement(name = "EnergyDepositionRateUnit", required = true)
    @XmlSchemaType(name = "string")
    protected EnergyDepositionRateUnit energyDepositionRateUnit;
    @XmlElement(name = "VOIIdentifier", required = true)
    protected BigInteger voiIdentifier;
    @XmlElement(name = "TimePointIdentifier", required = true)
    protected String timePointIdentifier;

    /**
     * Obtient la valeur de la propriété energyDepositionRateValue.
     * 
     */
    public float getEnergyDepositionRateValue() {
        return energyDepositionRateValue;
    }

    /**
     * Définit la valeur de la propriété energyDepositionRateValue.
     * 
     */
    public void setEnergyDepositionRateValue(float value) {
        this.energyDepositionRateValue = value;
    }

    /**
     * Obtient la valeur de la propriété energyDepositionRateUnit.
     * 
     * @return
     *     possible object is
     *     {@link EnergyDepositionRateUnit }
     *     
     */
    public EnergyDepositionRateUnit getEnergyDepositionRateUnit() {
        return energyDepositionRateUnit;
    }

    /**
     * Définit la valeur de la propriété energyDepositionRateUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyDepositionRateUnit }
     *     
     */
    public void setEnergyDepositionRateUnit(EnergyDepositionRateUnit value) {
        this.energyDepositionRateUnit = value;
    }

    /**
     * Obtient la valeur de la propriété voiIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVOIIdentifier() {
        return voiIdentifier;
    }

    /**
     * Définit la valeur de la propriété voiIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVOIIdentifier(BigInteger value) {
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
