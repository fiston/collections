
package org.tempuri;

import java.math.BigDecimal;
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
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pFreq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1stPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pLastPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pAcctToCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "acctno",
    "pFreq",
    "p1StPayDate",
    "amount",
    "pLastPayDate",
    "pAcctToCredit",
    "pRemarks"
})
@XmlRootElement(name = "InitiateStandingInstruction2")
public class InitiateStandingInstruction2 {

    protected String acctno;
    protected int pFreq;
    @XmlElement(name = "p1stPayDate")
    protected String p1StPayDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    protected String pLastPayDate;
    protected String pAcctToCredit;
    protected String pRemarks;

    /**
     * Gets the value of the acctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctno() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctno(String value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the pFreq property.
     * 
     */
    public int getPFreq() {
        return pFreq;
    }

    /**
     * Sets the value of the pFreq property.
     * 
     */
    public void setPFreq(int value) {
        this.pFreq = value;
    }

    /**
     * Gets the value of the p1StPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP1StPayDate() {
        return p1StPayDate;
    }

    /**
     * Sets the value of the p1StPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP1StPayDate(String value) {
        this.p1StPayDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the pLastPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLastPayDate() {
        return pLastPayDate;
    }

    /**
     * Sets the value of the pLastPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLastPayDate(String value) {
        this.pLastPayDate = value;
    }

    /**
     * Gets the value of the pAcctToCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAcctToCredit() {
        return pAcctToCredit;
    }

    /**
     * Sets the value of the pAcctToCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAcctToCredit(String value) {
        this.pAcctToCredit = value;
    }

    /**
     * Gets the value of the pRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRemarks() {
        return pRemarks;
    }

    /**
     * Sets the value of the pRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRemarks(String value) {
        this.pRemarks = value;
    }

}
