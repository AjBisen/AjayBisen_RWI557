package Mapping.OneToOne;

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
        
//       System.out.println("hello");

        
        Question qu=new Question();
        qu.setQueid(123);
        qu.setQue("What is Interface");
        
        
        
        //Answer for Store in database
        Answer an=new Answer();
        an.setAnswerId(234);
        an.setAnswer("interface specifies the behavior of a class by providing an abstract type");
        an.setQue(qu);
        
        qu.setAns(an);
        
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        
        s.save(qu);
        s.save(an);
        
        tx.commit();
        
        factory.close();
    }
}
