package com.Spring;

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
      
      Employee emp1= (Employee) context.getBean("emp",Employee.class);
      
      Address add= (Address) context.getBean("add",Address.class);

      
      
      System.out.println(emp1);
      System.out.println(add);

        
    }
}
