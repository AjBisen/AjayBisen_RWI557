package Spring.StudentTable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        
      
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");

        Student stu=(Student)context.getBean("stut");
                
//        System.out.println(stu);
        
        stu.print();
        
        
    }
}
