//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.22 à 03:42:59 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CTNumberCalibrationCurve complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CTNumberCalibrationCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElementOfCTNumberCalibrationCurve" type="{https://www.irdbb-medirad.com}ElementOfCTNumberCalibrationCurve" maxOccurs="unbounded"/>
 *         &lt;element name="ReferenceCalibrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTNumberCalibrationCurve", propOrder = {
    "elementOfCTNumberCalibrationCurve",
    "referenceCalibrationDate"
})
public class CTNumberCalibrationCurve {

    @XmlElement(name = "ElementOfCTNumberCalibrationCurve", required = true)
    protected List<ElementOfCTNumberCalibrationCurve> elementOfCTNumberCalibrationCurve;
    @XmlElement(name = "ReferenceCalibrationDate", required = true)
    protected String referenceCalibrationDate;

    /**
     * Gets the value of the elementOfCTNumberCalibrationCurve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementOfCTNumberCalibrationCurve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementOfCTNumberCalibrationCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementOfCTNumberCalibrationCurve }
     * 
     * 
     */
    public List<ElementOfCTNumberCalibrationCurve> getElementOfCTNumberCalibrationCurve() {
        if (elementOfCTNumberCalibrationCurve == null) {
            elementOfCTNumberCalibrationCurve = new ArrayList<ElementOfCTNumberCalibrationCurve>();
        }
        return this.elementOfCTNumberCalibrationCurve;
    }

    /**
     * Obtient la valeur de la propriété referenceCalibrationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCalibrationDate() {
        return referenceCalibrationDate;
    }

    /**
     * Définit la valeur de la propriété referenceCalibrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCalibrationDate(String value) {
        this.referenceCalibrationDate = value;
    }

}
