package designP.AdapterPattern;

public class ClientNoAdapter {
	public static void main(String[] args) {
		
		ServiceA sva = new ServiceA();
		ServiceB svb = new ServiceB();
		
		sva.runServiceA();
		svb.runServiceB();
		
		
		
		
	}
}
