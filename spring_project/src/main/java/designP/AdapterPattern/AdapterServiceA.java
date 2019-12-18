package designP.AdapterPattern;

public class AdapterServiceA {
	ServiceA sva = new ServiceA();
	
	
	void runService() {
		sva.runServiceA();
	}
}
