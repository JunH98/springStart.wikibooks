package SpringStarting.chapter3.inheritance02;

public class Bat extends Animal implements CanFly {
	Bat(){
		myClass = "Bat";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + " is Flying");
	}

}
