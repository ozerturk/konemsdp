//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.08 at 02:20:44 PM EEST 
//


package com.msdp.kone.m2m.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sourceIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sourceIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="operator" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="resourceSets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resourceSetId" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="domainApplication" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="enterpriseCustomer" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="user" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="gatewayGroup" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="gateway" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="sensor" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="resource" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="gatewayGroupSpec" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="gatewaySpec" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="sensorSpec" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *         &lt;element name="resourceSpec" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceIdentifiersType", propOrder = {

})
public class SourceIdentifiersType {

    protected Identifiers operator;
    protected SourceIdentifiersType.ResourceSets resourceSets;
    protected Identifiers domainApplication;
    protected Identifiers enterpriseCustomer;
    protected Identifiers user;
    protected Identifiers gatewayGroup;
    protected Identifiers gateway;
    protected Identifiers sensor;
    protected Identifiers resource;
    protected Identifiers gatewayGroupSpec;
    protected Identifiers gatewaySpec;
    protected Identifiers sensorSpec;
    protected Identifiers resourceSpec;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setOperator(Identifiers value) {
        this.operator = value;
    }

    /**
     * Gets the value of the resourceSets property.
     * 
     * @return
     *     possible object is
     *     {@link SourceIdentifiersType.ResourceSets }
     *     
     */
    public SourceIdentifiersType.ResourceSets getResourceSets() {
        return resourceSets;
    }

    /**
     * Sets the value of the resourceSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceIdentifiersType.ResourceSets }
     *     
     */
    public void setResourceSets(SourceIdentifiersType.ResourceSets value) {
        this.resourceSets = value;
    }

    /**
     * Gets the value of the domainApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getDomainApplication() {
        return domainApplication;
    }

    /**
     * Sets the value of the domainApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setDomainApplication(Identifiers value) {
        this.domainApplication = value;
    }

    /**
     * Gets the value of the enterpriseCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getEnterpriseCustomer() {
        return enterpriseCustomer;
    }

    /**
     * Sets the value of the enterpriseCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setEnterpriseCustomer(Identifiers value) {
        this.enterpriseCustomer = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setUser(Identifiers value) {
        this.user = value;
    }

    /**
     * Gets the value of the gatewayGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getGatewayGroup() {
        return gatewayGroup;
    }

    /**
     * Sets the value of the gatewayGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setGatewayGroup(Identifiers value) {
        this.gatewayGroup = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setGateway(Identifiers value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the sensor property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getSensor() {
        return sensor;
    }

    /**
     * Sets the value of the sensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setSensor(Identifiers value) {
        this.sensor = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setResource(Identifiers value) {
        this.resource = value;
    }

    /**
     * Gets the value of the gatewayGroupSpec property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getGatewayGroupSpec() {
        return gatewayGroupSpec;
    }

    /**
     * Sets the value of the gatewayGroupSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setGatewayGroupSpec(Identifiers value) {
        this.gatewayGroupSpec = value;
    }

    /**
     * Gets the value of the gatewaySpec property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getGatewaySpec() {
        return gatewaySpec;
    }

    /**
     * Sets the value of the gatewaySpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setGatewaySpec(Identifiers value) {
        this.gatewaySpec = value;
    }

    /**
     * Gets the value of the sensorSpec property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getSensorSpec() {
        return sensorSpec;
    }

    /**
     * Sets the value of the sensorSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setSensorSpec(Identifiers value) {
        this.sensorSpec = value;
    }

    /**
     * Gets the value of the resourceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getResourceSpec() {
        return resourceSpec;
    }

    /**
     * Sets the value of the resourceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setResourceSpec(Identifiers value) {
        this.resourceSpec = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resourceSetId" type="{urn:com:ericsson:schema:xml:m2m:protocols:vnd.ericsson.m2m.output}identifiers" maxOccurs="unbounded"/>
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
        "resourceSetId"
    })
    public static class ResourceSets {

        @XmlElement(required = true)
        protected List<Identifiers> resourceSetId;

        /**
         * Gets the value of the resourceSetId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceSetId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceSetId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Identifiers }
         * 
         * 
         */
        public List<Identifiers> getResourceSetId() {
            if (resourceSetId == null) {
                resourceSetId = new ArrayList<Identifiers>();
            }
            return this.resourceSetId;
        }

    }

}
