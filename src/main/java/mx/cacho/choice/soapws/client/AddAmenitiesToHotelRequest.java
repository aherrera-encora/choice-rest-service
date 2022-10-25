package mx.cacho.choice.soapws.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="amenityIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "hotelId",
        "amenityIds"
})
@XmlRootElement(name = "addAmenitiesToHotelRequest")
public class AddAmenitiesToHotelRequest {

    protected long hotelId;
    @XmlElement(type = Long.class)
    protected List<Long> amenityIds;

    /**
     * Gets the value of the hotelId property.
     */
    public long getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     */
    public void setHotelId(long value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the amenityIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amenityIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenityIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     */
    public List<Long> getAmenityIds() {
        if (amenityIds == null) {
            amenityIds = new ArrayList<Long>();
        }
        return this.amenityIds;
    }

}
