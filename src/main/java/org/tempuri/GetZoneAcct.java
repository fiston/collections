
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
 *         &lt;element name="branch_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "branchCode",
    "appid"
})
@XmlRootElement(name = "GetZoneAcct")
public class GetZoneAcct {

    @XmlElement(name = "branch_code")
    protected int branchCode;
    protected int appid;

    /**
     * Gets the value of the branchCode property.
     * 
     */
    public int getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     */
    public void setBranchCode(int value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the appid property.
     * 
     */
    public int getAppid() {
        return appid;
    }

    /**
     * Sets the value of the appid property.
     * 
     */
    public void setAppid(int value) {
        this.appid = value;
    }

}
