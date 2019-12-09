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
 * <p>Classe Java pour OrganOrTissue.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganOrTissue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bone"/>
 *     &lt;enumeration value="breast"/>
 *     &lt;enumeration value="esophagus"/>
 *     &lt;enumeration value="heart"/>
 *     &lt;enumeration value="lungs"/>
 *     &lt;enumeration value="skin"/>
 *     &lt;enumeration value="human body"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganOrTissue")
@XmlEnum
public enum OrganOrTissue {

    @XmlEnumValue("bone")
    BONE("bone"),
    @XmlEnumValue("breast")
    BREAST("breast"),
    @XmlEnumValue("esophagus")
    ESOPHAGUS("esophagus"),
    @XmlEnumValue("heart")
    HEART("heart"),
    @XmlEnumValue("lungs")
    LUNGS("lungs"),
    @XmlEnumValue("skin")
    SKIN("skin"),
    @XmlEnumValue("human body")
    HUMAN_BODY("human body");
    private final String value;

    OrganOrTissue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganOrTissue fromValue(String v) {
        for (OrganOrTissue c: OrganOrTissue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
