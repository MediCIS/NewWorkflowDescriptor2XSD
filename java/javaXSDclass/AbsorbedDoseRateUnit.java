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
 * <p>Classe Java pour AbsorbedDoseRateUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AbsorbedDoseRateUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gray per second"/>
 *     &lt;enumeration value="milligray per second"/>
 *     &lt;enumeration value="milligray per hour"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AbsorbedDoseRateUnit")
@XmlEnum
public enum AbsorbedDoseRateUnit {

    @XmlEnumValue("gray per second")
    GRAY_PER_SECOND("gray per second"),
    @XmlEnumValue("milligray per second")
    MILLIGRAY_PER_SECOND("milligray per second"),
    @XmlEnumValue("milligray per hour")
    MILLIGRAY_PER_HOUR("milligray per hour");
    private final String value;

    AbsorbedDoseRateUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbsorbedDoseRateUnit fromValue(String v) {
        for (AbsorbedDoseRateUnit c: AbsorbedDoseRateUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
