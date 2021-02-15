
package pl.lukasz.statki;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossTonnage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="MMSI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statek", propOrder = {
    "flag",
    "grossTonnage",
    "img",
    "mmsi",
    "name",
    "vtype"
})
public class Statek {

    protected String flag;
    protected int grossTonnage;
    protected byte[] img;
    @XmlElement(name = "MMSI")
    protected int mmsi;
    protected String name;
    protected String vtype;

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the grossTonnage property.
     * 
     */
    public int getGrossTonnage() {
        return grossTonnage;
    }

    /**
     * Sets the value of the grossTonnage property.
     * 
     */
    public void setGrossTonnage(int value) {
        this.grossTonnage = value;
    }

    /**
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImg(byte[] value) {
        this.img = value;
    }

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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtype() {
        return vtype;
    }

    /**
     * Sets the value of the vtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtype(String value) {
        this.vtype = value;
    }

}
