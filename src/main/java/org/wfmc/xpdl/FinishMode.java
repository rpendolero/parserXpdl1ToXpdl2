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
 *       &lt;choice>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Automatic"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Manual"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "automatic",
    "manual"
})
@XmlRootElement(name = "FinishMode")
public class FinishMode {

    @XmlElement(name = "Automatic")
    protected Automatic automatic;
    @XmlElement(name = "Manual")
    protected Manual manual;

    /**
     * Obtiene el valor de la propiedad automatic.
     * 
     * @return
     *     possible object is
     *     {@link Automatic }
     *     
     */
    public Automatic getAutomatic() {
        return automatic;
    }

    /**
     * Define el valor de la propiedad automatic.
     * 
     * @param value
     *     allowed object is
     *     {@link Automatic }
     *     
     */
    public void setAutomatic(Automatic value) {
        this.automatic = value;
    }

    /**
     * Obtiene el valor de la propiedad manual.
     * 
     * @return
     *     possible object is
     *     {@link Manual }
     *     
     */
    public Manual getManual() {
        return manual;
    }

    /**
     * Define el valor de la propiedad manual.
     * 
     * @param value
     *     allowed object is
     *     {@link Manual }
     *     
     */
    public void setManual(Manual value) {
        this.manual = value;
    }

}
