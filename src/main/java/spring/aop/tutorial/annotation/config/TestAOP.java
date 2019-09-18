package spring.aop.tutorial.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestAOP
{
   
    public static void main(String[] args) {
 
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resource/applicationContext.xml");
        EmployeeManager manager = context.getBean(EmployeeManager.class);
 
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}
