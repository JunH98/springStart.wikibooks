package SpringStarting.chapter3.inheritance02;

public class Penguin extends Mammalia implements CanSwim {
	Penguin(){
		myClass = "Penguin";
	}
	@Override
	public void swim() {
		System.out.println(myClass+" is swimming");
	}
}
