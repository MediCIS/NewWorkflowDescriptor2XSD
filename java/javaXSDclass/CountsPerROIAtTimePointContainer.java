//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.27 à 05:04:20 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CountsPerROIAtTimePointContainer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountsPerROIAtTimePointContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountsPerROIAtTimePointProduced" type="{https://www.irdbb-medirad.com}CountsPerROIAtTimePoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountsPerROIAtTimePointContainer", propOrder = {
    "countsPerROIAtTimePointProduced"
})
public class CountsPerROIAtTimePointContainer {

    @XmlElement(name = "CountsPerROIAtTimePointProduced", required = true)
    protected List<CountsPerROIAtTimePoint> countsPerROIAtTimePointProduced;

    /**
     * Gets the value of the countsPerROIAtTimePointProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countsPerROIAtTimePointProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountsPerROIAtTimePointProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountsPerROIAtTimePoint }
     * 
     * 
     */
    public List<CountsPerROIAtTimePoint> getCountsPerROIAtTimePointProduced() {
        if (countsPerROIAtTimePointProduced == null) {
            countsPerROIAtTimePointProduced = new ArrayList<CountsPerROIAtTimePoint>();
        }
        return this.countsPerROIAtTimePointProduced;
    }

}
