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
 * <p>Java class for ActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="add"/&gt;
 *     &lt;enumeration value="modify"/&gt;
 *     &lt;enumeration value="noChange"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionTypeEntity {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("modify")
    MODIFY("modify"),
    @XmlEnumValue("noChange")
    NO_CHANGE("noChange"),
    @XmlEnumValue("delete")
    DELETE("delete");
    private final String value;

    ActionTypeEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTypeEntity fromValue(String v) {
        for (ActionTypeEntity c: ActionTypeEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}