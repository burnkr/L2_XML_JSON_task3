package L2_XML_JSON.task3.XMLElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rate {
    @XmlAttribute(name = "id") public String id;
    @XmlElement(name = "Name") public String name;
    @XmlElement(name = "Rate") public String rate;
    @XmlElement(name = "Date") public String date;
    @XmlElement(name = "Time") public String time;
    @XmlElement(name = "Ask") public String ask;
    @XmlElement(name = "Bid") public String bid;
}

