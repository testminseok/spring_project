package aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop002/aop2.xml");
		
		Person king1 = context.getBean("man",Person.class);
		Person queen1 = context.getBean("woman",Person.class); 
		
		king1.runSomething();
		queen1.runSomething();
		
	}
}
