//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 01:39:09 PM CET 
//


package org.wfmc.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerResultMessage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerTimer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ResultError" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ResultCompensation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerRule" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TriggerResultLink" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
    "triggerTimer",
    "resultError",
    "resultCompensation",
    "triggerRule",
    "triggerResultLink",
    "any"
})
@XmlRootElement(name = "TriggerIntermediateMultiple")
public class TriggerIntermediateMultiple {

    @XmlElement(name = "TriggerResultMessage")
    protected TriggerResultMessage triggerResultMessage;
    @XmlElement(name = "TriggerTimer")
    protected TriggerTimer triggerTimer;
    @XmlElement(name = "ResultError")
    protected ResultError resultError;
    @XmlElement(name = "ResultCompensation")
    protected ResultCompensation resultCompensation;
    @XmlElement(name = "TriggerRule")
    protected TriggerRule triggerRule;
    @XmlElement(name = "TriggerResultLink")
    protected TriggerResultLink triggerResultLink;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
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
     * Obtiene el valor de la propiedad triggerTimer.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTimer }
     *     
     */
    public TriggerTimer getTriggerTimer() {
        return triggerTimer;
    }

    /**
     * Define el valor de la propiedad triggerTimer.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTimer }
     *     
     */
    public void setTriggerTimer(TriggerTimer value) {
        this.triggerTimer = value;
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
     * Obtiene el valor de la propiedad triggerRule.
     * 
     * @return
     *     possible object is
     *     {@link TriggerRule }
     *     
     */
    public TriggerRule getTriggerRule() {
        return triggerRule;
    }

    /**
     * Define el valor de la propiedad triggerRule.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerRule }
     *     
     */
    public void setTriggerRule(TriggerRule value) {
        this.triggerRule = value;
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
