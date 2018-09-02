package SetDependentCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        StudentBean bean=(StudentBean)context.getBean("studsub");
        bean.show();
    }
}
