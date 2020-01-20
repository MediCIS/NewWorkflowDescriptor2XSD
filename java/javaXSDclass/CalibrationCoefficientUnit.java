//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.01.20 à 05:46:25 PM CET 
//


package javaXSDclass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CalibrationCoefficientUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CalibrationCoefficientUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="counts per second per megabecquerel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalibrationCoefficientUnit")
@XmlEnum
public enum CalibrationCoefficientUnit {

    @XmlEnumValue("counts per second per megabecquerel")
    COUNTS_PER_SECOND_PER_MEGABECQUEREL("counts per second per megabecquerel");
    private final String value;

    CalibrationCoefficientUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalibrationCoefficientUnit fromValue(String v) {
        for (CalibrationCoefficientUnit c: CalibrationCoefficientUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
