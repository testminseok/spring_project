package export005;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("tire11")
	 */
	@Resource(name = "tire11")
	Tire tire;
	/* @resource이름으로 찾는다 */
	
	public String getTireBrand() {
		return "장착된 타이어:"+tire.getBrand();
	}
}
