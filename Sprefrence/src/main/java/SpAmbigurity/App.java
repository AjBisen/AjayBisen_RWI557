package SpAmbigurity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Sprefrence.Add;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext
				  ("src/main/java/SpAmbigurity/SpAmbigurityE/hibernate.cfg.xml");
		  
		  SpAmbiguityE abm=(SpAmbiguityE)context.getBean("am");
		 
              abm.Sun();
	}

}
