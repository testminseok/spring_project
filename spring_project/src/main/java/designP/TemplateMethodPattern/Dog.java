package designP.TemplateMethodPattern;

public class Dog extends Animal{
	@Override
	void play() {
		System.out.println("메리가 짖는다");
	}
	void runSomething() {
		System.out.println("멍멍ㅁ엄엄어");
	}
	
}
