package SpringStarting.chapter6.strategyPattern;

public class StrategyBow implements Strategy {
	@Override
	public void runStrategy() {
		System.out.println("whing~ arrow");
	}

}
