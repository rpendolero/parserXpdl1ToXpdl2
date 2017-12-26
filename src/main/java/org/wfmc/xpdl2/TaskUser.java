//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Performers"/>
 *         &lt;element name="MessageIn" type="{http://www.wfmc.org/2004/XPDL2.0alpha}MessageType"/>
 *         &lt;element name="MessageOut" type="{http://www.wfmc.org/2004/XPDL2.0alpha}MessageType"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}WebServiceOperation" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
    "performers",
    "messageIn",
    "messageOut",
    "webServiceOperation",
    "any"
})
@XmlRootElement(name = "TaskUser")
public class TaskUser {

    @XmlElement(name = "Performers", required = true)
    protected Performers performers;
    @XmlElement(name = "MessageIn", required = true)
    protected MessageType messageIn;
    @XmlElement(name = "MessageOut", required = true)
    protected MessageType messageOut;
    @XmlElement(name = "WebServiceOperation")
    protected WebServiceOperation webServiceOperation;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Implementation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String implementation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad performers.
     * 
     * @return
     *     possible object is
     *     {@link Performers }
     *     
     */
    public Performers getPerformers() {
        return performers;
    }

    /**
     * Define el valor de la propiedad performers.
     * 
     * @param value
     *     allowed object is
     *     {@link Performers }
     *     
     */
    public void setPerformers(Performers value) {
        this.performers = value;
    }

    /**
     * Obtiene el valor de la propiedad messageIn.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageIn() {
        return messageIn;
    }

    /**
     * Define el valor de la propiedad messageIn.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageIn(MessageType value) {
        this.messageIn = value;
    }

    /**
     * Obtiene el valor de la propiedad messageOut.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageOut() {
        return messageOut;
    }

    /**
     * Define el valor de la propiedad messageOut.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageOut(MessageType value) {
        this.messageOut = value;
    }

    /**
     * Obtiene el valor de la propiedad webServiceOperation.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceOperation }
     *     
     */
    public WebServiceOperation getWebServiceOperation() {
        return webServiceOperation;
    }

    /**
     * Define el valor de la propiedad webServiceOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceOperation }
     *     
     */
    public void setWebServiceOperation(WebServiceOperation value) {
        this.webServiceOperation = value;
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
