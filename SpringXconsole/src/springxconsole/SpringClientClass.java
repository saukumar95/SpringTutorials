package springxconsole;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class SpringClientClass {

    public static void main(String [] args)
    {
        ClassPathResource resource = new ClassPathResource("newpackage/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        TopicService tos=(TopicService) factory.getBean("ts");
        System.out.println(tos.askForTopic());
    }
}
