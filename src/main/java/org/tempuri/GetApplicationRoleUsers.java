
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
 *         &lt;element name="roleid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "roleid",
    "appid"
})
@XmlRootElement(name = "GetApplicationRoleUsers")
public class GetApplicationRoleUsers {

    protected int roleid;
    protected int appid;

    /**
     * Gets the value of the roleid property.
     * 
     */
    public int getRoleid() {
        return roleid;
    }

    /**
     * Sets the value of the roleid property.
     * 
     */
    public void setRoleid(int value) {
        this.roleid = value;
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
