//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 11:24:02 AM CET 
//


package org.wfmc.xpdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="GraphConformance">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="FULL_BLOCKED"/>
 *             &lt;enumeration value="LOOP_BLOCKED"/>
 *             &lt;enumeration value="NON_BLOCKED"/>
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
@XmlType(name = "")
@XmlRootElement(name = "ConformanceClass")
public class ConformanceClass {

    @XmlAttribute(name = "GraphConformance")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String graphConformance;

    /**
     * Obtiene el valor de la propiedad graphConformance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphConformance() {
        return graphConformance;
    }

    /**
     * Define el valor de la propiedad graphConformance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphConformance(String value) {
        this.graphConformance = value;
    }

}
