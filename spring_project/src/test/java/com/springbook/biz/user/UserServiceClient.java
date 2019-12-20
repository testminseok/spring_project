package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.user.impl.UserServiceImpl;

public class UserServiceClient {

	public static void main(String[] args) {
		
		//1. Spring 컨테이너를 구동한다
		AbstractApplicationContext container = new GenericXmlApplicationContext("BoardService.xml");
		
		//2. Spering 컨테이너로부터 UserServiceImpl 객체를 Lookup한다
		UserService userService = (UserService) container.getBean("userService");
		
		
		UserServiceImpl usertest = (UserServiceImpl) container.getBean("userService");
		
		usertest.gettest();
		
		//3.로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test1234");
		
	
		UserVO user = userService.getUser(vo);
		
		if (user != null) {
			System.out.println(user.getName()+"님 환영합니다");
		}
		else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요.");
		}
		
		//4. Spring 컨테이너를 종료한다
		container.close();
		
		
		
		
	}
}
