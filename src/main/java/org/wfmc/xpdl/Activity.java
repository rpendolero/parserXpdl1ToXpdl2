//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 11:24:02 AM CET 
//


package org.wfmc.xpdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Limit" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Route"/>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Implementation"/>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}BlockActivity"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Performer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}StartMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FinishMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Priority" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}SimulationInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}TransitionRestrictions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ExtendedAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "performer",
    "startMode",
    "finishMode",
    "priority",
    "deadline",
    "simulationInformation",
    "icon",
    "documentation",
    "transitionRestrictions",
    "extendedAttributes"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Limit")
    protected String limit;
    @XmlElement(name = "Route")
    protected Route route;
    @XmlElement(name = "Implementation")
    protected Implementation implementation;
    @XmlElement(name = "BlockActivity")
    protected BlockActivity blockActivity;
    @XmlElement(name = "Performer")
    protected String performer;
    @XmlElement(name = "StartMode")
    protected StartMode startMode;
    @XmlElement(name = "FinishMode")
    protected FinishMode finishMode;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Deadline")
    protected List<Deadline> deadline;
    @XmlElement(name = "SimulationInformation")
    protected SimulationInformation simulationInformation;
    @XmlElement(name = "Icon")
    protected String icon;
    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "TransitionRestrictions")
    protected TransitionRestrictions transitionRestrictions;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad limit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Define el valor de la propiedad limit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
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
     * Obtiene el valor de la propiedad performer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * Define el valor de la propiedad performer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformer(String value) {
        this.performer = value;
    }

    /**
     * Obtiene el valor de la propiedad startMode.
     * 
     * @return
     *     possible object is
     *     {@link StartMode }
     *     
     */
    public StartMode getStartMode() {
        return startMode;
    }

    /**
     * Define el valor de la propiedad startMode.
     * 
     * @param value
     *     allowed object is
     *     {@link StartMode }
     *     
     */
    public void setStartMode(StartMode value) {
        this.startMode = value;
    }

    /**
     * Obtiene el valor de la propiedad finishMode.
     * 
     * @return
     *     possible object is
     *     {@link FinishMode }
     *     
     */
    public FinishMode getFinishMode() {
        return finishMode;
    }

    /**
     * Define el valor de la propiedad finishMode.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishMode }
     *     
     */
    public void setFinishMode(FinishMode value) {
        this.finishMode = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
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
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Define el valor de la propiedad icon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
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

}
