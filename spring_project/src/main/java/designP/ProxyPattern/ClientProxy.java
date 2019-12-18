package designP.ProxyPattern;

public class ClientProxy {
	public static void main(String[] args) {
		
		//proxy를 이용한 호출
		//램속에 저장되어 있는걸 가지고온다.
		IService proxy = new Proxy_1();
		System.out.println(proxy.runSomething());
		
		/* 대리자는 실제 서비스와 같은 이름의 메소드를 구현한다. 이때 인터페이스를 사용한다
		 * 대리자는 실제 서비스에 대한 참조 변수를 갖는다(합성)
		 * 대리자는 실제 서비스와 같은 이름을 가진 메소드를 호출하고 그 값을 클라이언트에게 돌려준다
		 * 대리자는 실제 서비스의 메소드 호출 전후에 별도의 로직을 수행할 수 있다.
		 * 
		 * 프록시 패턴은 제어의 흐름을 조정하기 위한 목적으로 중간에 대리자를 두는 패턴이다.
		 */
	}
}
