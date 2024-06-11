package com.Sprefrence;

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
        Add add=(Add)context.getBean("add");
        
        System.out.println(add.getObj().getXy());
    }
}
