package spring.hello.world;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringHelloWorld {

    public static void main(String[] args) {
        Resource res = new ClassPathResource("spconfig.xml");
        BeanFactory bean = new XmlBeanFactory(res);
        WelcomeBean wb = (WelcomeBean) bean.getBean("obj");
        wb.show();

    }

}
