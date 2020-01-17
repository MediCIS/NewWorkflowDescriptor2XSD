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
 * <p>Classe Java pour VOI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VOI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VOIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganOrTissue" type="{https://www.irdbb-medirad.com}OrganOrTissue"/>
 *         &lt;element name="DICOMDataContainer" type="{https://www.irdbb-medirad.com}DICOMDataContainer" minOccurs="0"/>
 *         &lt;element name="NonDICOMDataContainer" type="{https://www.irdbb-medirad.com}NonDICOMDataContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VOI", propOrder = {
    "voiIdentifier",
    "organOrTissue",
    "dicomDataContainer",
    "nonDICOMDataContainer"
})
public class VOI {

    @XmlElement(name = "VOIIdentifier", required = true)
    protected String voiIdentifier;
    @XmlElement(name = "OrganOrTissue", required = true)
    @XmlSchemaType(name = "string")
    protected OrganOrTissue organOrTissue;
    @XmlElement(name = "DICOMDataContainer")
    protected DICOMDataContainer dicomDataContainer;
    @XmlElement(name = "NonDICOMDataContainer")
    protected NonDICOMDataContainer nonDICOMDataContainer;

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
     * Obtient la valeur de la propriété organOrTissue.
     * 
     * @return
     *     possible object is
     *     {@link OrganOrTissue }
     *     
     */
    public OrganOrTissue getOrganOrTissue() {
        return organOrTissue;
    }

    /**
     * Définit la valeur de la propriété organOrTissue.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganOrTissue }
     *     
     */
    public void setOrganOrTissue(OrganOrTissue value) {
        this.organOrTissue = value;
    }

    /**
     * Obtient la valeur de la propriété dicomDataContainer.
     * 
     * @return
     *     possible object is
     *     {@link DICOMDataContainer }
     *     
     */
    public DICOMDataContainer getDICOMDataContainer() {
        return dicomDataContainer;
    }

    /**
     * Définit la valeur de la propriété dicomDataContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMDataContainer }
     *     
     */
    public void setDICOMDataContainer(DICOMDataContainer value) {
        this.dicomDataContainer = value;
    }

    /**
     * Obtient la valeur de la propriété nonDICOMDataContainer.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public NonDICOMDataContainer getNonDICOMDataContainer() {
        return nonDICOMDataContainer;
    }

    /**
     * Définit la valeur de la propriété nonDICOMDataContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMDataContainer }
     *     
     */
    public void setNonDICOMDataContainer(NonDICOMDataContainer value) {
        this.nonDICOMDataContainer = value;
    }

}
