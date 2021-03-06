
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bracode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bracode",
    "cusnum"
})
@XmlRootElement(name = "GetCustomerName")
public class GetCustomerName {

    protected String bracode;
    protected String cusnum;

    /**
     * Gets the value of the bracode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBracode() {
        return bracode;
    }

    /**
     * Sets the value of the bracode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBracode(String value) {
        this.bracode = value;
    }

    /**
     * Gets the value of the cusnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusnum() {
        return cusnum;
    }

    /**
     * Sets the value of the cusnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusnum(String value) {
        this.cusnum = value;
    }

}
