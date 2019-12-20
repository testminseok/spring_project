package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect_6 {
	
	@Pointcut("execution(* runSomething())")
	private void iampc() {
		//여기는 무엇을 작성해도 의미 없음
	}
	
	@Before("iampc()")
	public void before (JoinPoint joinPoint) {
		System.out.println("얼굴 인식 중 ..... 문이 열렸습니다.");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("문이 잠겼습니다. 안녕히 다녀오세요");
	}
}
