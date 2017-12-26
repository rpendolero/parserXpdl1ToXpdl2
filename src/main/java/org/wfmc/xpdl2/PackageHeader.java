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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}XPDLVersion"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Vendor"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Created"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}PriorityUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}CostUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}VendorExtensions" minOccurs="0"/>
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
    "xpdlVersion",
    "vendor",
    "created",
    "description",
    "documentation",
    "priorityUnit",
    "costUnit",
    "vendorExtensions",
    "any"
})
@XmlRootElement(name = "PackageHeader")
public class PackageHeader {

    @XmlElement(name = "XPDLVersion", required = true)
    protected XPDLVersion xpdlVersion;
    @XmlElement(name = "Vendor", required = true)
    protected Vendor vendor;
    @XmlElement(name = "Created", required = true)
    protected Created created;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "Documentation")
    protected Documentation documentation;
    @XmlElement(name = "PriorityUnit")
    protected PriorityUnit priorityUnit;
    @XmlElement(name = "CostUnit")
    protected CostUnit costUnit;
    @XmlElement(name = "VendorExtensions")
    protected VendorExtensions vendorExtensions;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad xpdlVersion.
     * 
     * @return
     *     possible object is
     *     {@link XPDLVersion }
     *     
     */
    public XPDLVersion getXPDLVersion() {
        return xpdlVersion;
    }

    /**
     * Define el valor de la propiedad xpdlVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link XPDLVersion }
     *     
     */
    public void setXPDLVersion(XPDLVersion value) {
        this.xpdlVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Define el valor de la propiedad vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     * @return
     *     possible object is
     *     {@link Created }
     *     
     */
    public Created getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     * @param value
     *     allowed object is
     *     {@link Created }
     *     
     */
    public void setCreated(Created value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Obtiene el valor de la propiedad priorityUnit.
     * 
     * @return
     *     possible object is
     *     {@link PriorityUnit }
     *     
     */
    public PriorityUnit getPriorityUnit() {
        return priorityUnit;
    }

    /**
     * Define el valor de la propiedad priorityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityUnit }
     *     
     */
    public void setPriorityUnit(PriorityUnit value) {
        this.priorityUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad costUnit.
     * 
     * @return
     *     possible object is
     *     {@link CostUnit }
     *     
     */
    public CostUnit getCostUnit() {
        return costUnit;
    }

    /**
     * Define el valor de la propiedad costUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link CostUnit }
     *     
     */
    public void setCostUnit(CostUnit value) {
        this.costUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorExtensions.
     * 
     * @return
     *     possible object is
     *     {@link VendorExtensions }
     *     
     */
    public VendorExtensions getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * Define el valor de la propiedad vendorExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorExtensions }
     *     
     */
    public void setVendorExtensions(VendorExtensions value) {
        this.vendorExtensions = value;
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
