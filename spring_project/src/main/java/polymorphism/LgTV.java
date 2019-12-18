package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("sony")
	 */
	/* @Resource(name = "sony") */
	/*
	 * @Inject
	 * 
	 * @Qualifier("apple")
	 */
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		// TODO Auto-generated constructor stub
		System.out.println("엘찌");
	}

	public void powerOn() {
	System.out.println("LgTV --- 전원 켠다.");
}
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}

}
