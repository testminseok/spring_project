package export004_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	Tire tire;
	//@Autowired 를 통해 car 의 property를 자동으로 엮어 줄 수 있으며로 (자동으로 의존성 주입) 생략이 가능하다.
	
	public String getTireBrand() {
		return "장착된 타이어 : "+tire.getBrand();
	}
	
	
}
