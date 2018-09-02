package SetDependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {
    
    public static void main(String [] args)
    {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spconfig.xml");
        StudentBean stud=(StudentBean)ap.getBean("studdetail");
        stud.show();
    }
}
