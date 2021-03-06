//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.27 à 05:04:20 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NonDICOMDataFormat.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NonDICOMDataFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="zipped imageJ contours format"/>
 *     &lt;enumeration value="TIFF format embedding imageJ contours"/>
 *     &lt;enumeration value="zipped pseudo DICOM ImpactMC"/>
 *     &lt;enumeration value="GIF format embedding imageJ contours"/>
 *     &lt;enumeration value="NRRD format"/>
 *     &lt;enumeration value="STL format"/>
 *     &lt;enumeration value="HDF4 format"/>
 *     &lt;enumeration value="HDF5 format"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonDICOMDataFormat")
@XmlEnum
public enum NonDICOMDataFormat {

    @XmlEnumValue("zipped imageJ contours format")
    ZIPPED_IMAGE_J_CONTOURS_FORMAT("zipped imageJ contours format"),
    @XmlEnumValue("TIFF format embedding imageJ contours")
    TIFF_FORMAT_EMBEDDING_IMAGE_J_CONTOURS("TIFF format embedding imageJ contours"),
    @XmlEnumValue("zipped pseudo DICOM ImpactMC")
    ZIPPED_PSEUDO_DICOM_IMPACT_MC("zipped pseudo DICOM ImpactMC"),
    @XmlEnumValue("GIF format embedding imageJ contours")
    GIF_FORMAT_EMBEDDING_IMAGE_J_CONTOURS("GIF format embedding imageJ contours"),
    @XmlEnumValue("NRRD format")
    NRRD_FORMAT("NRRD format"),
    @XmlEnumValue("STL format")
    STL_FORMAT("STL format"),
    @XmlEnumValue("HDF4 format")
    HDF_4_FORMAT("HDF4 format"),
    @XmlEnumValue("HDF5 format")
    HDF_5_FORMAT("HDF5 format");
    private final String value;

    NonDICOMDataFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonDICOMDataFormat fromValue(String v) {
        for (NonDICOMDataFormat c: NonDICOMDataFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
