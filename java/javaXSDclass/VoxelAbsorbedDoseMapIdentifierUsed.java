//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.11 à 04:46:08 PM CET 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VoxelAbsorbedDoseMapIdentifierUsed complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VoxelAbsorbedDoseMapIdentifierUsed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoxelAbsorbedDoseMapIdentifierUsed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoxelAbsorbedDoseMapIdentifierUsed", propOrder = {
    "voxelAbsorbedDoseMapIdentifierUsed"
})
public class VoxelAbsorbedDoseMapIdentifierUsed {

    @XmlElement(name = "VoxelAbsorbedDoseMapIdentifierUsed", required = true)
    protected List<String> voxelAbsorbedDoseMapIdentifierUsed;

    /**
     * Gets the value of the voxelAbsorbedDoseMapIdentifierUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voxelAbsorbedDoseMapIdentifierUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoxelAbsorbedDoseMapIdentifierUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoxelAbsorbedDoseMapIdentifierUsed() {
        if (voxelAbsorbedDoseMapIdentifierUsed == null) {
            voxelAbsorbedDoseMapIdentifierUsed = new ArrayList<String>();
        }
        return this.voxelAbsorbedDoseMapIdentifierUsed;
    }

}
