
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDetRetVal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDetRetVal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custdet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://tempuri.org/}ArrayOfAnyType" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDetRetVal", propOrder = {
    "custdet",
    "picture",
    "accounts"
})
public class CustDetRetVal {

    protected String custdet;
    protected ArrayOfAnyType picture;
    @XmlElement(name = "Accounts")
    protected ArrayOfString accounts;

    /**
     * Gets the value of the custdet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustdet() {
        return custdet;
    }

    /**
     * Sets the value of the custdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustdet(String value) {
        this.custdet = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setPicture(ArrayOfAnyType value) {
        this.picture = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAccounts(ArrayOfString value) {
        this.accounts = value;
    }

}
