package SpringStarting.chapter3.abstrction01;

public class MouseDriver {

	public static void main(String[] args) {
		Mouse mickey = new Mouse();
		mickey.name = "mickey";
		mickey.age = 85;
		mickey.countOfTail = 1;
		
		mickey.sing();
		System.out.println(mickey.age);
		
		mickey = null;
		
		Mouse jerry = new Mouse();
		
		jerry.name = "jerry";
		jerry.age = 73;
		jerry.countOfTail = 1;
		
		jerry.sing();
		
		
	}
}
