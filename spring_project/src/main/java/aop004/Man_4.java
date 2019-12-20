package aop004;

public class Man_4 implements Person{
	
	public void runSomething() {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
		
		try {
			System.out.println("컴퓨터 게임을 한다");
		} catch (Exception exx) {
			if (exx.getMessage().equals("엄마가 방에들어온다.")) {
				System.out.println("자는척을 한다");
			}
		}finally {
			System.out.println("한판만 더하고 잔다.");
		}
		System.out.println("문을 잠그고 집을 나선다.");
	}
}
