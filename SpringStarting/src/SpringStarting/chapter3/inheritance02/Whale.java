package SpringStarting.chapter3.inheritance02;

public class Whale extends Mammalia implements CanSwim {
	Whale(){
		myClass = "Whale";
	}
	@Override
	public void swim() {
		System.out.println(myClass+" is swimming");
	}
}
