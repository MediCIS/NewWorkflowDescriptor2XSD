//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.27 à 05:04:20 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="CTAcqForCTNumberCalibrationCurve" type="{https://www.irdbb-medirad.com}CTAcqForCTNumberCalibrationCurve"/>
 *         &lt;element name="CalculationOfCTNumberCalibrationCurve" type="{https://www.irdbb-medirad.com}CalculationOfCTNumberCalibrationCurve"/>
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
    "ctAcqForCTNumberCalibrationCurve",
    "calculationOfCTNumberCalibrationCurve"
})
@XmlRootElement(name = "CTNumberCalibrationWorkfow")
public class CTNumberCalibrationWorkfow {

    @XmlElement(name = "CTAcqForCTNumberCalibrationCurve", required = true)
    protected CTAcqForCTNumberCalibrationCurve ctAcqForCTNumberCalibrationCurve;
    @XmlElement(name = "CalculationOfCTNumberCalibrationCurve", required = true)
    protected CalculationOfCTNumberCalibrationCurve calculationOfCTNumberCalibrationCurve;

    /**
     * Obtient la valeur de la propriété ctAcqForCTNumberCalibrationCurve.
     * 
     * @return
     *     possible object is
     *     {@link CTAcqForCTNumberCalibrationCurve }
     *     
     */
    public CTAcqForCTNumberCalibrationCurve getCTAcqForCTNumberCalibrationCurve() {
        return ctAcqForCTNumberCalibrationCurve;
    }

    /**
     * Définit la valeur de la propriété ctAcqForCTNumberCalibrationCurve.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAcqForCTNumberCalibrationCurve }
     *     
     */
    public void setCTAcqForCTNumberCalibrationCurve(CTAcqForCTNumberCalibrationCurve value) {
        this.ctAcqForCTNumberCalibrationCurve = value;
    }

    /**
     * Obtient la valeur de la propriété calculationOfCTNumberCalibrationCurve.
     * 
     * @return
     *     possible object is
     *     {@link CalculationOfCTNumberCalibrationCurve }
     *     
     */
    public CalculationOfCTNumberCalibrationCurve getCalculationOfCTNumberCalibrationCurve() {
        return calculationOfCTNumberCalibrationCurve;
    }

    /**
     * Définit la valeur de la propriété calculationOfCTNumberCalibrationCurve.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationOfCTNumberCalibrationCurve }
     *     
     */
    public void setCalculationOfCTNumberCalibrationCurve(CalculationOfCTNumberCalibrationCurve value) {
        this.calculationOfCTNumberCalibrationCurve = value;
    }

}
