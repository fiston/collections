
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
 *         &lt;element name="GetBasisCustomerDetailsResult" type="{http://tempuri.org/}CustDetRetVal" minOccurs="0"/>
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
    "getBasisCustomerDetailsResult"
})
@XmlRootElement(name = "GetBasisCustomerDetailsResponse")
public class GetBasisCustomerDetailsResponse {

    @XmlElement(name = "GetBasisCustomerDetailsResult")
    protected CustDetRetVal getBasisCustomerDetailsResult;

    /**
     * Gets the value of the getBasisCustomerDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustDetRetVal }
     *     
     */
    public CustDetRetVal getGetBasisCustomerDetailsResult() {
        return getBasisCustomerDetailsResult;
    }

    /**
     * Sets the value of the getBasisCustomerDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDetRetVal }
     *     
     */
    public void setGetBasisCustomerDetailsResult(CustDetRetVal value) {
        this.getBasisCustomerDetailsResult = value;
    }

}
