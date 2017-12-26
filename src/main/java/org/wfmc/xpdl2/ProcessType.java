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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para ProcessType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ProcessHeader"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}RedefinableHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}FormalParameters" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Participants" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Applications" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}DataFields" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ActivitySets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Activities" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Transitions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ExtendedAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Assignments" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}PartnerLinks" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Object" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessLevel" default="PUBLIC">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="PUBLIC"/>
 *             &lt;enumeration value="PRIVATE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProcessType" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Private"/>
 *             &lt;enumeration value="Abstract"/>
 *             &lt;enumeration value="Collaboration"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Ready"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Cancelled"/>
 *             &lt;enumeration value="Aborting"/>
 *             &lt;enumeration value="Aborted"/>
 *             &lt;enumeration value="Completing"/>
 *             &lt;enumeration value="Completed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SuppressJoinFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EnableInstanceCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdHoc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdHocOrdering" default="Parallel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sequential"/>
 *             &lt;enumeration value="Parallel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AdHocCompletionCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultStartActivitySetId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="DefaultStartActivityId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", propOrder = {
    "processHeader",
    "redefinableHeader",
    "formalParameters",
    "participants",
    "applications",
    "dataFields",
    "activitySets",
    "activities",
    "transitions",
    "extendedAttributes",
    "assignments",
    "partnerLinks",
    "object",
    "extensions",
    "any"
})
public class ProcessType {

