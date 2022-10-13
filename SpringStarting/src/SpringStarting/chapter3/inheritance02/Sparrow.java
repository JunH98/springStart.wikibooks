package SpringStarting.chapter3.inheritance02;

public class Sparrow extends Animal implements CanFly {
	Sparrow(){
		myClass = "Sparrow";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + " is Flying");
	}

}
