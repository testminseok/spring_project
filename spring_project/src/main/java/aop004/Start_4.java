package aop004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_4 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop004/aop4.xml");
		
		Person king = context.getBean("man",Person.class);
		Person queen = context.getBean("woman",Person.class);
		
		king.runSomething();
		System.out.println();
		queen.runSomething();
		
	}
}
