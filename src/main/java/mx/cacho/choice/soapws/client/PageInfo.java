package mx.cacho.choice.soapws.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="pageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalElements" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageInfo", propOrder = {
        "totalElements",
        "totalPages"
})
public class PageInfo {

    protected long totalElements;
    protected int totalPages;

    /**
     * Gets the value of the totalElements property.
     */
    public long getTotalElements() {
        return totalElements;
    }

    /**
     * Sets the value of the totalElements property.
     */
    public void setTotalElements(long value) {
        this.totalElements = value;
    }

    /**
     * Gets the value of the totalPages property.
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
