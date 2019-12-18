package polymorphism;

public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===>SonySepeaker 객체생성");
	}
	public void volumeUp() {
		System.out.println("===>SoneySpeaker ---소리를 올린다");
	}
	public void volumeDown() {
		System.out.println("===>SoneySpeaker ---소리를 내린다");
	}
}
