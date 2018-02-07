//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.20 at 01:55:00 PM CEST 
//


package com.orange.onapbss.datamodel.productordering;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="acknowledged"/&gt;
 *     &lt;enumeration value="inProgress"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="held"/&gt;
 *     &lt;enumeration value="failed"/&gt;
 *     &lt;enumeration value="partial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StateType")
@XmlEnum
public enum StateTypeEntity {

    @XmlEnumValue("acknowledged")
    ACKNOWLEDGED("acknowledged"),
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("held")
    HELD("held"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("partial")
    PARTIAL("partial");
    private final String value;

    StateTypeEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateTypeEntity fromValue(String v) {
        for (StateTypeEntity c: StateTypeEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
