
package victor.training.ws.responsibility.v1.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import victor.training.ws.responsibility.domain.xmlbean.v1.Responsibility;


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
 *         &lt;element name="responsibility" type="{http://training.victor/ws/responsibility/domain/xmlbean/v1}Responsibility"/>
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
    "responsibility"
})
@XmlRootElement(name = "getUserResponsibilityResponse")
public class GetUserResponsibilityResponse {

    @XmlElement(required = true)
    protected Responsibility responsibility;

    /**
     * Gets the value of the responsibility property.
     * 
     * @return
     *     possible object is
     *     {@link Responsibility }
     *     
     */
    public Responsibility getResponsibility() {
        return responsibility;
    }

    /**
     * Sets the value of the responsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Responsibility }
     *     
     */
    public void setResponsibility(Responsibility value) {
        this.responsibility = value;
    }

}
