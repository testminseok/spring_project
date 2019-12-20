package aop004;

import org.aspectj.lang.JoinPoint;

public class MyAspect_4 {

	public void before(JoinPoint joinpoint) {
		System.out.println("얼굴 인식 중 : .... 문이열렸습니다");
	}
	public void lookDoor(JoinPoint joinpoint) {
		System.out.println("문이 잠겼습니다. 안녕히 다녀오십시오"); 
	}
}
