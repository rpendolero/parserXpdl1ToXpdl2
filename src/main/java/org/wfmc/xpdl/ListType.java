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
 *       &lt;group ref="{http://www.wfmc.org/2002/XPDL1.0}DataTypes"/>
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
    "listType"
})
@XmlRootElement(name = "ListType")
public class ListType {

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

}
