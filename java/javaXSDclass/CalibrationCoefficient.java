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
 * <p>Classe Java pour CalibrationCoefficient complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalibrationCoefficient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalibrationCoefficientValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CalibrationCoefficientUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalibrationCoefficient", propOrder = {
    "calibrationCoefficientValue",
    "calibrationCoefficientUnit"
})
public class CalibrationCoefficient {

    @XmlElement(name = "CalibrationCoefficientValue")
    protected float calibrationCoefficientValue;
    @XmlElement(name = "CalibrationCoefficientUnit", required = true)
    protected String calibrationCoefficientUnit;

    /**
     * Obtient la valeur de la propriété calibrationCoefficientValue.
     * 
     */
    public float getCalibrationCoefficientValue() {
        return calibrationCoefficientValue;
    }

    /**
     * Définit la valeur de la propriété calibrationCoefficientValue.
     * 
     */
    public void setCalibrationCoefficientValue(float value) {
        this.calibrationCoefficientValue = value;
    }

    /**
     * Obtient la valeur de la propriété calibrationCoefficientUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationCoefficientUnit() {
        return calibrationCoefficientUnit;
    }

    /**
     * Définit la valeur de la propriété calibrationCoefficientUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationCoefficientUnit(String value) {
        this.calibrationCoefficientUnit = value;
    }

}
