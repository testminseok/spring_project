package designP.DecorationPattern;

public class ClientNoDecolator {
	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.runSomething());
	}
}
