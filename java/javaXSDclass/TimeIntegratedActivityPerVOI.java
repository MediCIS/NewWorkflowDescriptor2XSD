//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.16 à 12:21:52 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element name="TimeIntegratedActivityPerVOIValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TimeIntegratedActivityPerVOIUnit" type="{https://www.irdbb-medirad.com}TimeIntegratedActivityPerVOIUnit"/>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeIntegratedActivityCoefficientPerVOIUnit" type="{https://www.irdbb-medirad.com}TimeIntegratedActivityCoefficientPerVOIUnit"/>
 *         &lt;element name="TimeIntegratedActivityPerVOIValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "content"
})
public class TimeIntegratedActivityPerVOI {

    @XmlElementRefs({
        @XmlElementRef(name = "TimeIntegratedActivityPerVOIUnit", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PKAssessmentMethodUsed", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeIntegratedActivityPerVOIValue", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VOIIdentifier", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeIntegratedActivityCoefficientPerVOIUnit", namespace = "https://www.irdbb-medirad.com", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Obtient le reste du modèle de contenu. 
     * 
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante : 
     * Le nom de champ "TimeIntegratedActivityPerVOIValue" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
     * ligne 1129 sur file:/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsd/nonDicomFileSetDescriptor.xsd
     * ligne 1125 sur file:/Users/marinebrenet/Documents/workflowDescriptor2XSD/xsd/nonDicomFileSetDescriptor.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
     * des deux déclarations suivantes afin de modifier leurs noms : 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimeIntegratedActivityPerVOIUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveFittingMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeIntegratedActivityCoefficientPerVOIUnit }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
