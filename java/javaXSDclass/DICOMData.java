//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.12 à 05:36:08 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DICOMData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DICOMData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DICOMStudyUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMDICOMSeriesUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DICOMData", propOrder = {
    "dicomStudyUID",
    "dicomdicomSeriesUID"
})
public class DICOMData {

    @XmlElement(name = "DICOMStudyUID", required = true)
    protected String dicomStudyUID;
    @XmlElement(name = "DICOMDICOMSeriesUID", required = true)
    protected String dicomdicomSeriesUID;

    /**
     * Obtient la valeur de la propriété dicomStudyUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMStudyUID() {
        return dicomStudyUID;
    }

    /**
     * Définit la valeur de la propriété dicomStudyUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMStudyUID(String value) {
        this.dicomStudyUID = value;
    }

    /**
     * Obtient la valeur de la propriété dicomdicomSeriesUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICOMDICOMSeriesUID() {
        return dicomdicomSeriesUID;
    }

    /**
     * Définit la valeur de la propriété dicomdicomSeriesUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICOMDICOMSeriesUID(String value) {
        this.dicomdicomSeriesUID = value;
    }

}
