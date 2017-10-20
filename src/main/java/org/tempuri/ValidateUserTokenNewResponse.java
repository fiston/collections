
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
 *         &lt;element name="ValidateUserToken_NewResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "validateUserTokenNewResult"
})
@XmlRootElement(name = "ValidateUserToken_NewResponse")
public class ValidateUserTokenNewResponse {

    @XmlElement(name = "ValidateUserToken_NewResult")
    protected String validateUserTokenNewResult;

    /**
     * Gets the value of the validateUserTokenNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateUserTokenNewResult() {
        return validateUserTokenNewResult;
    }

    /**
     * Sets the value of the validateUserTokenNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateUserTokenNewResult(String value) {
        this.validateUserTokenNewResult = value;
    }

}
