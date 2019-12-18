package polymorphism;

public class DewooTV implements TV {

	public void powerOn() {
		System.out.println("DewooTV --- 전원 켠다.");
	}

	public void powerOff() {
		System.out.println("DewooTV --- 전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("DewooTV --- 볼륨 업.");
	}

	public void volumeDown() {
		System.out.println("DewooTV --- 볼륨 다운.");

	}
	
}
