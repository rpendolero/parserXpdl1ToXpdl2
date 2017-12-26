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
import javax.xml.bind.annotation.XmlID;
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
 *         &lt;group ref="{http://www.wfmc.org/2004/XPDL2.0alpha}DataTypes"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ExtendedAttributes" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "basicType",
    "declaredType",
    "schemaType",
    "externalReference",
    "recordType",
    "unionType",
    "enumerationType",
    "arrayType",
    "listType",
    "description",
    "extendedAttributes",
    "any"
})
@XmlRootElement(name = "TypeDeclaration")
public class TypeDeclaration {

    @XmlElement(name = "BasicType")
    protected BasicType basicType;
    @XmlElement(name = "DeclaredType")
    protected DeclaredType declaredType;
    @XmlElement(name = "SchemaType")
    protected SchemaType schemaType;
    @XmlElement(name = "ExternalReference")
    protected ExternalReference externalReference;
    @XmlElement(name = "RecordType")
    protected RecordType recordType;
    @XmlElement(name = "UnionType")
    protected UnionType unionType;
    @XmlElement(name = "EnumerationType")
    protected EnumerationType enumerationType;
    @XmlElement(name = "ArrayType")
    protected ArrayType arrayType;
    @XmlElement(name = "ListType")
    protected ListType listType;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad basicType.
     * 
     * @return
     *     possible object is
     *     {@link BasicType }
     *     
     */
    public BasicType getBasicType() {
        return basicType;
    }

    /**
     * Define el valor de la propiedad basicType.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicType }
     *     
     */
    public void setBasicType(BasicType value) {
        this.basicType = value;
    }

    /**
     * Obtiene el valor de la propiedad declaredType.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredType }
     *     
     */
    public DeclaredType getDeclaredType() {
        return declaredType;
    }

    /**
     * Define el valor de la propiedad declaredType.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredType }
     *     
     */
    public void setDeclaredType(DeclaredType value) {
        this.declaredType = value;
    }

    /**
     * Obtiene el valor de la propiedad schemaType.
     * 
     * @return
     *     possible object is
     *     {@link SchemaType }
     *     
     */
    public SchemaType getSchemaType() {
        return schemaType;
    }

    /**
     * Define el valor de la propiedad schemaType.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaType }
     *     
     */
    public void setSchemaType(SchemaType value) {
        this.schemaType = value;
    }

    /**
     * Obtiene el valor de la propiedad externalReference.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReference }
     *     
     */
    public ExternalReference getExternalReference() {
        return externalReference;
    }

    /**
     * Define el valor de la propiedad externalReference.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReference }
     *     
     */
    public void setExternalReference(ExternalReference value) {
        this.externalReference = value;
    }

    /**
     * Obtiene el valor de la propiedad recordType.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * Define el valor de la propiedad recordType.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * Obtiene el valor de la propiedad unionType.
     * 
     * @return
     *     possible object is
     *     {@link UnionType }
     *     
     */
    public UnionType getUnionType() {
        return unionType;
    }

    /**
     * Define el valor de la propiedad unionType.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionType }
     *     
     */
    public void setUnionType(UnionType value) {
        this.unionType = value;
    }

    /**
     * Obtiene el valor de la propiedad enumerationType.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationType }
     *     
     */
    public EnumerationType getEnumerationType() {
        return enumerationType;
    }

    /**
     * Define el valor de la propiedad enumerationType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationType }
     *     
     */
    public void setEnumerationType(EnumerationType value) {
        this.enumerationType = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayType.
     * 
     * @return
     *     possible object is
     *     {@link ArrayType }
     *     
     */
    public ArrayType getArrayType() {
        return arrayType;
    }

    /**
     * Define el valor de la propiedad arrayType.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayType }
     *     
     */
    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }

    /**
     * Obtiene el valor de la propiedad listType.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getListType() {
        return listType;
    }

    /**
     * Define el valor de la propiedad listType.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setListType(ListType value) {
        this.listType = value;
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
     * Obtiene el valor de la propiedad extendedAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAttributes }
     *     
     */
    public ExtendedAttributes getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Define el valor de la propiedad extendedAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAttributes }
     *     
     */
    public void setExtendedAttributes(ExtendedAttributes value) {
        this.extendedAttributes = value;
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
