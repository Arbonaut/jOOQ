//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.23 at 06:55:19 PM CEST 
//


package org.jooq.conf;

import org.arbonaut.xml.bind.annotation.XmlEnum;
import org.arbonaut.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderKeywordStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenderKeywordStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOWER"/>
 *     &lt;enumeration value="UPPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenderKeywordStyle")
@XmlEnum
public enum RenderKeywordStyle {

    LOWER,
    UPPER;

    public String value() {
        return name();
    }

    public static RenderKeywordStyle fromValue(String v) {
        return valueOf(v);
    }

}
