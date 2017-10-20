
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="transfer_amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="anal_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "transferAmt",
    "analDate"
})
@XmlRootElement(name = "AnalyzeFx")
public class AnalyzeFx {

    protected String acctno;
    @XmlElement(name = "transfer_amt", required = true)
    protected BigDecimal transferAmt;
    @XmlElement(name = "anal_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar analDate;

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
     * Gets the value of the transferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmt() {
        return transferAmt;
    }

    /**
     * Sets the value of the transferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmt(BigDecimal value) {
        this.transferAmt = value;
    }

    /**
     * Gets the value of the analDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnalDate() {
        return analDate;
    }

    /**
     * Sets the value of the analDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnalDate(XMLGregorianCalendar value) {
        this.analDate = value;
    }

}
