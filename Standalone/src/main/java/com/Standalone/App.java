package com.Standalone;

import org.springframework.context.ApplicationContext;
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
        
        ApplicationContext context= new ClassPathXmlApplicationContext("hibernate.cfg.xml");
        
        Person p=(Person)context.getBean("per",Person.class);
        
        System.out.println(p);
        
                                                                            
    }
}
