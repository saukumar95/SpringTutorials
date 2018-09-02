package SetIndepedentCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass 
{
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        QuestionClass question = (QuestionClass)context.getBean("question");
        question.show();
    }
    
}
