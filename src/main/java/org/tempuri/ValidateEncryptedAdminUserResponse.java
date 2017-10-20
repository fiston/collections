
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ValidateEncryptedAdminUserResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "validateEncryptedAdminUserResult"
})
@XmlRootElement(name = "ValidateEncryptedAdminUserResponse")
public class ValidateEncryptedAdminUserResponse {

    @XmlElement(name = "ValidateEncryptedAdminUserResult")
    protected String validateEncryptedAdminUserResult;

    /**
     * Gets the value of the validateEncryptedAdminUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateEncryptedAdminUserResult() {
        return validateEncryptedAdminUserResult;
    }

    /**
     * Sets the value of the validateEncryptedAdminUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateEncryptedAdminUserResult(String value) {
        this.validateEncryptedAdminUserResult = value;
    }

}
