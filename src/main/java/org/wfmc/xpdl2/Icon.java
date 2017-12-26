//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 01:39:09 PM CET 
//


package org.wfmc.xpdl2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="XCOORD" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="YCOORD" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SHAPE" default="RoundRectangle">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="RoundRectangle"/>
 *             &lt;enumeration value="Rectangle"/>
 *             &lt;enumeration value="Ellipse"/>
 *             &lt;enumeration value="Diamond"/>
 *             &lt;enumeration value="Ellipse"/>
 *             &lt;enumeration value="UpTriangle"/>
 *             &lt;enumeration value="DownTriangle"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Icon")
public class Icon {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "XCOORD")
    protected BigInteger xcoord;
    @XmlAttribute(name = "YCOORD")
    protected BigInteger ycoord;
    @XmlAttribute(name = "WIDTH")
    protected BigInteger width;
    @XmlAttribute(name = "HEIGHT")
    protected BigInteger height;
    @XmlAttribute(name = "SHAPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shape;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad xcoord.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXCOORD() {
        return xcoord;
    }

    /**
     * Define el valor de la propiedad xcoord.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXCOORD(BigInteger value) {
        this.xcoord = value;
    }

    /**
     * Obtiene el valor de la propiedad ycoord.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYCOORD() {
        return ycoord;
    }

    /**
     * Define el valor de la propiedad ycoord.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYCOORD(BigInteger value) {
        this.ycoord = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWIDTH() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWIDTH(BigInteger value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHEIGHT() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHEIGHT(BigInteger value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad shape.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHAPE() {
        if (shape == null) {
            return "RoundRectangle";
        } else {
            return shape;
        }
    }

    /**
     * Define el valor de la propiedad shape.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHAPE(String value) {
        this.shape = value;
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
