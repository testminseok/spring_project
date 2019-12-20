package aop005_annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop005_annotation.Person;

public class Start_5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop005_annotation/aop5.xml");
		
		Person king = context.getBean("man",Person.class); 
		Person queen = context.getBean("woman",Person.class);
		
		king.runSomething();
		System.out.println(); 
		queen.runSomething();
		System.out.println();
	}
}
