
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
 *         &lt;element name="bracode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cusnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ledcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subacctcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cusnum",
    "curcode",
    "ledcode",
    "subacctcode",
    "start",
    "stop",
    "amount"
})
@XmlRootElement(name = "StopCheque")
public class StopCheque {

    protected int bracode;
    protected int cusnum;
    protected int curcode;
    protected int ledcode;
    protected int subacctcode;
    protected int start;
    protected int stop;
    protected String amount;

    /**
     * Gets the value of the bracode property.
     * 
     */
    public int getBracode() {
        return bracode;
    }

    /**
     * Sets the value of the bracode property.
     * 
     */
    public void setBracode(int value) {
        this.bracode = value;
    }

    /**
     * Gets the value of the cusnum property.
     * 
     */
    public int getCusnum() {
        return cusnum;
    }

    /**
     * Sets the value of the cusnum property.
     * 
     */
    public void setCusnum(int value) {
        this.cusnum = value;
    }

    /**
     * Gets the value of the curcode property.
     * 
     */
    public int getCurcode() {
        return curcode;
    }

    /**
     * Sets the value of the curcode property.
     * 
     */
    public void setCurcode(int value) {
        this.curcode = value;
    }

    /**
     * Gets the value of the ledcode property.
     * 
     */
    public int getLedcode() {
        return ledcode;
    }

    /**
     * Sets the value of the ledcode property.
     * 
     */
    public void setLedcode(int value) {
        this.ledcode = value;
    }

    /**
     * Gets the value of the subacctcode property.
     * 
     */
    public int getSubacctcode() {
        return subacctcode;
    }

    /**
     * Sets the value of the subacctcode property.
     * 
     */
    public void setSubacctcode(int value) {
        this.subacctcode = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     */
    public int getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     */
    public void setStop(int value) {
        this.stop = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

}
