package FirstMavenProject.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
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
    public static void main( String[] args ) throws IOException{
    	
    
        System.out.println( "Hello World!" );
          
        Configuration cgf=	new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
        		
                  
         System.out.print(factory); 
//         System. out.print(factory.isClosed()); 
    
 		Student st = new Student();
 		  
 		st.setId(104);
 		st.setName("Rupesh");
 		st.setCity("jabalpurs");
 		System.out.println(st);
 		
 		
 		Address ad=new Address();
 		ad.setAddeddate(new Date());
 		ad.setCity("Balaghat");
 		ad.setStreet("Street");
 		ad.setX(123.34);
        ad.setIsopen(true); 		
        
        
        FileInputStream file=new FileInputStream("src/main/java/image.avif");
        
        byte[]data =new byte[file.available()];
        file.read(data);
        ad.setImage(data);
        
 		Session session = factory.openSession();

 		Transaction tx = session.beginTransaction();
 		session.save(st);
 		session.save(ad);
 		tx.commit();
 		session.close();

 		
 		System.out.println("Sucess");
 	     }
    }
    
        
        

