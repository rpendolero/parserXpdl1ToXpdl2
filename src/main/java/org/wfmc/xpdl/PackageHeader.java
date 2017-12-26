//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 11:24:02 AM CET 
//


package org.wfmc.xpdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}XPDLVersion"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Vendor"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Created"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}PriorityUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}CostUnit" minOccurs="0"/>
 *       &lt;/sequence>
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
    "costUnit"
})
@XmlRootElement(name = "PackageHeader")
public class PackageHeader {

    @XmlElement(name = "XPDLVersion", required = true)
    protected String xpdlVersion;
    @XmlElement(name = "Vendor", required = true)
    protected String vendor;
    @XmlElement(name = "Created", required = true)
    protected String created;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "PriorityUnit")
    protected String priorityUnit;
    @XmlElement(name = "CostUnit")
    protected String costUnit;

    /**
     * Obtiene el valor de la propiedad xpdlVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPDLVersion() {
        return xpdlVersion;
    }

    /**
     * Define el valor de la propiedad xpdlVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPDLVersion(String value) {
        this.xpdlVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Define el valor de la propiedad vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Obtiene el valor de la propiedad priorityUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityUnit() {
        return priorityUnit;
    }

    /**
     * Define el valor de la propiedad priorityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityUnit(String value) {
        this.priorityUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad costUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostUnit() {
        return costUnit;
    }

    /**
     * Define el valor de la propiedad costUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostUnit(String value) {
        this.costUnit = value;
    }

}
