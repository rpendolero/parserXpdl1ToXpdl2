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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}StartEvent" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}IntermediateEvent" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}EndEvent" minOccurs="0"/>
 *       &lt;/choice>
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
    "startEvent",
    "intermediateEvent",
    "endEvent"
})
@XmlRootElement(name = "Event")
public class Event {

    @XmlElement(name = "StartEvent")
    protected StartEvent startEvent;
    @XmlElement(name = "IntermediateEvent")
    protected IntermediateEvent intermediateEvent;
    @XmlElement(name = "EndEvent")
    protected EndEvent endEvent;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad startEvent.
     * 
     * @return
     *     possible object is
     *     {@link StartEvent }
     *     
     */
    public StartEvent getStartEvent() {
        return startEvent;
    }

    /**
     * Define el valor de la propiedad startEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link StartEvent }
     *     
     */
    public void setStartEvent(StartEvent value) {
        this.startEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad intermediateEvent.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateEvent }
     *     
     */
    public IntermediateEvent getIntermediateEvent() {
        return intermediateEvent;
    }

    /**
     * Define el valor de la propiedad intermediateEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateEvent }
     *     
     */
    public void setIntermediateEvent(IntermediateEvent value) {
        this.intermediateEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad endEvent.
     * 
     * @return
     *     possible object is
     *     {@link EndEvent }
     *     
     */
    public EndEvent getEndEvent() {
        return endEvent;
    }

    /**
     * Define el valor de la propiedad endEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link EndEvent }
     *     
     */
    public void setEndEvent(EndEvent value) {
        this.endEvent = value;
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
