
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
 *         &lt;element name="Acct_fro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acct_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "acctFro",
    "acctTo",
    "amount",
    "type",
    "channel",
    "remarks",
    "docnum",
    "identifier",
    "bankcode",
    "days"
})
@XmlRootElement(name = "TransferCheques")
public class TransferCheques {

    @XmlElement(name = "Acct_fro")
    protected String acctFro;
    @XmlElement(name = "Acct_to")
    protected String acctTo;
    @XmlElement(name = "Amount")
    protected double amount;
    protected String type;
    protected String channel;
    @XmlElement(name = "Remarks")
    protected String remarks;
    protected String docnum;
    protected short identifier;
    protected short bankcode;
    protected short days;

    /**
     * Gets the value of the acctFro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctFro() {
        return acctFro;
    }

    /**
     * Sets the value of the acctFro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctFro(String value) {
        this.acctFro = value;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTo(String value) {
        this.acctTo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the docnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocnum() {
        return docnum;
    }

    /**
     * Sets the value of the docnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocnum(String value) {
        this.docnum = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     */
    public short getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     */
    public void setIdentifier(short value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     */
    public short getBankcode() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     */
    public void setBankcode(short value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the days property.
     * 
     */
    public short getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     */
    public void setDays(short value) {
        this.days = value;
    }

}
