
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
 *         &lt;element name="IVRINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHANID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ivrinfo",
    "chanid"
})
@XmlRootElement(name = "TransferCTI")
public class TransferCTI {

    @XmlElement(name = "IVRINFO")
    protected String ivrinfo;
    @XmlElement(name = "CHANID")
    protected String chanid;

    /**
     * Gets the value of the ivrinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRINFO() {
        return ivrinfo;
    }

    /**
     * Sets the value of the ivrinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRINFO(String value) {
        this.ivrinfo = value;
    }

    /**
     * Gets the value of the chanid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHANID() {
        return chanid;
    }

    /**
     * Sets the value of the chanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHANID(String value) {
        this.chanid = value;
    }

}
