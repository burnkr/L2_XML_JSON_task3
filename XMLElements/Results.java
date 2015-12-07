package L2_XML_JSON.task3.XMLElements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Results {
    @XmlElement
    Rate[] rate;
}
