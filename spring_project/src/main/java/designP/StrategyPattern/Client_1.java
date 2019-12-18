package designP.StrategyPattern;

public class Client_1 {
	public static void main(String[] args) {
		
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		//총을 람보에게 전달하여 준투에 투입한다.
		strategy = new StrategyGun(); 
		rambo.runContext(strategy);
		
		System.out.println();
		
		//칼을 람보에게 전달한다. 
		strategy = new StrategySword();
		rambo.runContext(strategy);
		
		System.out.println();
		
		//활을 람보에게 전달
		strategy = new StrategyBow(); //Strategy인터페이스에 Strategybow를 넘겨준다
		rambo.runContext(strategy); //솔져 클래스의 메소드의 매개변수로 strategy로 넘겨준다.
		System.out.println();
		strategy = new StrategySpear();
		rambo.runContext(strategy);
	}
}
