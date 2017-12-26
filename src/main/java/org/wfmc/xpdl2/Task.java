//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.12.22 a las 01:39:09 PM CET 
//


package org.wfmc.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


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
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskService"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskReceive"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskManual"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskReference"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskScript"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskSend"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskUser"/>
 *         &lt;element ref="{http://www.wfmc.org/2004/XPDL2.0alpha}TaskApplication"/>
 *       &lt;/choice>
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
    "taskService",
    "taskReceive",
    "taskManual",
    "taskReference",
    "taskScript",
    "taskSend",
    "taskUser",
    "taskApplication"
})
@XmlRootElement(name = "Task")
public class Task {

    @XmlElement(name = "TaskService")
    protected TaskService taskService;
    @XmlElement(name = "TaskReceive")
    protected TaskReceive taskReceive;
    @XmlElement(name = "TaskManual")
    protected TaskManual taskManual;
    @XmlElement(name = "TaskReference")
    protected TaskReference taskReference;
    @XmlElement(name = "TaskScript")
    protected TaskScript taskScript;
    @XmlElement(name = "TaskSend")
    protected TaskSend taskSend;
    @XmlElement(name = "TaskUser")
    protected TaskUser taskUser;
    @XmlElement(name = "TaskApplication")
    protected TaskApplication taskApplication;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad taskService.
     * 
     * @return
     *     possible object is
     *     {@link TaskService }
     *     
     */
    public TaskService getTaskService() {
        return taskService;
    }

    /**
     * Define el valor de la propiedad taskService.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskService }
     *     
     */
    public void setTaskService(TaskService value) {
        this.taskService = value;
    }

    /**
     * Obtiene el valor de la propiedad taskReceive.
     * 
     * @return
     *     possible object is
     *     {@link TaskReceive }
     *     
     */
    public TaskReceive getTaskReceive() {
        return taskReceive;
    }

    /**
     * Define el valor de la propiedad taskReceive.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReceive }
     *     
     */
    public void setTaskReceive(TaskReceive value) {
        this.taskReceive = value;
    }

    /**
     * Obtiene el valor de la propiedad taskManual.
     * 
     * @return
     *     possible object is
     *     {@link TaskManual }
     *     
     */
    public TaskManual getTaskManual() {
        return taskManual;
    }

    /**
     * Define el valor de la propiedad taskManual.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManual }
     *     
     */
    public void setTaskManual(TaskManual value) {
        this.taskManual = value;
    }

    /**
     * Obtiene el valor de la propiedad taskReference.
     * 
     * @return
     *     possible object is
     *     {@link TaskReference }
     *     
     */
    public TaskReference getTaskReference() {
        return taskReference;
    }

    /**
     * Define el valor de la propiedad taskReference.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReference }
     *     
     */
    public void setTaskReference(TaskReference value) {
        this.taskReference = value;
    }

    /**
     * Obtiene el valor de la propiedad taskScript.
     * 
     * @return
     *     possible object is
     *     {@link TaskScript }
     *     
     */
    public TaskScript getTaskScript() {
        return taskScript;
    }

    /**
     * Define el valor de la propiedad taskScript.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskScript }
     *     
     */
    public void setTaskScript(TaskScript value) {
        this.taskScript = value;
    }

    /**
     * Obtiene el valor de la propiedad taskSend.
     * 
     * @return
     *     possible object is
     *     {@link TaskSend }
     *     
     */
    public TaskSend getTaskSend() {
        return taskSend;
    }

    /**
     * Define el valor de la propiedad taskSend.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSend }
     *     
     */
    public void setTaskSend(TaskSend value) {
        this.taskSend = value;
    }

    /**
     * Obtiene el valor de la propiedad taskUser.
     * 
     * @return
     *     possible object is
     *     {@link TaskUser }
     *     
     */
    public TaskUser getTaskUser() {
        return taskUser;
    }

    /**
     * Define el valor de la propiedad taskUser.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskUser }
     *     
     */
    public void setTaskUser(TaskUser value) {
        this.taskUser = value;
    }

    /**
     * Obtiene el valor de la propiedad taskApplication.
     * 
     * @return
     *     possible object is
     *     {@link TaskApplication }
     *     
     */
    public TaskApplication getTaskApplication() {
        return taskApplication;
    }

    /**
     * Define el valor de la propiedad taskApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskApplication }
     *     
     */
    public void setTaskApplication(TaskApplication value) {
        this.taskApplication = value;
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
