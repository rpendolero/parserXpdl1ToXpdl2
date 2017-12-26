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
 *         &lt;element name="DeadlineCondition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Execution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
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
    "deadlineCondition",
    "exceptionName"
})
@XmlRootElement(name = "Deadline")
public class Deadline {

    @XmlElement(name = "DeadlineCondition", required = true)
    protected Object deadlineCondition;
    @XmlElement(name = "ExceptionName", required = true)
    protected Object exceptionName;
    @XmlAttribute(name = "Execution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String execution;

    /**
     * Obtiene el valor de la propiedad deadlineCondition.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeadlineCondition() {
        return deadlineCondition;
    }

    /**
     * Define el valor de la propiedad deadlineCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeadlineCondition(Object value) {
        this.deadlineCondition = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionName.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExceptionName() {
        return exceptionName;
    }

    /**
     * Define el valor de la propiedad exceptionName.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExceptionName(Object value) {
        this.exceptionName = value;
    }

    /**
     * Obtiene el valor de la propiedad execution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecution() {
        return execution;
    }

    /**
     * Define el valor de la propiedad execution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecution(String value) {
        this.execution = value;
    }

}
