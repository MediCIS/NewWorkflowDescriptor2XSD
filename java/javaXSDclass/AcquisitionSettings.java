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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AcquisitionSettings complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AcquisitionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Siteadministeringthetreatment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dateandtimeofinjection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreAdministeredActivity" type="{https://www.irdbb-medirad.com}AdministeredActivity"/>
 *         &lt;element name="PostAdministeredActivity" type="{https://www.irdbb-medirad.com}AdministeredActivity" minOccurs="0"/>
 *         &lt;element name="Radiopharmaceutical" type="{https://www.irdbb-medirad.com}Radiopharmaceutical"/>
 *         &lt;element name="Isotope" type="{https://www.irdbb-medirad.com}Isotope"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquisitionSettings", propOrder = {
    "siteadministeringthetreatment",
    "dateandtimeofinjection",
    "preAdministeredActivity",
    "postAdministeredActivity",
    "radiopharmaceutical",
    "isotope"
})
public class AcquisitionSettings {

    @XmlElement(name = "Siteadministeringthetreatment", required = true)
    protected String siteadministeringthetreatment;
    @XmlElement(name = "Dateandtimeofinjection", required = true)
    protected String dateandtimeofinjection;
    @XmlElement(name = "PreAdministeredActivity", required = true)
    protected AdministeredActivity preAdministeredActivity;
    @XmlElement(name = "PostAdministeredActivity")
    protected AdministeredActivity postAdministeredActivity;
    @XmlElement(name = "Radiopharmaceutical", required = true)
    @XmlSchemaType(name = "string")
    protected Radiopharmaceutical radiopharmaceutical;
    @XmlElement(name = "Isotope", required = true)
    @XmlSchemaType(name = "string")
    protected Isotope isotope;

    /**
     * Obtient la valeur de la propriété siteadministeringthetreatment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteadministeringthetreatment() {
        return siteadministeringthetreatment;
    }

    /**
     * Définit la valeur de la propriété siteadministeringthetreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteadministeringthetreatment(String value) {
        this.siteadministeringthetreatment = value;
    }

    /**
     * Obtient la valeur de la propriété dateandtimeofinjection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateandtimeofinjection() {
        return dateandtimeofinjection;
    }

    /**
     * Définit la valeur de la propriété dateandtimeofinjection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateandtimeofinjection(String value) {
        this.dateandtimeofinjection = value;
    }

    /**
     * Obtient la valeur de la propriété preAdministeredActivity.
     * 
     * @return
     *     possible object is
     *     {@link AdministeredActivity }
     *     
     */
    public AdministeredActivity getPreAdministeredActivity() {
        return preAdministeredActivity;
    }

    /**
     * Définit la valeur de la propriété preAdministeredActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministeredActivity }
     *     
     */
    public void setPreAdministeredActivity(AdministeredActivity value) {
        this.preAdministeredActivity = value;
    }

    /**
     * Obtient la valeur de la propriété postAdministeredActivity.
     * 
     * @return
     *     possible object is
     *     {@link AdministeredActivity }
     *     
     */
    public AdministeredActivity getPostAdministeredActivity() {
        return postAdministeredActivity;
    }

    /**
     * Définit la valeur de la propriété postAdministeredActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministeredActivity }
     *     
     */
    public void setPostAdministeredActivity(AdministeredActivity value) {
        this.postAdministeredActivity = value;
    }

    /**
     * Obtient la valeur de la propriété radiopharmaceutical.
     * 
     * @return
     *     possible object is
     *     {@link Radiopharmaceutical }
     *     
     */
    public Radiopharmaceutical getRadiopharmaceutical() {
        return radiopharmaceutical;
    }

    /**
     * Définit la valeur de la propriété radiopharmaceutical.
     * 
     * @param value
     *     allowed object is
     *     {@link Radiopharmaceutical }
     *     
     */
    public void setRadiopharmaceutical(Radiopharmaceutical value) {
        this.radiopharmaceutical = value;
    }

    /**
     * Obtient la valeur de la propriété isotope.
     * 
     * @return
     *     possible object is
     *     {@link Isotope }
     *     
     */
    public Isotope getIsotope() {
        return isotope;
    }

    /**
     * Définit la valeur de la propriété isotope.
     * 
     * @param value
     *     allowed object is
     *     {@link Isotope }
     *     
     */
    public void setIsotope(Isotope value) {
        this.isotope = value;
    }

}
