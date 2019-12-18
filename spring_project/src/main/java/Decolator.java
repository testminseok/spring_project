

public class Decolator  implements IService{
	IService service;
	public String runSomething() {
		System.out.println("호출에 대한 장식이 주목적, 클리아언트에 반환결과에 장식을 더하여 전달");
		
		service = new Service();
		
		return "푸른하늘 은하수  : "+service.runSomething();
	}
}
