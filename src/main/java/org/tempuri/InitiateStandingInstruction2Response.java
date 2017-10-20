
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
 *         &lt;element name="InitiateStandingInstruction2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "initiateStandingInstruction2Result"
})
@XmlRootElement(name = "InitiateStandingInstruction2Response")
public class InitiateStandingInstruction2Response {

    @XmlElement(name = "InitiateStandingInstruction2Result")
    protected String initiateStandingInstruction2Result;

    /**
     * Gets the value of the initiateStandingInstruction2Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiateStandingInstruction2Result() {
        return initiateStandingInstruction2Result;
    }

    /**
     * Sets the value of the initiateStandingInstruction2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiateStandingInstruction2Result(String value) {
        this.initiateStandingInstruction2Result = value;
    }

}
