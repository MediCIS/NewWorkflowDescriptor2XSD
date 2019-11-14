//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.11.14 à 02:58:49 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ROI complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ROI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROIIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrganOrTissue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bone"/>
 *               &lt;enumeration value="breast"/>
 *               &lt;enumeration value="esophagus"/>
 *               &lt;enumeration value="heart"/>
 *               &lt;enumeration value="lungs"/>
 *               &lt;enumeration value="skin"/>
 *               &lt;enumeration value="human body"/>
 *               &lt;enumeration value="Adipose residual tissue"/>
 *               &lt;enumeration value="Adrenal left"/>
 *               &lt;enumeration value="Adrenal right"/>
 *               &lt;enumeration value="Air inside body"/>
 *               &lt;enumeration value="Air outside body"/>
 *               &lt;enumeration value="Alveolar interstitium"/>
 *               &lt;enumeration value="Ankles and foot bones cortical"/>
 *               &lt;enumeration value="Ankles and foot bones spongiosa"/>
 *               &lt;enumeration value="Anterior nasal passage (ET1)"/>
 *               &lt;enumeration value="Ascending colon contents"/>
 *               &lt;enumeration value="Ascending colon wall"/>
 *               &lt;enumeration value="Blood vessels arms"/>
 *               &lt;enumeration value="Blood vessels head"/>
 *               &lt;enumeration value="Blood vessels legs"/>
 *               &lt;enumeration value="Blood vessels trunk"/>
 *               &lt;enumeration value="Brain"/>
 *               &lt;enumeration value="Breast a + Breast g"/>
 *               &lt;enumeration value="Breast left adipose tissue"/>
 *               &lt;enumeration value="Breast left glandular tissue"/>
 *               &lt;enumeration value="Breast right adipose tissue"/>
 *               &lt;enumeration value="Breast right glandular tissue"/>
 *               &lt;enumeration value="Bronchi"/>
 *               &lt;enumeration value="Cartilage arms"/>
 *               &lt;enumeration value="Cartilage head"/>
 *               &lt;enumeration value="Cartilage legs"/>
 *               &lt;enumeration value="Cartilage trunk"/>
 *               &lt;enumeration value="Cervical spine cortical"/>
 *               &lt;enumeration value="Cervical spine spongiosa"/>
 *               &lt;enumeration value="Clavicles cortical"/>
 *               &lt;enumeration value="Clavicles spongiosa"/>
 *               &lt;enumeration value="Colon"/>
 *               &lt;enumeration value="Cranium cortical"/>
 *               &lt;enumeration value="Cranium spongiosa"/>
 *               &lt;enumeration value="Descending colon contents"/>
 *               &lt;enumeration value="Descending colon wall"/>
 *               &lt;enumeration value="ET region"/>
 *               &lt;enumeration value="Eye bulb left"/>
 *               &lt;enumeration value="Eye bulb right"/>
 *               &lt;enumeration value="Eye lense left"/>
 *               &lt;enumeration value="Eye lense right"/>
 *               &lt;enumeration value="Femora lower half cortical"/>
 *               &lt;enumeration value="Femora lower half medullary cavity"/>
 *               &lt;enumeration value="Femora lower half spongiosa"/>
 *               &lt;enumeration value="Femora upper half cortical"/>
 *               &lt;enumeration value="Femora upper half medullary cavity"/>
 *               &lt;enumeration value="Femora upper half spongiosa"/>
 *               &lt;enumeration value="Gall bladder contents"/>
 *               &lt;enumeration value="Gall bladder wall"/>
 *               &lt;enumeration value="Heart contents (blood)"/>
 *               &lt;enumeration value="Heart wall"/>
 *               &lt;enumeration value="Humeri lower half cortical"/>
 *               &lt;enumeration value="Humeri lower half medullary cavity"/>
 *               &lt;enumeration value="Humeri lower half spongiosa"/>
 *               &lt;enumeration value="Humeri upper half cortical"/>
 *               &lt;enumeration value="Humeri upper half medullary cavity"/>
 *               &lt;enumeration value="Humeri upper half spongiosa"/>
 *               &lt;enumeration value="Kidney left cortex"/>
 *               &lt;enumeration value="Kidney left medulla"/>
 *               &lt;enumeration value="Kidney left pelvis"/>
 *               &lt;enumeration value="Kidney right cortex"/>
 *               &lt;enumeration value="Kidney right medulla"/>
 *               &lt;enumeration value="Kidney right pelvis"/>
 *               &lt;enumeration value="LBreast a + LBresat g"/>
 *               &lt;enumeration value="Left colon wall (left transverse + descending)"/>
 *               &lt;enumeration value="Left kidney C+M+P"/>
 *               &lt;enumeration value="Left lung lobe"/>
 *               &lt;enumeration value="Lenses of eye"/>
 *               &lt;enumeration value="Liver"/>
 *               &lt;enumeration value="Lumbar spine cortical"/>
 *               &lt;enumeration value="Lumbar spine spongiosa"/>
 *               &lt;enumeration value="Lung left blood"/>
 *               &lt;enumeration value="Lung left tissue"/>
 *               &lt;enumeration value="Lung right blood"/>
 *               &lt;enumeration value="Lung right tissue"/>
 *               &lt;enumeration value="Lymphatic nodes arms"/>
 *               &lt;enumeration value="Lymphatic nodes extrathoracic airways"/>
 *               &lt;enumeration value="Lymphatic nodes head"/>
 *               &lt;enumeration value="Lymphatic nodes legs"/>
 *               &lt;enumeration value="Lymphatic nodes thoracic airways"/>
 *               &lt;enumeration value="Lymphatic nodes trunk"/>
 *               &lt;enumeration value="Lymph nodes"/>
 *               &lt;enumeration value="Lymph nodes except LN ET + LN Th"/>
 *               &lt;enumeration value="Mandible cortical"/>
 *               &lt;enumeration value="Mandible spongiosa"/>
 *               &lt;enumeration value="Muscle"/>
 *               &lt;enumeration value="Muscle arms"/>
 *               &lt;enumeration value="Muscle head"/>
 *               &lt;enumeration value="Muscle legs"/>
 *               &lt;enumeration value="Muscle trunk"/>
 *               &lt;enumeration value="Oesophagus"/>
 *               &lt;enumeration value="Oral mucosa"/>
 *               &lt;enumeration value="Oral mucosa lips and cheeks"/>
 *               &lt;enumeration value="Oral mucosa tongue"/>
 *               &lt;enumeration value="Ovary left"/>
 *               &lt;enumeration value="Ovary right"/>
 *               &lt;enumeration value="Pancreas"/>
 *               &lt;enumeration value="Pelvis cortical"/>
 *               &lt;enumeration value="Pelvis spongiosa"/>
 *               &lt;enumeration value="Pituitary gland"/>
 *               &lt;enumeration value="Posterior nasal passage down to larynx (ET2)"/>
 *               &lt;enumeration value="Prostate"/>
 *               &lt;enumeration value="RAdrenal + LAdrenal"/>
 *               &lt;enumeration value="RBreast a + LBreast a"/>
 *               &lt;enumeration value="RBreast a + RBreast g"/>
 *               &lt;enumeration value="RBreast g + LBreast g"/>
 *               &lt;enumeration value="Rectum wall"/>
 *               &lt;enumeration value="Residual tissue arms"/>
 *               &lt;enumeration value="Residual tissue head"/>
 *               &lt;enumeration value="Residual tissue legs"/>
 *               &lt;enumeration value="Residual tissue trunk"/>
 *               &lt;enumeration value="Ribs cortical"/>
 *               &lt;enumeration value="Ribs spongiosa"/>
 *               &lt;enumeration value="Right colon wall (ascending + right transverse)"/>
 *               &lt;enumeration value="Right kidney C+M+P"/>
 *               &lt;enumeration value="Right lung lobe"/>
 *               &lt;enumeration value="RKidney + LKidney"/>
 *               &lt;enumeration value="RLung + LLung"/>
 *               &lt;enumeration value="ROvary + LOvary"/>
 *               &lt;enumeration value="Sacrum spongiosa"/>
 *               &lt;enumeration value="Salivary glands"/>
 *               &lt;enumeration value="Salivary glands left"/>
 *               &lt;enumeration value="Salivary glands right"/>
 *               &lt;enumeration value="Scapulae cortical"/>
 *               &lt;enumeration value="Scapulae spongiosa"/>
 *               &lt;enumeration value="Sigmoid colon contents"/>
 *               &lt;enumeration value="Sigmoid colon wall"/>
 *               &lt;enumeration value="Sigmoid colon wall + rectum wall"/>
 *               &lt;enumeration value="Skin"/>
 *               &lt;enumeration value="Skin arms"/>
 *               &lt;enumeration value="Skin at top and bottom"/>
 *               &lt;enumeration value="Skin head"/>
 *               &lt;enumeration value="Skin legs"/>
 *               &lt;enumeration value="Skin trunk"/>
 *               &lt;enumeration value="Small intestine contents"/>
 *               &lt;enumeration value="Small intestine wall"/>
 *               &lt;enumeration value="Spinal cord"/>
 *               &lt;enumeration value="Spleen"/>
 *               &lt;enumeration value="Sternum cortical"/>
 *               &lt;enumeration value="Sternum spongiosa"/>
 *               &lt;enumeration value="Stomach contents"/>
 *               &lt;enumeration value="Stomach wall"/>
 *               &lt;enumeration value="Teeth"/>
 *               &lt;enumeration value="Testes"/>
 *               &lt;enumeration value="Testis left"/>
 *               &lt;enumeration value="Testis right"/>
 *               &lt;enumeration value="Thoracic spine cortical"/>
 *               &lt;enumeration value="Thoracic spine spongiosa"/>
 *               &lt;enumeration value="Thymus"/>
 *               &lt;enumeration value="Thyroid"/>
 *               &lt;enumeration value="Tibiae fibulae and patellae cortical"/>
 *               &lt;enumeration value="Tibiae fibulae and patellae medullary cavity"/>
 *               &lt;enumeration value="Tibiae fibulae and patellae spongiosa"/>
 *               &lt;enumeration value="Tongue"/>
 *               &lt;enumeration value="Tongue (inner part)"/>
 *               &lt;enumeration value="Tonsils"/>
 *               &lt;enumeration value="Total body except organ contents"/>
 *               &lt;enumeration value="Trachea"/>
 *               &lt;enumeration value="Transverse colon contents left"/>
 *               &lt;enumeration value="Transverse colon contents right"/>
 *               &lt;enumeration value="Transverse colon wall left"/>
 *               &lt;enumeration value="Transverse colon wall right"/>
 *               &lt;enumeration value="Ulnae and radii cortical"/>
 *               &lt;enumeration value="Ulnae and radii medullary cavity"/>
 *               &lt;enumeration value="Ulnae and radii spongiosa"/>
 *               &lt;enumeration value="Ureter left"/>
 *               &lt;enumeration value="Ureter right"/>
 *               &lt;enumeration value="Ureters"/>
 *               &lt;enumeration value="Urinary bladder contents"/>
 *               &lt;enumeration value="Urinary bladder wall"/>
 *               &lt;enumeration value="Uterus"/>
 *               &lt;enumeration value="Wrists and hand bones cortical"/>
 *               &lt;enumeration value="Wrists and hand bones spongiosa"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "ROI", propOrder = {
    "roiIdentifier",
    "organOrTissue",
    "dicomroiContainer",
    "nonDICOMROIContainer"
})
public class ROI {

    @XmlElement(name = "ROIIdentifier", required = true)
    protected String roiIdentifier;
    @XmlElement(name = "OrganOrTissue", required = true)
    protected String organOrTissue;
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
     * Obtient la valeur de la propriété organOrTissue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganOrTissue() {
        return organOrTissue;
    }

    /**
     * Définit la valeur de la propriété organOrTissue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganOrTissue(String value) {
        this.organOrTissue = value;
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
