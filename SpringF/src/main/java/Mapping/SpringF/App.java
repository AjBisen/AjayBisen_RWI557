package Mapping.SpringF;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("hibernate.cfg.xml");
        Employee Emp=(Employee)context.getBean("emp");
        
        System.out.println(Emp);

      
    }
}
