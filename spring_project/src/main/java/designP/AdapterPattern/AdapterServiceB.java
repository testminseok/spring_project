package designP.AdapterPattern;

public class AdapterServiceB {
	ServiceB svb = new ServiceB();
	
	void runService() {
		svb.runServiceB();
	}
}
