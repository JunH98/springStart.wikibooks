package SpringStarting.chapter6.templateCallbackPatternRefactoring;

public class Client {
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("gun gun gun");
		System.out.println();

		rambo.runContext("kal kal kal");
		System.out.println();

		rambo.runContext("axe axe axe");
		System.out.println();
	}
}
