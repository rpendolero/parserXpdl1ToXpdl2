//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 01:39:09 PM CET 
//


package org.wfmc.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerResultMessage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ResultError" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ResultCompensation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerResultLink" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ResultMultiple" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Result" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Message"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Cancel"/>
 *             &lt;enumeration value="Compensation"/>
 *             &lt;enumeration value="Link"/>
 *             &lt;enumeration value="Terminate"/>
 *             &lt;enumeration value="Multiple"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Implementation" default="WebService">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="WebService"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="Unspecified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "triggerResultMessage",
    "resultError",
    "resultCompensation",
    "triggerResultLink",
    "resultMultiple"
})
@XmlRootElement(name = "EndEvent")
public class EndEvent {

    @XmlElement(name = "TriggerResultMessage")
    protected TriggerResultMessage triggerResultMessage;
    @XmlElement(name = "ResultError")
    protected ResultError resultError;
    @XmlElement(name = "ResultCompensation")
    protected ResultCompensation resultCompensation;
    @XmlElement(name = "TriggerResultLink")
    protected TriggerResultLink triggerResultLink;
    @XmlElement(name = "ResultMultiple")
    protected ResultMultiple resultMultiple;
    @XmlAttribute(name = "Result")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String result;
    @XmlAttribute(name = "Implementation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String implementation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad triggerResultMessage.
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultMessage }
     *     
     */
    public TriggerResultMessage getTriggerResultMessage() {
        return triggerResultMessage;
    }

    /**
     * Define el valor de la propiedad triggerResultMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultMessage }
     *     
     */
    public void setTriggerResultMessage(TriggerResultMessage value) {
        this.triggerResultMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad resultError.
     * 
     * @return
     *     possible object is
     *     {@link ResultError }
     *     
     */
    public ResultError getResultError() {
        return resultError;
    }

    /**
     * Define el valor de la propiedad resultError.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultError }
     *     
     */
    public void setResultError(ResultError value) {
        this.resultError = value;
    }

    /**
     * Obtiene el valor de la propiedad resultCompensation.
     * 
     * @return
     *     possible object is
     *     {@link ResultCompensation }
     *     
     */
    public ResultCompensation getResultCompensation() {
        return resultCompensation;
    }

    /**
     * Define el valor de la propiedad resultCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCompensation }
     *     
     */
    public void setResultCompensation(ResultCompensation value) {
        this.resultCompensation = value;
    }

    /**
     * Obtiene el valor de la propiedad triggerResultLink.
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultLink }
     *     
     */
    public TriggerResultLink getTriggerResultLink() {
        return triggerResultLink;
    }

    /**
     * Define el valor de la propiedad triggerResultLink.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultLink }
     *     
     */
    public void setTriggerResultLink(TriggerResultLink value) {
        this.triggerResultLink = value;
    }

    /**
     * Obtiene el valor de la propiedad resultMultiple.
     * 
     * @return
     *     possible object is
     *     {@link ResultMultiple }
     *     
     */
    public ResultMultiple getResultMultiple() {
        return resultMultiple;
    }

    /**
     * Define el valor de la propiedad resultMultiple.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultMultiple }
     *     
     */
    public void setResultMultiple(ResultMultiple value) {
        this.resultMultiple = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        if (result == null) {
            return "None";
        } else {
            return result;
        }
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad implementation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation() {
        if (implementation == null) {
            return "WebService";
        } else {
            return implementation;
        }
    }

    /**
     * Define el valor de la propiedad implementation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation(String value) {
        this.implementation = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
