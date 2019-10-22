//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.10.22 à 02:34:53 PM CEST 
//


package javaXSDclass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MonteCarloMethodType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonteCarloMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonteCarloMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SoftwareName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SimulatedImagingDevice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MonteCarloMethodSetting" type="{https://www.irdbb-medirad.com}MethodSettingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonteCarloMethodType", propOrder = {
    "monteCarloMethod",
    "softwareName",
    "simulatedImagingDevice",
    "monteCarloMethodSetting"
})
public class MonteCarloMethodType {

    @XmlElement(name = "MonteCarloMethod", required = true)
    protected String monteCarloMethod;
    @XmlElement(name = "SoftwareName")
    protected List<String> softwareName;
    @XmlElement(name = "SimulatedImagingDevice")
    protected List<String> simulatedImagingDevice;
    @XmlElement(name = "MonteCarloMethodSetting")
    protected List<MethodSettingType> monteCarloMethodSetting;

    /**
     * Obtient la valeur de la propriété monteCarloMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonteCarloMethod() {
        return monteCarloMethod;
    }

    /**
     * Définit la valeur de la propriété monteCarloMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonteCarloMethod(String value) {
        this.monteCarloMethod = value;
    }

    /**
     * Gets the value of the softwareName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSoftwareName() {
        if (softwareName == null) {
            softwareName = new ArrayList<String>();
        }
        return this.softwareName;
    }

    /**
     * Gets the value of the simulatedImagingDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulatedImagingDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulatedImagingDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSimulatedImagingDevice() {
        if (simulatedImagingDevice == null) {
            simulatedImagingDevice = new ArrayList<String>();
        }
        return this.simulatedImagingDevice;
    }

    /**
     * Gets the value of the monteCarloMethodSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monteCarloMethodSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonteCarloMethodSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodSettingType }
     * 
     * 
     */
    public List<MethodSettingType> getMonteCarloMethodSetting() {
        if (monteCarloMethodSetting == null) {
            monteCarloMethodSetting = new ArrayList<MethodSettingType>();
        }
        return this.monteCarloMethodSetting;
    }

}
