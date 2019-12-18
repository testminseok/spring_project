package designP.ProxyPattern;

public class ClientNoProxy {
	public static void main(String[] args) {
		
		//Proxy를 이용하지 않는 호출
		
		Service service = new Service();
		
		System.out.println(service.runSomething());
		
	}
}
