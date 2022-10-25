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
 *         &lt;element name="hotel" type="{http://choice.cacho.mx/soap-ws/hotels}hotelInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pageInfo" type="{http://choice.cacho.mx/soap-ws/hotels}pageInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "hotel",
        "pageInfo"
})
@XmlRootElement(name = "getAllHotelsPaginatedResponse")
public class GetAllHotelsPaginatedResponse {

    @XmlElement(required = true)
    protected List<HotelInfo> hotel;
    protected PageInfo pageInfo;

    /**
     * Gets the value of the hotel property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hotel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelInfo }
     */
    public List<HotelInfo> getHotel() {
        if (hotel == null) {
            hotel = new ArrayList<HotelInfo>();
        }
        return this.hotel;
    }

    /**
     * Gets the value of the pageInfo property.
     *
     * @return possible object is
     * {@link PageInfo }
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     *
     * @param value allowed object is
     *              {@link PageInfo }
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

}
