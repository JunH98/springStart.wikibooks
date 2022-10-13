package SpringStarting.chapter6.templateCallbackPatternRefactoring;

public class Soldier {
	void runContext(String weaponSound) {
		System.out.println("start battle");
		excuteWeapon(weaponSound).runStrategy();
		System.out.println("end battle");
	}
	
	private Strategy excuteWeapon(final String weaponSound){
		return new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println(weaponSound);
			}
		};
	}

}
