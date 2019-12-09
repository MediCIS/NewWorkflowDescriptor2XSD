//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.08 à 10:03:35 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DataActivityUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataActivityUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="becquerel"/>
 *     &lt;enumeration value="kilobecquerel"/>
 *     &lt;enumeration value="megabecquerel"/>
 *     &lt;enumeration value="curie"/>
 *     &lt;enumeration value="millicurie"/>
 *     &lt;enumeration value="microcurie"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataActivityUnit")
@XmlEnum
public enum DataActivityUnit {

    @XmlEnumValue("becquerel")
    BECQUEREL("becquerel"),
    @XmlEnumValue("kilobecquerel")
    KILOBECQUEREL("kilobecquerel"),
    @XmlEnumValue("megabecquerel")
    MEGABECQUEREL("megabecquerel"),
    @XmlEnumValue("curie")
    CURIE("curie"),
    @XmlEnumValue("millicurie")
    MILLICURIE("millicurie"),
    @XmlEnumValue("microcurie")
    MICROCURIE("microcurie");
    private final String value;

    DataActivityUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataActivityUnit fromValue(String v) {
        for (DataActivityUnit c: DataActivityUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
