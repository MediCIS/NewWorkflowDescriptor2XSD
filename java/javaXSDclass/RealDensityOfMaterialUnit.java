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
 * <p>Classe Java pour RealDensityOfMaterialUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RealDensityOfMaterialUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hounsfield"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealDensityOfMaterialUnit")
@XmlEnum
public enum RealDensityOfMaterialUnit {

    @XmlEnumValue("hounsfield")
    HOUNSFIELD("hounsfield");
    private final String value;

    RealDensityOfMaterialUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealDensityOfMaterialUnit fromValue(String v) {
        for (RealDensityOfMaterialUnit c: RealDensityOfMaterialUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
