package aop003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop003/aop3.xml");
		
		Person king = context.getBean("man",Person.class);
		Person queen = context.getBean("woman",Person.class);
		Person baby = context.getBean("baby",Person.class);
		
		System.out.println();
		king.runSomething();
		System.out.println();
		queen.runSomething();
		System.out.println();
		baby.runSomething();
		
		
		
		
	}
}
