//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.16 à 05:10:16 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ResidenceTimePerVOIUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceTimePerVOIUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="seconds"/>
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="days"/>
 *     &lt;enumeration value="months"/>
 *     &lt;enumeration value="years"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResidenceTimePerVOIUnit")
@XmlEnum
public enum ResidenceTimePerVOIUnit {

    @XmlEnumValue("seconds")
    SECONDS("seconds"),
    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("days")
    DAYS("days"),
    @XmlEnumValue("months")
    MONTHS("months"),
    @XmlEnumValue("years")
    YEARS("years");
    private final String value;

    ResidenceTimePerVOIUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidenceTimePerVOIUnit fromValue(String v) {
        for (ResidenceTimePerVOIUnit c: ResidenceTimePerVOIUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
