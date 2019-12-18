package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		// 디자인 패턴 
		// 싱글톤 패턴,
//		BeanFactory factory = new BeanFactory();
//		TV tv= (TV)factory.getBean(args[0]);
//		 
//		/* TV tv = new DewooTV(); */
//		tv.powerOn();
//		tv.volumeUp(); 
//		tv.volumeDown();
//		tv.powerOff();

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeUp(); 
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.powerOff();
		
		factory.close(); // bean의 destory-method : 삭제되기 직전에 호출

//		TV tv1 = factory.getBean(SamsungTV.class);
//		TV tv2 = factory.getBean(SamsungTV.class);
//		TV tv3 = factory.getBean(SamsungTV.class);
//
//		System.out.println(tv1);
//		System.out.println(tv2);
//		System.out.println(tv3);
		// 주소가 같다. = 같은곳을 사용하고 있고 메모리를 하나만 생성한다. factory.close();

	}
}
