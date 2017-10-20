
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
 *         &lt;element name="GetZoneAcctResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getZoneAcctResult"
})
@XmlRootElement(name = "GetZoneAcctResponse")
public class GetZoneAcctResponse {

    @XmlElement(name = "GetZoneAcctResult")
    protected String getZoneAcctResult;

    /**
     * Gets the value of the getZoneAcctResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetZoneAcctResult() {
        return getZoneAcctResult;
    }

    /**
     * Sets the value of the getZoneAcctResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetZoneAcctResult(String value) {
        this.getZoneAcctResult = value;
    }

}
