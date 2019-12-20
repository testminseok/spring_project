package export004_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_5 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("export004_anotaion/export4.xml");
		
		Car car = context.getBean("car",Car.class);
		
		System.out.println(car.getTireBrand());
		
	}
}
