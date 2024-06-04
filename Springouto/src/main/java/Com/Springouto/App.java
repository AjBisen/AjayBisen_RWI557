package Com.Springouto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate.cfg.xml");

		Employee emp1 = (Employee) context.getBean("em");

		System.out.print(emp1);

		
		
	}
}
