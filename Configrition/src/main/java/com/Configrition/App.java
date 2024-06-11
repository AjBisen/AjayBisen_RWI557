package com.Configrition;

    import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
public class App 

    	{
    	    public static void main( String[] args )
    	    {
    	       
    	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);      
    	        Student student=context.getBean("temp", Student.class);
    	        System.out.println  (student);
                student.study();    	        
    	        
    	    }
    	}    	
    	
    	
 