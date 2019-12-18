package polymorphism;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv --- 전원 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv --- 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv --- 볼륨 업.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv --- 볼륨 다운.");

	}
	/*
	 * public void powerOn() { System.out.println("SamsungTv --- 전원 켠다."); }
	 * 
	 * public void powerOff() { System.out.println("SamsungTv --- 전원 끈다."); }
	 * 
	 * public void volumeUp() { System.out.println("SamsungTv --- 볼륨 업."); }
	 * 
	 * public void volumeDown() { System.out.println("SamsungTv --- 볼륨 다운."); }
	 * 
	 */
}
