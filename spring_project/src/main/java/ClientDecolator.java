

public class ClientDecolator {
	
	public static void main(String[] args) {
		IService decolator = new Decolator();
		System.out.println(decolator.runSomething());
	
		/* 장식자 실제 서비스와 같은 이름의 메소드를 구현한다. 이때 인터페이스를 이용한다
		 * 장식자는 실제 서비스에 대한 참조 변수를 갖는다(합성)
		 * 장식자는 실제 서비스의 같은 이름의 메소드를 호출하고 그 반환값에 장식을 더해 클라이언트에게 돌려준다
		 * 장식자는 식제 서비스의 메소드 호출 전후에 별도의 로직을 수행할 수 있다. 
		 * */
	}

}
