package polymorphism;

public class SamsungTV implements TV {
	//생성자 인덱션 사용하기
	private Speaker speaker;
	private int price;
	
	public void setSepeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("setSpeaker Test~~~~~");
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice Test~~~~~");
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업 실행@@");
	}
	public void destoryMethod() {
		System.out.println("삭제되기 직전에나옴");
	}

	
	public SamsungTV() {
		System.out.println("===>Samsung(1) 객체생성");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===>Samsung(2) 객체 생성");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===>Samsung(3) 객체생성");
		this.speaker = speaker;
		this.price  = price;
	}
	public void powerOn() {
		System.out.println("SamsungTv --- 전원 켠다.(가격) : "+price);
	}

	public void powerOff() {
		System.out.println("SamsungTv --- 전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();

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
