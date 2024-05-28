package Mapping.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
                 
        
        Configuration cgf=	new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
       
         System.out.print(factory); 
         
         Employee emp=new Employee();
         Employee emp1=new Employee();
         
         emp.setId(12);
         emp.setName("Ajay");
         
         emp1.setId(13);
         emp1.setName("Rupesh ");
         
         Project p=new Project();
         Project p1=new Project();
         
         p.setPid(23);
         p.setPname("Office Management System");
 
         p1.setPid(24);
         p1.setPname("Holet managment System");
        
        List<Employee>list1=new ArrayList<Employee>();
        List<Project>list2=new ArrayList<Project>();
        
        list1.add(emp);
        list1.add(emp1);
        
        list2.add(p);
        list2.add(p1);
        
         emp.setProject(list2);
         p1.setEmp(list1);
        
        Session session = factory.openSession();
  		Transaction tx = session.beginTransaction();
  		                         
  		session.save(emp);
  		session.save(emp1);
  		session.save(p);
  		session.save(p1);
  		        
  		             
  		tx.commit();
  		session.close();
        
         factory.close();
    }
}
