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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}WaitingTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}WorkingTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Duration" minOccurs="0"/>
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
    "waitingTime",
    "workingTime",
    "duration"
})
@XmlRootElement(name = "TimeEstimation")
public class TimeEstimation {

    @XmlElement(name = "WaitingTime")
    protected String waitingTime;
    @XmlElement(name = "WorkingTime")
    protected String workingTime;
    @XmlElement(name = "Duration")
    protected String duration;

    /**
     * Obtiene el valor de la propiedad waitingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitingTime() {
        return waitingTime;
    }

    /**
     * Define el valor de la propiedad waitingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitingTime(String value) {
        this.waitingTime = value;
    }

    /**
     * Obtiene el valor de la propiedad workingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingTime() {
        return workingTime;
    }

    /**
     * Define el valor de la propiedad workingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingTime(String value) {
        this.workingTime = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

}
