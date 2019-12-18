package designP.Singleton;

public class TestSingleton {
	public static void main(String[] args) {
		
		Singleton ss1 = Singleton.getInstance();
		Singleton ss2 = Singleton.getInstance();
		Singleton ss3 = Singleton.getInstance();
		//네트워크 연결한테 getInstance를 하나만 이용하는 방법
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		
		ss1 = null;
		ss2 = null;
		ss3 = null;
		
		
		
		
	}
}
