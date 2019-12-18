package designP.StrategyPattern;

public class Soldier {

	void runContext(Strategy strategy) {
		
		System.out.println("김정은이 나타났다 ");
		strategy.runStrategy();
		
		System.out.println("취..익..취익... 전투 끝이라고 알림");
	}
}
