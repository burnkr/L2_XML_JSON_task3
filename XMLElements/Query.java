package L2_XML_JSON.task3.XMLElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Query {
    @XmlAttribute(namespace = "yahoo", name = "count")
    public int count;
    @XmlElement
    Results results;
}
