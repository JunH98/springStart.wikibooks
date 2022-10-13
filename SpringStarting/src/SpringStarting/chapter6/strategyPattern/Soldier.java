package SpringStarting.chapter6.strategyPattern;

public class Soldier {
	void runContext(Strategy strategy) {
		System.out.println("Start Battle");
		strategy.runStrategy();
		System.out.println("End Battle");
	}

}
