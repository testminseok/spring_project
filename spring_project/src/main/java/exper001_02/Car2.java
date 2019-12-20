package exper001_02;

 
public class Car2 {
Tire tire;
	
	public Car2() {
		tire = new AmericaTire();
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : "+tire.getBrand();
	}
}
