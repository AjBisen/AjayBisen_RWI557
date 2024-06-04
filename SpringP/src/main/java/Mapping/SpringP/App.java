package Mapping.SpringP;

import Mapping.SpringProject.ApplicationContext;
import Mapping.SpringProject.ClassPathXmlApplicationContext;
import Mapping.SpringProject.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Employee emp=(Employee)context.getBean("emp");
        System.out.println(emp);
        
        
    }
}
