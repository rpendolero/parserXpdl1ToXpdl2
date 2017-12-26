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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}LoopStandard"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}LoopMultiInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="LoopType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Standard"/>
 *             &lt;enumeration value="MultiInstance"/>
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
    "loopStandard",
    "loopMultiInstance"
})
@XmlRootElement(name = "Loop")
public class Loop {

    @XmlElement(name = "LoopStandard")
    protected LoopStandard loopStandard;
    @XmlElement(name = "LoopMultiInstance")
    protected LoopMultiInstance loopMultiInstance;
    @XmlAttribute(name = "LoopType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loopType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad loopStandard.
     * 
     * @return
     *     possible object is
     *     {@link LoopStandard }
     *     
     */
    public LoopStandard getLoopStandard() {
        return loopStandard;
    }

    /**
     * Define el valor de la propiedad loopStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link LoopStandard }
     *     
     */
    public void setLoopStandard(LoopStandard value) {
        this.loopStandard = value;
    }

    /**
     * Obtiene el valor de la propiedad loopMultiInstance.
     * 
     * @return
     *     possible object is
     *     {@link LoopMultiInstance }
     *     
     */
    public LoopMultiInstance getLoopMultiInstance() {
        return loopMultiInstance;
    }

    /**
     * Define el valor de la propiedad loopMultiInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link LoopMultiInstance }
     *     
     */
    public void setLoopMultiInstance(LoopMultiInstance value) {
        this.loopMultiInstance = value;
    }

    /**
     * Obtiene el valor de la propiedad loopType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopType() {
        return loopType;
    }

    /**
     * Define el valor de la propiedad loopType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopType(String value) {
        this.loopType = value;
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
