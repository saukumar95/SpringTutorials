package InjectionDiffMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

    public static void main(String args[])
    {
       // Resource res = new ClassPathResource("spconfig.xml");
      //  BeanFactory bean = new XmlBeanFactory(res);
        
        ApplicationContext bean = new ClassPathXmlApplicationContext("spconfig.xml");
        QuestionBean q = (QuestionBean)bean.getBean("qq");
        q.show();
    }
}
