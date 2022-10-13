package SpringStarting.chapter6.strategyPattern;

public class StrategyGun implements Strategy {
	@Override
	public void runStrategy() {
		System.out.println("bang bang bang");
	}

}
