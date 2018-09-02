package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {
    
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
//        EmployeeBean bean = (EmployeeBean)context.getBean("ebean");
//        EmployeeBean bean2 = (EmployeeBean)context.getBean("ebean2");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("edao");
//        dao.saveEmployee(bean);
//        dao.saveEmployee(bean2);
//  
//        EmployeeBean ubean = (EmployeeBean)context.getBean("ubean");
//       dao.updateEmployee(ubean);
        
//        EmployeeBean dbean = (EmployeeBean)context.getBean("dbean");
//        dao.deleteEmployee(dbean);
        
        
          EmployeeBean sbean = (EmployeeBean)context.getBean("sbean");
        dao.selectEmp(sbean);
        System.out.print("Successful!! Delete");
    }
}
