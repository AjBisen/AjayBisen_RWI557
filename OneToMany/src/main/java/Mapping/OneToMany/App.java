package Mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Mapping.OneToMany.Question1;

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

        
        Question1 qu=new Question1();
        qu.setQueid(123);
        qu.setQue("What is Interface");
        
        
        
        //Answer for Store in database
        Answer1 an=new Answer1();
        an.setAnswerId(234);
        an.setAnswer("interface specifies the behavior of a class by providing an abstract type");
        an.setQue(qu);
        
        Answer1 an1=new Answer1();
        an1.setAnswerId(235);
        an1.setAnswer("interface is a not a create Object ");
        an1.setQue(qu);
        
        Answer1 an2=new Answer1();
        an2.setAnswerId(236);
        an2.setAnswer("interface is a Active Maltipale inheritance ");
        an2.setQue(qu);

        List<Answer1>list=new ArrayList<Answer1>();
        list.add(an);
        list.add(an1);
        list.add(an2);
               
          qu.setAns(list);
        
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        
        s.save(qu);
        
        s.save(an);
        s.save(an1);
        s.save(an2);
        
        tx.commit();
        
        factory.close();
    
    }
}
