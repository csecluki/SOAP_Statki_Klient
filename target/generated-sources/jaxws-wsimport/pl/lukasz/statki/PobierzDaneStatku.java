
package pl.lukasz.statki;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pobierzDaneStatku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pobierzDaneStatku">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MMSI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pobierzDaneStatku", propOrder = {
    "mmsi"
})
public class PobierzDaneStatku {

    @XmlElement(name = "MMSI")
    protected int mmsi;

    /**
     * Gets the value of the mmsi property.
     * 
     */
    public int getMMSI() {
        return mmsi;
    }

    /**
     * Sets the value of the mmsi property.
     * 
     */
    public void setMMSI(int value) {
        this.mmsi = value;
    }

}
