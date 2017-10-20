
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
 *         &lt;element name="ConfirmChequeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "confirmChequeResult"
})
@XmlRootElement(name = "ConfirmChequeResponse")
public class ConfirmChequeResponse {

    @XmlElement(name = "ConfirmChequeResult")
    protected String confirmChequeResult;

    /**
     * Gets the value of the confirmChequeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmChequeResult() {
        return confirmChequeResult;
    }

    /**
     * Sets the value of the confirmChequeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmChequeResult(String value) {
        this.confirmChequeResult = value;
    }

}
