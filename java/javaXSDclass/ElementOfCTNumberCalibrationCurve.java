//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.22 à 10:12:06 AM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ElementOfCTNumberCalibrationCurve complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ElementOfCTNumberCalibrationCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeasuredDensityValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MeasuredDensityUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RealDensityOfMaterialValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RealDensityOfMaterialUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaterialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementOfCTNumberCalibrationCurve", propOrder = {
    "measuredDensityValue",
    "measuredDensityUnit",
    "realDensityOfMaterialValue",
    "realDensityOfMaterialUnit",
    "materialIdentifier"
})
public class ElementOfCTNumberCalibrationCurve {

    @XmlElement(name = "MeasuredDensityValue")
    protected float measuredDensityValue;
    @XmlElement(name = "MeasuredDensityUnit", required = true)
    protected String measuredDensityUnit;
    @XmlElement(name = "RealDensityOfMaterialValue")
    protected float realDensityOfMaterialValue;
    @XmlElement(name = "RealDensityOfMaterialUnit", required = true)
    protected String realDensityOfMaterialUnit;
    @XmlElement(name = "MaterialIdentifier")
    protected String materialIdentifier;

    /**
     * Obtient la valeur de la propriété measuredDensityValue.
     * 
     */
    public float getMeasuredDensityValue() {
        return measuredDensityValue;
    }

    /**
     * Définit la valeur de la propriété measuredDensityValue.
     * 
     */
    public void setMeasuredDensityValue(float value) {
        this.measuredDensityValue = value;
    }

    /**
     * Obtient la valeur de la propriété measuredDensityUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuredDensityUnit() {
        return measuredDensityUnit;
    }

    /**
     * Définit la valeur de la propriété measuredDensityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuredDensityUnit(String value) {
        this.measuredDensityUnit = value;
    }

    /**
     * Obtient la valeur de la propriété realDensityOfMaterialValue.
     * 
     */
    public float getRealDensityOfMaterialValue() {
        return realDensityOfMaterialValue;
    }

    /**
     * Définit la valeur de la propriété realDensityOfMaterialValue.
     * 
     */
    public void setRealDensityOfMaterialValue(float value) {
        this.realDensityOfMaterialValue = value;
    }

    /**
     * Obtient la valeur de la propriété realDensityOfMaterialUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealDensityOfMaterialUnit() {
        return realDensityOfMaterialUnit;
    }

    /**
     * Définit la valeur de la propriété realDensityOfMaterialUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealDensityOfMaterialUnit(String value) {
        this.realDensityOfMaterialUnit = value;
    }

    /**
     * Obtient la valeur de la propriété materialIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialIdentifier() {
        return materialIdentifier;
    }

    /**
     * Définit la valeur de la propriété materialIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialIdentifier(String value) {
        this.materialIdentifier = value;
    }

}
