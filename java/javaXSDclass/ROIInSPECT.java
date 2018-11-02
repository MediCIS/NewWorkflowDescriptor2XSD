//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.02 à 11:16:14 AM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ROIInSPECT complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ROIInSPECT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhantomPartIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DICOMROIContainer" type="{https://www.irdbb-medirad.com}DICOMData" minOccurs="0"/>
 *         &lt;element name="NonDICOMROIContainer" type="{https://www.irdbb-medirad.com}NonDICOMData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROIInSPECT", propOrder = {
    "roiIdentifier",
    "phantomPartIdentifier",
    "dicomroiContainer",
    "nonDICOMROIContainer"
})
public class ROIInSPECT {

    @XmlElement(name = "ROIIdentifier", required = true)
    protected String roiIdentifier;
    @XmlElement(name = "PhantomPartIdentifier", required = true)
    protected String phantomPartIdentifier;
    @XmlElement(name = "DICOMROIContainer")
    protected DICOMData dicomroiContainer;
    @XmlElement(name = "NonDICOMROIContainer")
    protected NonDICOMData nonDICOMROIContainer;

    /**
     * Obtient la valeur de la propriété roiIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROIIdentifier() {
        return roiIdentifier;
    }

    /**
     * Définit la valeur de la propriété roiIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROIIdentifier(String value) {
        this.roiIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété phantomPartIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhantomPartIdentifier() {
        return phantomPartIdentifier;
    }

    /**
     * Définit la valeur de la propriété phantomPartIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhantomPartIdentifier(String value) {
        this.phantomPartIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété dicomroiContainer.
     * 
     * @return
     *     possible object is
     *     {@link DICOMData }
     *     
     */
    public DICOMData getDICOMROIContainer() {
        return dicomroiContainer;
    }

    /**
     * Définit la valeur de la propriété dicomroiContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link DICOMData }
     *     
     */
    public void setDICOMROIContainer(DICOMData value) {
        this.dicomroiContainer = value;
    }

    /**
     * Obtient la valeur de la propriété nonDICOMROIContainer.
     * 
     * @return
     *     possible object is
     *     {@link NonDICOMData }
     *     
     */
    public NonDICOMData getNonDICOMROIContainer() {
        return nonDICOMROIContainer;
    }

    /**
     * Définit la valeur de la propriété nonDICOMROIContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDICOMData }
     *     
     */
    public void setNonDICOMROIContainer(NonDICOMData value) {
        this.nonDICOMROIContainer = value;
    }

}