//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.02 à 11:16:12 AM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TwoDimDosimetryViaAbsorbedDoseRateCalculation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TwoDimDosimetryViaAbsorbedDoseRateCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbsorbedDoseRateCalculation" type="{https://www.irdbb-medirad.com}AbsorbedDoseRateCalculation"/>
 *         &lt;element name="TimeAbsorbedDoseCurveFit" type="{https://www.irdbb-medirad.com}TimeAbsorbedDoseCurveFit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoDimDosimetryViaAbsorbedDoseRateCalculation", propOrder = {
    "absorbedDoseRateCalculation",
    "timeAbsorbedDoseCurveFit"
})
public class TwoDimDosimetryViaAbsorbedDoseRateCalculation {

    @XmlElement(name = "AbsorbedDoseRateCalculation", required = true)
    protected AbsorbedDoseRateCalculation absorbedDoseRateCalculation;
    @XmlElement(name = "TimeAbsorbedDoseCurveFit", required = true)
    protected TimeAbsorbedDoseCurveFit timeAbsorbedDoseCurveFit;

    /**
     * Obtient la valeur de la propriété absorbedDoseRateCalculation.
     * 
     * @return
     *     possible object is
     *     {@link AbsorbedDoseRateCalculation }
     *     
     */
    public AbsorbedDoseRateCalculation getAbsorbedDoseRateCalculation() {
        return absorbedDoseRateCalculation;
    }

    /**
     * Définit la valeur de la propriété absorbedDoseRateCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsorbedDoseRateCalculation }
     *     
     */
    public void setAbsorbedDoseRateCalculation(AbsorbedDoseRateCalculation value) {
        this.absorbedDoseRateCalculation = value;
    }

    /**
     * Obtient la valeur de la propriété timeAbsorbedDoseCurveFit.
     * 
     * @return
     *     possible object is
     *     {@link TimeAbsorbedDoseCurveFit }
     *     
     */
    public TimeAbsorbedDoseCurveFit getTimeAbsorbedDoseCurveFit() {
        return timeAbsorbedDoseCurveFit;
    }

    /**
     * Définit la valeur de la propriété timeAbsorbedDoseCurveFit.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAbsorbedDoseCurveFit }
     *     
     */
    public void setTimeAbsorbedDoseCurveFit(TimeAbsorbedDoseCurveFit value) {
        this.timeAbsorbedDoseCurveFit = value;
    }

}
