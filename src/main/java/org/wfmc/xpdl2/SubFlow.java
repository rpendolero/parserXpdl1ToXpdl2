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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ActualParameters"/>
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}DataMappings"/>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Execution" default="SYNCHR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PackageRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="InstanceDataField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivitySetId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="StartActivityId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
    "actualParameters",
    "dataMappings",
    "any"
})
@XmlRootElement(name = "SubFlow")
public class SubFlow {

    @XmlElement(name = "ActualParameters")
    protected ActualParameters actualParameters;
    @XmlElement(name = "DataMappings")
    protected DataMappings dataMappings;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Execution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String execution;
    @XmlAttribute(name = "PackageRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String packageRef;
    @XmlAttribute(name = "InstanceDataField")
    protected String instanceDataField;
    @XmlAttribute(name = "StartActivitySetId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String startActivitySetId;
    @XmlAttribute(name = "StartActivityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String startActivityId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad actualParameters.
     * 
     * @return
     *     possible object is
     *     {@link ActualParameters }
     *     
     */
    public ActualParameters getActualParameters() {
        return actualParameters;
    }

    /**
     * Define el valor de la propiedad actualParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualParameters }
     *     
     */
    public void setActualParameters(ActualParameters value) {
        this.actualParameters = value;
    }

    /**
     * Obtiene el valor de la propiedad dataMappings.
     * 
     * @return
     *     possible object is
     *     {@link DataMappings }
     *     
     */
    public DataMappings getDataMappings() {
        return dataMappings;
    }

    /**
     * Define el valor de la propiedad dataMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link DataMappings }
     *     
     */
    public void setDataMappings(DataMappings value) {
        this.dataMappings = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
        if (execution == null) {
            return "SYNCHR";
        } else {
            return execution;
        }
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

    /**
     * Obtiene el valor de la propiedad packageRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageRef() {
        return packageRef;
    }

    /**
     * Define el valor de la propiedad packageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageRef(String value) {
        this.packageRef = value;
    }

    /**
     * Obtiene el valor de la propiedad instanceDataField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceDataField() {
        return instanceDataField;
    }

    /**
     * Define el valor de la propiedad instanceDataField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceDataField(String value) {
        this.instanceDataField = value;
    }

    /**
     * Obtiene el valor de la propiedad startActivitySetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartActivitySetId() {
        return startActivitySetId;
    }

    /**
     * Define el valor de la propiedad startActivitySetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartActivitySetId(String value) {
        this.startActivitySetId = value;
    }

    /**
     * Obtiene el valor de la propiedad startActivityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartActivityId() {
        return startActivityId;
    }

    /**
     * Define el valor de la propiedad startActivityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartActivityId(String value) {
        this.startActivityId = value;
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
