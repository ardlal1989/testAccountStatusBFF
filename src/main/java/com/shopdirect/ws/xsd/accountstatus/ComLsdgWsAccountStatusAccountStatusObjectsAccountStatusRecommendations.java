//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.08 at 10:53:55 PM IST 
//


package com.shopdirect.ws.xsd.accountstatus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.lsdg.ws.AccountStatus.AccountStatusObjects.AccountStatusRecommendations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.lsdg.ws.AccountStatus.AccountStatusObjects.AccountStatusRecommendations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountStatusType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="accountStatusRecommendation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.lsdg.ws.AccountStatus.AccountStatusObjects.AccountStatusRecommendations", propOrder = {
    "accountStatusType",
    "accountStatusRecommendation"
})
public class ComLsdgWsAccountStatusAccountStatusObjectsAccountStatusRecommendations {

    @XmlElement(required = true)
    protected BigInteger accountStatusType;
    @XmlElement(required = true)
    protected String accountStatusRecommendation;

    /**
     * Gets the value of the accountStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountStatusType() {
        return accountStatusType;
    }

    /**
     * Sets the value of the accountStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountStatusType(BigInteger value) {
        this.accountStatusType = value;
    }

    /**
     * Gets the value of the accountStatusRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusRecommendation() {
        return accountStatusRecommendation;
    }

    /**
     * Sets the value of the accountStatusRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusRecommendation(String value) {
        this.accountStatusRecommendation = value;
    }

}
