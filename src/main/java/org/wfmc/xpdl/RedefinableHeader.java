//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 11:24:02 AM CET 
//


package org.wfmc.xpdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Author" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Version" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Codepage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Countrykey" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Responsibles" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PublicationStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="UNDER_REVISION"/>
 *             &lt;enumeration value="RELEASED"/>
 *             &lt;enumeration value="UNDER_TEST"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "author",
    "version",
    "codepage",
    "countrykey",
    "responsibles"
})
@XmlRootElement(name = "RedefinableHeader")
public class RedefinableHeader {

    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Codepage")
    protected String codepage;
    @XmlElement(name = "Countrykey")
    protected String countrykey;
    @XmlElement(name = "Responsibles")
    protected Responsibles responsibles;
    @XmlAttribute(name = "PublicationStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationStatus;

    /**
     * Obtiene el valor de la propiedad author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Define el valor de la propiedad author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad codepage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodepage() {
        return codepage;
    }

    /**
     * Define el valor de la propiedad codepage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodepage(String value) {
        this.codepage = value;
    }

    /**
     * Obtiene el valor de la propiedad countrykey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrykey() {
        return countrykey;
    }

    /**
     * Define el valor de la propiedad countrykey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrykey(String value) {
        this.countrykey = value;
    }

    /**
     * Obtiene el valor de la propiedad responsibles.
     * 
     * @return
     *     possible object is
     *     {@link Responsibles }
     *     
     */
    public Responsibles getResponsibles() {
        return responsibles;
    }

    /**
     * Define el valor de la propiedad responsibles.
     * 
     * @param value
     *     allowed object is
     *     {@link Responsibles }
     *     
     */
    public void setResponsibles(Responsibles value) {
        this.responsibles = value;
    }

    /**
     * Obtiene el valor de la propiedad publicationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * Define el valor de la propiedad publicationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationStatus(String value) {
        this.publicationStatus = value;
    }

}
