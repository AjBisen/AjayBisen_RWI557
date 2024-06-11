package Com.SpListSetMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	
    public static void main( String[] args )
    
    {
    	
           System.out.println( "Hello World!" );
        
        
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("hibernate.cfg.xml");
        
        Emp em=(Emp)context.getBean("emp1");
        
        System.out.println(em.getName());
        System.out.println(em.getAddess());
        System.out.println(em.getCourse());
        System.out.println(em.getPhone());
        
    }
}
