package designP.ProxyPattern;

public class Proxy_1 implements IService{
	IService service1;
	
	@Override
	public String runSomething() {
		// TODO Auto-generated method stub
		System.out.println("호출에 대한 흐름제어가 주 목적 , 반환 결과를 그대로 전달");
		
		service1 = new Service();
		
		return service1.runSomething();
	}
}
