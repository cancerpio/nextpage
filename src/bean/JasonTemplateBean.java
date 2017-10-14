package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JasonTemplateBean {
    public int id;
    public String name;
    
    public JasonTemplateBean(){};
 
    public JasonTemplateBean(int id, String name) {
	this.id = id;
	this.name = name;
    }
    
}
