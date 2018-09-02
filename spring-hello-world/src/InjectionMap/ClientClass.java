package InjectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        QuestionBean q = (QuestionBean) context.getBean("q");
        q.show();
    }

}
