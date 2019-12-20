package exper001_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exper001_02.Car2;

public class CarTest {
	
	@Test
	public void  자동차_코리아타이어장착_타이어브랜드_테스트() {
		Car car = new Car();
		
		assertEquals("장착된 타이어 : KoreaTire", car.getTireBrand());
	}
	@Test
	public void  자동차_장착_미국타이어타이어브랜드_테스트() {
		Car2 car = new Car2();
		
		assertEquals("장착된 타이어 : AmericaTire", car.getTireBrand());
	}
}
