//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.17 à 12:29:06 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanarCalibrationFactorValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PlanarCalibrationFactorUnit" type="{https://www.irdbb-medirad.com}PlanarCalibrationFactorUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "planarCalibrationFactorValue",
    "planarCalibrationFactorUnit"
})
@XmlRootElement(name = "ActualPlanarCalibrationFactor-ActualPlanarCalibrationFactor")
public class ActualPlanarCalibrationFactorActualPlanarCalibrationFactor {

    @XmlElement(name = "PlanarCalibrationFactorValue")
    protected float planarCalibrationFactorValue;
    @XmlElement(name = "PlanarCalibrationFactorUnit", required = true)
    @XmlSchemaType(name = "string")
    protected PlanarCalibrationFactorUnit planarCalibrationFactorUnit;

    /**
     * Obtient la valeur de la propriété planarCalibrationFactorValue.
     * 
     */
    public float getPlanarCalibrationFactorValue() {
        return planarCalibrationFactorValue;
    }

    /**
     * Définit la valeur de la propriété planarCalibrationFactorValue.
     * 
     */
    public void setPlanarCalibrationFactorValue(float value) {
        this.planarCalibrationFactorValue = value;
    }

    /**
     * Obtient la valeur de la propriété planarCalibrationFactorUnit.
     * 
     * @return
     *     possible object is
     *     {@link PlanarCalibrationFactorUnit }
     *     
     */
    public PlanarCalibrationFactorUnit getPlanarCalibrationFactorUnit() {
        return planarCalibrationFactorUnit;
    }

    /**
     * Définit la valeur de la propriété planarCalibrationFactorUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanarCalibrationFactorUnit }
     *     
     */
    public void setPlanarCalibrationFactorUnit(PlanarCalibrationFactorUnit value) {
        this.planarCalibrationFactorUnit = value;
    }

}
