package aop005_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect_5 {

	
	@Pointcut("execution(* runSomething())")
	private void iampc() {
		//여긴 무엇을 만들어도 의미없음
	}
	
	@Before("iampc()")
	public void before(JoinPoint jointPoint) {
		System.out.println("얼굴 인식중 :  .. 문이열렸습니다.!");
	}
	
	@After("iampc()")
	public void lookDoor(JoinPoint jointPoint) {
		System.out.println("문이 잠겼습니다... 안녕히 다녀오십시요");
		
	}
}
