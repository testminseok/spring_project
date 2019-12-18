package designP.TemplateMethodPattern;

public abstract class Animal {
	/* 추상클래스와 인터페이스의 차이점은
	 * 인터페이스는 전부 추상메소드 뿐이고
	 * 추상클래스는 추상메소드와 일반메소드 둘다 활용할 수 있다. 
	 * */
	public void playWithOwner() {
		System.out.println("컴온 메리~~");
		play();
		runSomething();
		System.out.println("메리 굿 보이");
	}
	//추상 메소드
	abstract void play();
	
	// Hook Method
	void runSomething() {
		System.out.println("멍멍멍");
	}
}
