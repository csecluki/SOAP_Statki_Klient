
package pl.lukasz.statki;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odbierzZgloszenie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odbierzZgloszenie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MMSI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="knots" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odbierzZgloszenie", propOrder = {
    "mmsi",
    "portName",
    "latitude",
    "longitude",
    "knots"
})
public class OdbierzZgloszenie {

    @XmlElement(name = "MMSI")
    protected int mmsi;
    protected String portName;
    protected float latitude;
    protected float longitude;
    protected float knots;

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
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the knots property.
     * 
     */
    public float getKnots() {
        return knots;
    }

    /**
     * Sets the value of the knots property.
     * 
     */
    public void setKnots(float value) {
        this.knots = value;
    }

}
