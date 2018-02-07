//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.20 at 01:55:00 PM CEST 
//


package com.orange.onapbss.datamodel.productordering;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * <p>Java class for OrderItem complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="OrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="action" type="{http://orange.com/MEF/api/productOrder/v0/model}ActionType"/&gt;
 *         &lt;element name="state" type="{http://orange.com/MEF/api/productOrder/v0/model}StateType" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{http://orange.com/MEF/api/productOrder/v0/model}BillingAccountRef" minOccurs="0"/&gt;
 *         &lt;element name="productOffering" type="{http://orange.com/MEF/api/productOrder/v0/model}ProductOffering"/&gt;
 *         &lt;element name="product" type="{http://orange.com/MEF/api/productOrder/v0/model}Product" minOccurs="0"/&gt;
 *         &lt;element name="orderItemRelationship" type="{http://orange.com/MEF/api/productOrder/v0/model}OrderItemRelationShip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="qualificationRef" type="{http://orange.com/MEF/api/productOrder/v0/model}RelatedQualification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemaLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pricingMethod" type="{http://orange.com/MEF/api/productOrder/v0/model}pricingMethod" minOccurs="0"/&gt;
 *         &lt;element name="pricingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pricingTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItem", propOrder = {
        "id",
        "action",
        "state",
        "billingAccount",
        "productOffering",
        "product",
        "orderItemRelationship",
        "qualificationRef",
        "type",
        "schemaLocation",
        "pricingMethod",
        "pricingReference",
        "pricingTerm"
})
@Entity(name = "OrderItemEntity")
@Table(name = "ORDER_ITEM_ENTITY")
@Inheritance(strategy = InheritanceType.JOINED)
public class OrderItemEntity
        implements Serializable {

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    
    protected String id;
    @XmlElement(required = true)
    
    @XmlSchemaType(name = "string")
    protected ActionTypeEntity action;
    @XmlSchemaType(name = "string")
    protected StateTypeEntity state;
    protected BillingAccountRefEntity billingAccount;
    @XmlElement(required = true)
    
    protected ProductOfferingEntity productOffering;

    @JsonIgnore
    protected String product;

    protected List<OrderItemRelationShipEntity> orderItemRelationship;
    protected List<RelatedQualificationEntity> qualificationRef;
    @JsonProperty("@type")
    protected String type;
    @JsonProperty("@schemaLocation")
    protected String schemaLocation;
    @XmlSchemaType(name = "string")
    protected PricingMethodEntity pricingMethod;
    protected String pricingReference;
    protected Integer pricingTerm;
    @XmlAttribute(name = "Hjid")
    @JsonIgnore
    protected Long hjid;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    @Basic
    @Column(name = "ID", length = 100)
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return possible object is
     * {@link ActionTypeEntity }
     */
    @Basic
    @Column(name = "ACTION_", length = 255)
    public String getAction() {
        return action != null ? action.value() : null;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is
     *              {@link ActionTypeEntity }
     */
    public void setAction(String value) {
        if (value != null) {
            this.action = ActionTypeEntity.fromValue(value);
        }
    }

    public void setActionValue(ActionTypeEntity value) {
        this.action = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link StateTypeEntity }
     */
    @Basic
    @Column(name = "STATE_", length = 255)
    public String getState() {
        return state != null ? state.value() : null;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link StateTypeEntity }
     */
    public void setState(String value) {
        if (value != null) {
            this.state = StateTypeEntity.fromValue(value);
        }
    }

    public void setStateValue(StateTypeEntity value) {
        this.state = value;
    }

    /**
     * Gets the value of the billingAccount property.
     *
     * @return possible object is
     * {@link BillingAccountRefEntity }
     */
    @ManyToOne(targetEntity = BillingAccountRefEntity.class, cascade = {
            CascadeType.ALL
    })
    @JoinColumn(name = "BILLING_ACCOUNT_ORDER_ITEM_E_0")
    public BillingAccountRefEntity getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     *
     * @param value allowed object is
     *              {@link BillingAccountRefEntity }
     */
    public void setBillingAccount(BillingAccountRefEntity value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the productOffering property.
     *
     * @return possible object is
     * {@link ProductOfferingEntity }
     */
    @ManyToOne(targetEntity = ProductOfferingEntity.class, cascade = {
            CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCT_OFFERING_ORDER_ITEM__0")
    public ProductOfferingEntity getProductOffering() {
        return productOffering;
    }

    /**
     * Sets the value of the productOffering property.
     *
     * @param value allowed object is
     *              {@link ProductOfferingEntity }
     */
    public void setProductOffering(ProductOfferingEntity value) {
        this.productOffering = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return possible object is
     * {@link JsonNode }
     */
    @Lob
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value allowed object is
     *              {@link JsonNode }
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the orderItemRelationship property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRelationship property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRelationship().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemRelationShipEntity }
     */
    @OneToMany(targetEntity = OrderItemRelationShipEntity.class, cascade = {
            CascadeType.ALL
    })
    @JoinColumn(name = "ORDER_ITEM_RELATIONSHIP_ORDE_0")
    public List<OrderItemRelationShipEntity> getOrderItemRelationship() {
        if (orderItemRelationship == null) {
            orderItemRelationship = new ArrayList<OrderItemRelationShipEntity>();
        }
        return this.orderItemRelationship;
    }

    /**
     *
     *
     */
    public void setOrderItemRelationship(List<OrderItemRelationShipEntity> orderItemRelationship) {
        this.orderItemRelationship = orderItemRelationship;
    }

    /**
     * Gets the value of the qualificationRef property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualificationRef property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualificationRef().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedQualificationEntity }
     */
    @OneToMany(targetEntity = RelatedQualificationEntity.class, cascade = {
            CascadeType.ALL
    })
    @JoinColumn(name = "QUALIFICATION_REF_ORDER_ITEM_0")
    public List<RelatedQualificationEntity> getQualificationRef() {
        if (qualificationRef == null) {
            qualificationRef = new ArrayList<RelatedQualificationEntity>();
        }
        return this.qualificationRef;
    }

    /**
     *
     *
     */
    public void setQualificationRef(List<RelatedQualificationEntity> qualificationRef) {
        this.qualificationRef = qualificationRef;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the schemaLocation property.
     *
     * @return possible object is
     * {@link String }
     */
    @Basic
    @Column(name = "SCHEMA_LOCATION", length = 255)
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Sets the value of the schemaLocation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }

    /**
     * Gets the value of the pricingMethod property.
     *
     * @return possible object is
     * {@link PricingMethodEntity }
     */
    @Basic
    @Column(name = "PRICING_METHOD", length = 255)
    public String getPricingMethod() {

        return pricingMethod != null ? pricingMethod.value() : null;
    }

    /**
     * Sets the value of the pricingMethod property.
     *
     * @param value allowed object is
     *              {@link PricingMethodEntity }
     */
    public void setPricingMethod(String value) {
        if (value != null) {
            this.pricingMethod = PricingMethodEntity.fromValue(value);
        }
    }

    public void setPricingMethodValue(PricingMethodEntity value) {
        this.pricingMethod = value;
    }

    /**
     * Gets the value of the pricingReference property.
     *
     * @return possible object is
     * {@link String }
     */
    @Basic
    @Column(name = "PRICING_REFERENCE", length = 255)
    public String getPricingReference() {
        return pricingReference;
    }

    /**
     * Sets the value of the pricingReference property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPricingReference(String value) {
        this.pricingReference = value;
    }

    /**
     * Gets the value of the pricingTerm property.
     *
     * @return possible object is
     * {@link Integer }
     */
    @Basic
    @Column(name = "PRICING_TERM", precision = 10, scale = 0)
    public Integer getPricingTerm() {
        return pricingTerm;
    }

    /**
     * Sets the value of the pricingTerm property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPricingTerm(Integer value) {
        this.pricingTerm = value;
    }

    /**
     * Gets the value of the hjid property.
     *
     * @return possible object is
     * {@link Long }
     */
    @Id
    @Column(name = "HJID", length = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
