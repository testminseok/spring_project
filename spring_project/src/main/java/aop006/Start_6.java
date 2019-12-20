package aop006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Start_6 {

	public static void main(String[] args) { 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop6.xml",Start_6.class);
		
		Person king = context.getBean("man",Person.class);
		System.out.println("\n\n");
		Person queen = context.getBean("woman",Person.class);
		
		System.out.println();
		king.runSomething();
		System.out.println();
		queen.runSomething();
		
	}
}
