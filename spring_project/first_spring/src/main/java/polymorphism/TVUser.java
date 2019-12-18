package polymorphism;

public class TVUser {

	public static void main(String[] args) {
		
		//디자인 패턴
		// 싱글톤 패턴,
		BeanFactory factory = new BeanFactory();
		TV tv= (TV)factory.getBean(args[0]);
		
		/* TV tv = new DewooTV(); */
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
