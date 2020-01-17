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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimeIntegratedActivityPerVOI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeIntegratedActivityPerVOI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResidenceTimePerVOIValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TimeIntegratedActivityPerVOIUnit" type="{https://www.irdbb-medirad.com}TimeIntegratedActivityPerVOIUnit"/>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResidenceTimePerVOIUnit" type="{https://www.irdbb-medirad.com}ResidenceTimePerVOIUnit"/>
 *         &lt;element name="TimeIntegratedActivityCoefficientPerVOIValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="PKAssessmentMethodUsed" type="{https://www.irdbb-medirad.com}CurveFittingMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntegratedActivityPerVOI", propOrder = {
    "residenceTimePerVOIValue",
    "timeIntegratedActivityPerVOIUnit",
    "voiIdentifier",
    "residenceTimePerVOIUnit",
    "timeIntegratedActivityCoefficientPerVOIValue",
    "pkAssessmentMethodUsed"
})
public class TimeIntegratedActivityPerVOI {

    @XmlElement(name = "ResidenceTimePerVOIValue")
    protected float residenceTimePerVOIValue;
    @XmlElement(name = "TimeIntegratedActivityPerVOIUnit", required = true)
    @XmlSchemaType(name = "string")
    protected TimeIntegratedActivityPerVOIUnit timeIntegratedActivityPerVOIUnit;
    @XmlElement(name = "VOIIdentifier", required = true)
    protected String voiIdentifier;
    @XmlElement(name = "ResidenceTimePerVOIUnit", required = true)
    @XmlSchemaType(name = "string")
    protected ResidenceTimePerVOIUnit residenceTimePerVOIUnit;
    @XmlElement(name = "TimeIntegratedActivityCoefficientPerVOIValue")
    protected float timeIntegratedActivityCoefficientPerVOIValue;
    @XmlElement(name = "PKAssessmentMethodUsed", required = true)
    protected CurveFittingMethod pkAssessmentMethodUsed;

    /**
     * Obtient la valeur de la propriété residenceTimePerVOIValue.
     * 
     */
    public float getResidenceTimePerVOIValue() {
        return residenceTimePerVOIValue;
    }

    /**
     * Définit la valeur de la propriété residenceTimePerVOIValue.
     * 
     */
    public void setResidenceTimePerVOIValue(float value) {
        this.residenceTimePerVOIValue = value;
    }

    /**
     * Obtient la valeur de la propriété timeIntegratedActivityPerVOIUnit.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntegratedActivityPerVOIUnit }
     *     
     */
    public TimeIntegratedActivityPerVOIUnit getTimeIntegratedActivityPerVOIUnit() {
        return timeIntegratedActivityPerVOIUnit;
    }

    /**
     * Définit la valeur de la propriété timeIntegratedActivityPerVOIUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntegratedActivityPerVOIUnit }
     *     
     */
    public void setTimeIntegratedActivityPerVOIUnit(TimeIntegratedActivityPerVOIUnit value) {
        this.timeIntegratedActivityPerVOIUnit = value;
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
     * Obtient la valeur de la propriété residenceTimePerVOIUnit.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTimePerVOIUnit }
     *     
     */
    public ResidenceTimePerVOIUnit getResidenceTimePerVOIUnit() {
        return residenceTimePerVOIUnit;
    }

    /**
     * Définit la valeur de la propriété residenceTimePerVOIUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTimePerVOIUnit }
     *     
     */
    public void setResidenceTimePerVOIUnit(ResidenceTimePerVOIUnit value) {
        this.residenceTimePerVOIUnit = value;
    }

    /**
     * Obtient la valeur de la propriété timeIntegratedActivityCoefficientPerVOIValue.
     * 
     */
    public float getTimeIntegratedActivityCoefficientPerVOIValue() {
        return timeIntegratedActivityCoefficientPerVOIValue;
    }

    /**
     * Définit la valeur de la propriété timeIntegratedActivityCoefficientPerVOIValue.
     * 
     */
    public void setTimeIntegratedActivityCoefficientPerVOIValue(float value) {
        this.timeIntegratedActivityCoefficientPerVOIValue = value;
    }

    /**
     * Obtient la valeur de la propriété pkAssessmentMethodUsed.
     * 
     * @return
     *     possible object is
     *     {@link CurveFittingMethod }
     *     
     */
    public CurveFittingMethod getPKAssessmentMethodUsed() {
        return pkAssessmentMethodUsed;
    }

    /**
     * Définit la valeur de la propriété pkAssessmentMethodUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveFittingMethod }
     *     
     */
    public void setPKAssessmentMethodUsed(CurveFittingMethod value) {
        this.pkAssessmentMethodUsed = value;
    }

}
