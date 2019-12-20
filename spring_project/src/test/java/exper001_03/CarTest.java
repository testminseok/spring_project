package exper001_03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	@Test
	public void koreaTireTest() {
		Tire tire1 = new KoreaTire();
		Car car1 = new Car();
		car1.setTire(tire1);
		
		assertEquals("장착된 타이어 : KoreaTire",car1.getTireBrand());
		
	}
	@Test
	public void americaTireTest() {
		Tire tire1 = new AmericaTire();
		Car car1 = new Car();
		car1.setTire(tire1);
		
		assertEquals("장착된 타이어 : AmericaTire",car1.getTireBrand());
		
	}
}
