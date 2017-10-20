
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
 *         &lt;element name="GetBasisTellerTillAcctResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getBasisTellerTillAcctResult"
})
@XmlRootElement(name = "GetBasisTellerTillAcctResponse")
public class GetBasisTellerTillAcctResponse {

    @XmlElement(name = "GetBasisTellerTillAcctResult")
    protected String getBasisTellerTillAcctResult;

    /**
     * Gets the value of the getBasisTellerTillAcctResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetBasisTellerTillAcctResult() {
        return getBasisTellerTillAcctResult;
    }

    /**
     * Sets the value of the getBasisTellerTillAcctResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetBasisTellerTillAcctResult(String value) {
        this.getBasisTellerTillAcctResult = value;
    }

}
