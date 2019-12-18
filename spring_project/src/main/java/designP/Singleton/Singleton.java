package designP.Singleton;

public class Singleton {
	static Singleton singletonObject;
	private Singleton() {
		//private 생성자
	}
	//객체 반환 정적 메소드
	public static  Singleton getInstance() {
		if (singletonObject ==null) {
			singletonObject = new Singleton();
			//처음 에 호출했을땐 null이서 new 로 객체를 만들어주고 다음부터는 else로 그냥 return해준다
		}
		return singletonObject;
	}
}
