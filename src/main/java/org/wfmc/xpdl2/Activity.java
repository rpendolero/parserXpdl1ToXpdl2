//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 01:39:09 PM CET 
//


package org.wfmc.xpdl2;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Limit" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Route"/>
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Implementation"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}BlockActivity"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Event"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Transaction" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Performer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Performers" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Priority" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}SimulationInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TransitionRestrictions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}ExtendedAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}InputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}OutputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}IORules" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Loop" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Assignments" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}NodeGraphicsInfos" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       &lt;attribute name="StartMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FinishMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="IsATransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "description",
    "limit",
    "route",
    "implementation",
    "blockActivity",
    "event",
    "transaction",
    "performer",
    "performers",
    "priority",
    "deadline",
    "simulationInformation",
    "icon",
    "documentation",
    "transitionRestrictions",
    "extendedAttributes",
    "dataFields",
    "inputSets",
    "outputSets",
    "ioRules",
    "loop",
    "assignments",
    "object",
    "nodeGraphicsInfos",
    "extensions",
    "any"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "Limit")
    protected Limit limit;
    @XmlElement(name = "Route")
    protected Route route;
    @XmlElement(name = "Implementation")
    protected Implementation implementation;
    @XmlElement(name = "BlockActivity")
    protected BlockActivity blockActivity;
    @XmlElement(name = "Event")
    protected Event event;
    @XmlElement(name = "Transaction")
    protected Transaction transaction;
    @XmlElement(name = "Performer")
    protected Performer performer;
    @XmlElement(name = "Performers")
    protected Performers performers;
    @XmlElement(name = "Priority")
    protected Priority priority;
    @XmlElement(name = "Deadline")
    protected List<Deadline> deadline;
    @XmlElement(name = "SimulationInformation")
    protected SimulationInformation simulationInformation;
    @XmlElement(name = "Icon")
    protected Icon icon;
    @XmlElement(name = "Documentation")
    protected Documentation documentation;
    @XmlElement(name = "TransitionRestrictions")
    protected TransitionRestrictions transitionRestrictions;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlElement(name = "DataFields")
    protected DataFields dataFields;
    @XmlElement(name = "InputSets")
    protected InputSets inputSets;
    @XmlElement(name = "OutputSets")
    protected OutputSets outputSets;
    @XmlElement(name = "IORules")
    protected IORules ioRules;
    @XmlElement(name = "Loop")
    protected Loop loop;
    @XmlElement(name = "Assignments")
    protected Assignments assignments;
    @XmlElement(name = "Object")
    protected org.wfmc.xpdl2.Object object;
    @XmlElement(name = "NodeGraphicsInfos")
    protected NodeGraphicsInfos nodeGraphicsInfos;
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
    @XmlAttribute(name = "StartActivity")
    protected Boolean startActivity;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "StartMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startMode;
    @XmlAttribute(name = "FinishMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String finishMode;
    @XmlAttribute(name = "StartQuantity")
    protected BigInteger startQuantity;
    @XmlAttribute(name = "IsATransaction")
    protected Boolean isATransaction;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Obtiene el valor de la propiedad limit.
     * 
     * @return
     *     possible object is
     *     {@link Limit }
     *     
     */
    public Limit getLimit() {
        return limit;
    }

    /**
     * Define el valor de la propiedad limit.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit }
     *     
     */
    public void setLimit(Limit value) {
        this.limit = value;
    }

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

    /**
     * Obtiene el valor de la propiedad implementation.
     * 
     * @return
     *     possible object is
     *     {@link Implementation }
     *     
     */
    public Implementation getImplementation() {
        return implementation;
    }

    /**
     * Define el valor de la propiedad implementation.
     * 
     * @param value
     *     allowed object is
     *     {@link Implementation }
     *     
     */
    public void setImplementation(Implementation value) {
        this.implementation = value;
    }

    /**
     * Obtiene el valor de la propiedad blockActivity.
     * 
     * @return
     *     possible object is
     *     {@link BlockActivity }
     *     
     */
    public BlockActivity getBlockActivity() {
        return blockActivity;
    }

    /**
     * Define el valor de la propiedad blockActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockActivity }
     *     
     */
    public void setBlockActivity(BlockActivity value) {
        this.blockActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

    /**
     * Obtiene el valor de la propiedad performer.
     * 
     * @return
     *     possible object is
     *     {@link Performer }
     *     
     */
    public Performer getPerformer() {
        return performer;
    }

    /**
     * Define el valor de la propiedad performer.
     * 
     * @param value
     *     allowed object is
     *     {@link Performer }
     *     
     */
    public void setPerformer(Performer value) {
        this.performer = value;
    }

    /**
     * Obtiene el valor de la propiedad performers.
     * 
     * @return
     *     possible object is
     *     {@link Performers }
     *     
     */
    public Performers getPerformers() {
        return performers;
    }

    /**
     * Define el valor de la propiedad performers.
     * 
     * @param value
     *     allowed object is
     *     {@link Performers }
     *     
     */
    public void setPerformers(Performers value) {
        this.performers = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deadline }
     * 
     * 
     */
    public List<Deadline> getDeadline() {
        if (deadline == null) {
            deadline = new ArrayList<Deadline>();
        }
        return this.deadline;
    }

    /**
     * Obtiene el valor de la propiedad simulationInformation.
     * 
     * @return
     *     possible object is
     *     {@link SimulationInformation }
     *     
     */
    public SimulationInformation getSimulationInformation() {
        return simulationInformation;
    }

    /**
     * Define el valor de la propiedad simulationInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link SimulationInformation }
     *     
     */
    public void setSimulationInformation(SimulationInformation value) {
        this.simulationInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad icon.
     * 
     * @return
     *     possible object is
     *     {@link Icon }
     *     
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Define el valor de la propiedad icon.
     * 
     * @param value
     *     allowed object is
     *     {@link Icon }
     *     
     */
    public void setIcon(Icon value) {
        this.icon = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Obtiene el valor de la propiedad transitionRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link TransitionRestrictions }
     *     
     */
    public TransitionRestrictions getTransitionRestrictions() {
        return transitionRestrictions;
    }

    /**
     * Define el valor de la propiedad transitionRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionRestrictions }
     *     
     */
    public void setTransitionRestrictions(TransitionRestrictions value) {
        this.transitionRestrictions = value;
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
     * Obtiene el valor de la propiedad inputSets.
     * 
     * @return
     *     possible object is
     *     {@link InputSets }
     *     
     */
    public InputSets getInputSets() {
        return inputSets;
    }

    /**
     * Define el valor de la propiedad inputSets.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSets }
     *     
     */
    public void setInputSets(InputSets value) {
        this.inputSets = value;
    }

    /**
     * Obtiene el valor de la propiedad outputSets.
     * 
     * @return
     *     possible object is
     *     {@link OutputSets }
     *     
     */
    public OutputSets getOutputSets() {
        return outputSets;
    }

    /**
     * Define el valor de la propiedad outputSets.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSets }
     *     
     */
    public void setOutputSets(OutputSets value) {
        this.outputSets = value;
    }

    /**
     * Obtiene el valor de la propiedad ioRules.
     * 
     * @return
     *     possible object is
     *     {@link IORules }
     *     
     */
    public IORules getIORules() {
        return ioRules;
    }

    /**
     * Define el valor de la propiedad ioRules.
     * 
     * @param value
     *     allowed object is
     *     {@link IORules }
     *     
     */
    public void setIORules(IORules value) {
        this.ioRules = value;
    }

    /**
     * Obtiene el valor de la propiedad loop.
     * 
     * @return
     *     possible object is
     *     {@link Loop }
     *     
     */
    public Loop getLoop() {
        return loop;
    }

    /**
     * Define el valor de la propiedad loop.
     * 
     * @param value
     *     allowed object is
     *     {@link Loop }
     *     
     */
    public void setLoop(Loop value) {
        this.loop = value;
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
     * Obtiene el valor de la propiedad nodeGraphicsInfos.
     * 
     * @return
     *     possible object is
     *     {@link NodeGraphicsInfos }
     *     
     */
    public NodeGraphicsInfos getNodeGraphicsInfos() {
        return nodeGraphicsInfos;
    }

    /**
     * Define el valor de la propiedad nodeGraphicsInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGraphicsInfos }
     *     
     */
    public void setNodeGraphicsInfos(NodeGraphicsInfos value) {
        this.nodeGraphicsInfos = value;
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
     * Obtiene el valor de la propiedad startActivity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartActivity() {
        return startActivity;
    }

    /**
     * Define el valor de la propiedad startActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartActivity(Boolean value) {
        this.startActivity = value;
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
     * Obtiene el valor de la propiedad startMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMode() {
        return startMode;
    }

    /**
     * Define el valor de la propiedad startMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMode(String value) {
        this.startMode = value;
    }

    /**
     * Obtiene el valor de la propiedad finishMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishMode() {
        return finishMode;
    }

    /**
     * Define el valor de la propiedad finishMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishMode(String value) {
        this.finishMode = value;
    }

    /**
     * Obtiene el valor de la propiedad startQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartQuantity() {
        if (startQuantity == null) {
            return new BigInteger("1");
        } else {
            return startQuantity;
        }
    }

    /**
     * Define el valor de la propiedad startQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartQuantity(BigInteger value) {
        this.startQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad isATransaction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsATransaction() {
        if (isATransaction == null) {
            return false;
        } else {
            return isATransaction;
        }
    }

    /**
     * Define el valor de la propiedad isATransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsATransaction(Boolean value) {
        this.isATransaction = value;
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
