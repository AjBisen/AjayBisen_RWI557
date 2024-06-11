package com.StandaloneType;

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
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("stand.xml");
    	Student stn=context.getBean("obj" ,Student.class);
    	System.out.println(stn);
    	
    	
    }
}
