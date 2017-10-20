
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
 *         &lt;element name="BASISID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branch_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="roleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "basisid",
    "username",
    "password",
    "branchCode",
    "roleid",
    "updateFlag"
})
@XmlRootElement(name = "AddNewTeller")
public class AddNewTeller {

    @XmlElement(name = "BASISID")
    protected int basisid;
    @XmlElement(name = "Username")
    protected String username;
    protected String password;
    @XmlElement(name = "branch_code")
    protected int branchCode;
    protected String roleid;
    @XmlElement(name = "UpdateFlag")
    protected String updateFlag;

    /**
     * Gets the value of the basisid property.
     * 
     */
    public int getBASISID() {
        return basisid;
    }

    /**
     * Sets the value of the basisid property.
     * 
     */
    public void setBASISID(int value) {
        this.basisid = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

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
     * Gets the value of the roleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * Sets the value of the roleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleid(String value) {
        this.roleid = value;
    }

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFlag(String value) {
        this.updateFlag = value;
    }

}