    @XmlElement(name = "ProcessHeader", required = true)
    protected ProcessHeader processHeader;
    @XmlElement(name = "RedefinableHeader")
    protected RedefinableHeader redefinableHeader;
    @XmlElement(name = "FormalParameters")
    protected FormalParameters formalParameters;
    @XmlElement(name = "Participants")
    protected Participants participants;
    @XmlElement(name = "Applications")
    protected Applications applications;
    @XmlElement(name = "DataFields")
    protected DataFields dataFields;
    @XmlElement(name = "ActivitySets")
    protected ActivitySets activitySets;
    @XmlElement(name = "Activities")
    protected Activities activities;
    @XmlElement(name = "Transitions")
    protected Transitions transitions;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlElement(name = "Assignments")
    protected Assignments assignments;
    @XmlElement(name = "PartnerLinks")
    protected PartnerLinks partnerLinks;
    @XmlElement(name = "Object")
    protected org.wfmc.xpdl2.Object object;
    @XmlElement(name = "Extensions")
    protected java.lang.Object extensions;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AccessLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accessLevel;
    @XmlAttribute(name = "ProcessType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processType;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "SuppressJoinFailure")
    protected Boolean suppressJoinFailure;
    @XmlAttribute(name = "EnableInstanceCompensation")
    protected Boolean enableInstanceCompensation;
    @XmlAttribute(name = "AdHoc")
    protected Boolean adHoc;
    @XmlAttribute(name = "AdHocOrdering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adHocOrdering;
    @XmlAttribute(name = "AdHocCompletionCondition")
    protected String adHocCompletionCondition;
    @XmlAttribute(name = "DefaultStartActivitySetId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String defaultStartActivitySetId;
    @XmlAttribute(name = "DefaultStartActivityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String defaultStartActivityId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad processHeader.
     * 
     * @return
     *     possible object is
     *     {@link ProcessHeader }
     *     
     */
    public ProcessHeader getProcessHeader() {
        return processHeader;
    }

    /**
     * Define el valor de la propiedad processHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessHeader }
     *     
     */
    public void setProcessHeader(ProcessHeader value) {
        this.processHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad redefinableHeader.
     * 
     * @return
     *     possible object is
     *     {@link RedefinableHeader }
     *     
     */
    public RedefinableHeader getRedefinableHeader() {
        return redefinableHeader;
    }

    /**
     * Define el valor de la propiedad redefinableHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link RedefinableHeader }
     *     
     */
    public void setRedefinableHeader(RedefinableHeader value) {
        this.redefinableHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad formalParameters.
     * 
     * @return
     *     possible object is
     *     {@link FormalParameters }
     *     
     */
    public FormalParameters getFormalParameters() {
        return formalParameters;
    }

    /**
     * Define el valor de la propiedad formalParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalParameters }
     *     
     */
    public void setFormalParameters(FormalParameters value) {
        this.formalParameters = value;
    }

    /**
     * Obtiene el valor de la propiedad participants.
     * 
     * @return
     *     possible object is
     *     {@link Participants }
     *     
     */
    public Participants getParticipants() {
        return participants;
    }

    /**
     * Define el valor de la propiedad participants.
     * 
     * @param value
     *     allowed object is
     *     {@link Participants }
     *     
     */
    public void setParticipants(Participants value) {
        this.participants = value;
    }

    /**
     * Obtiene el valor de la propiedad applications.
     * 
     * @return
     *     possible object is
     *     {@link Applications }
     *     
     */
    public Applications getApplications() {
        return applications;
    }

    /**
     * Define el valor de la propiedad applications.
     * 
     * @param value
     *     allowed object is
     *     {@link Applications }
     *     
     */
    public void setApplications(Applications value) {
        this.applications = value;
    }

    /**
     * Obtiene el valor de la propiedad dataFields.
     * 
     * @return
     *     possible object is
     *     {@link DataFields }
     *     
     */
    public DataFields getDataFields() {
        return dataFields;
    }

    /**
     * Define el valor de la propiedad dataFields.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFields }
     *     
     */
    public void setDataFields(DataFields value) {
        this.dataFields = value;
    }

    /**
     * Obtiene el valor de la propiedad activitySets.
     * 
     * @return
     *     possible object is
     *     {@link ActivitySets }
     *     
     */
    public ActivitySets getActivitySets() {
        return activitySets;
    }

    /**
     * Define el valor de la propiedad activitySets.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitySets }
     *     
     */
    public void setActivitySets(ActivitySets value) {
        this.activitySets = value;
    }

    /**
     * Obtiene el valor de la propiedad activities.
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * Define el valor de la propiedad activities.
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setActivities(Activities value) {
        this.activities = value;
    }

    /**
     * Obtiene el valor de la propiedad transitions.
     * 
     * @return
     *     possible object is
     *     {@link Transitions }
     *     
     */
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * Define el valor de la propiedad transitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Transitions }
     *     
     */
    public void setTransitions(Transitions value) {
        this.transitions = value;
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
     * Obtiene el valor de la propiedad assignments.
     * 
     * @return
     *     possible object is
     *     {@link Assignments }
     *     
     */
    public Assignments getAssignments() {
        return assignments;
    }

    /**
     * Define el valor de la propiedad assignments.
     * 
     * @param value
     *     allowed object is
     *     {@link Assignments }
     *     
     */
    public void setAssignments(Assignments value) {
        this.assignments = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerLinks.
     * 
     * @return
     *     possible object is
     *     {@link PartnerLinks }
     *     
     */
    public PartnerLinks getPartnerLinks() {
        return partnerLinks;
    }

    /**
     * Define el valor de la propiedad partnerLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerLinks }
     *     
     */
    public void setPartnerLinks(PartnerLinks value) {
        this.partnerLinks = value;
    }

    /**
     * Obtiene el valor de la propiedad object.
     * 
     * @return
     *     possible object is
     *     {@link org.wfmc.xpdl2.Object }
     *     
     */
    public org.wfmc.xpdl2.Object getObject() {
        return object;
    }

    /**
     * Define el valor de la propiedad object.
     * 
     * @param value
     *     allowed object is
     *     {@link org.wfmc.xpdl2.Object }
     *     
     */
    public void setObject(org.wfmc.xpdl2.Object value) {
        this.object = value;
    }

    /**
     * Obtiene el valor de la propiedad extensions.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getExtensions() {
        return extensions;
    }

    /**
     * Define el valor de la propiedad extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setExtensions(java.lang.Object value) {
        this.extensions = value;
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
     * Obtiene el valor de la propiedad accessLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        if (accessLevel == null) {
            return "PUBLIC";
        } else {
            return accessLevel;
        }
    }

    /**
     * Define el valor de la propiedad accessLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad processType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        if (processType == null) {
            return "None";
        } else {
            return processType;
        }
    }

    /**
     * Define el valor de la propiedad processType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "None";
        } else {
            return status;
        }
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad suppressJoinFailure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSuppressJoinFailure() {
        if (suppressJoinFailure == null) {
            return false;
        } else {
            return suppressJoinFailure;
        }
    }

    /**
     * Define el valor de la propiedad suppressJoinFailure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressJoinFailure(Boolean value) {
        this.suppressJoinFailure = value;
    }

    /**
     * Obtiene el valor de la propiedad enableInstanceCompensation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnableInstanceCompensation() {
        if (enableInstanceCompensation == null) {
            return false;
        } else {
            return enableInstanceCompensation;
        }
    }

    /**
     * Define el valor de la propiedad enableInstanceCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableInstanceCompensation(Boolean value) {
        this.enableInstanceCompensation = value;
    }

    /**
     * Obtiene el valor de la propiedad adHoc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdHoc() {
        if (adHoc == null) {
            return false;
        } else {
            return adHoc;
        }
    }

    /**
     * Define el valor de la propiedad adHoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdHoc(Boolean value) {
        this.adHoc = value;
    }

    /**
     * Obtiene el valor de la propiedad adHocOrdering.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocOrdering() {
        if (adHocOrdering == null) {
            return "Parallel";
        } else {
            return adHocOrdering;
        }
    }

    /**
     * Define el valor de la propiedad adHocOrdering.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocOrdering(String value) {
        this.adHocOrdering = value;
    }

    /**
     * Obtiene el valor de la propiedad adHocCompletionCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocCompletionCondition() {
        return adHocCompletionCondition;
    }

    /**
     * Define el valor de la propiedad adHocCompletionCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocCompletionCondition(String value) {
        this.adHocCompletionCondition = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultStartActivitySetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStartActivitySetId() {
        return defaultStartActivitySetId;
    }

    /**
     * Define el valor de la propiedad defaultStartActivitySetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStartActivitySetId(String value) {
        this.defaultStartActivitySetId = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultStartActivityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStartActivityId() {
        return defaultStartActivityId;
    }

    /**
     * Define el valor de la propiedad defaultStartActivityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStartActivityId(String value) {
        this.defaultStartActivityId = value;
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
