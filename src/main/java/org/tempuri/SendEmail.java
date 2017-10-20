
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
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailfrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "subject",
    "mailmessage",
    "emailfrom",
    "emailto",
    "attachment"
})
@XmlRootElement(name = "SendEmail")
public class SendEmail {

    protected String subject;
    protected String mailmessage;
    protected String emailfrom;
    protected String emailto;
    protected String attachment;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the mailmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailmessage() {
        return mailmessage;
    }

    /**
     * Sets the value of the mailmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailmessage(String value) {
        this.mailmessage = value;
    }

    /**
     * Gets the value of the emailfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailfrom() {
        return emailfrom;
    }

    /**
     * Sets the value of the emailfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailfrom(String value) {
        this.emailfrom = value;
    }

    /**
     * Gets the value of the emailto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailto() {
        return emailto;
    }

    /**
     * Sets the value of the emailto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailto(String value) {
        this.emailto = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachment(String value) {
        this.attachment = value;
    }

}
