package aop003;

import org.aspectj.lang.JoinPoint;

public class MyAspect_1 {
	
	
	public void before(JoinPoint joinPoint) { /* <== before 메소드가 Advice 인 셈이다.*/
		System.out.println("얼굴 인식중 .... : 문이 열렸습니다.");
	}
	
	/* Advice  : Advice는 pointcut을 적용할 로직, 즉 메소드를 의미하는데 여기에 언제라는 개념까지 포합하고있다.
	 * 			 결국 Advice는 pointcut에 언제 무엇을 적용할지 정의한 메소드이다.
	 * 
	 * Aspect  : AOP에서 Aspect는 여러개의 Advice 와 여러개의 pontcut의 결합체를 의미하는 용어이다
	 * 
	 * 			수식표현 => Aspect = Advice + pointcut
	 * 
	 * Advice는 언제(When), 무엇을(What) 을 의미하는 것이다.
	 * pointcut는 어디에(Where)를 의미하는것이다. 
	 * 결국 Acpect는 When + Where + What(언제,어디서,무엇을)이 된다.
	 * 
	 * */
}
