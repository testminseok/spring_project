package export003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_4 {
	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("export003/export3.xml");
	
	Car car = (Car) context.getBean("car");
	
	System.out.println(car.getTireBrand());
	
	}
	
}
