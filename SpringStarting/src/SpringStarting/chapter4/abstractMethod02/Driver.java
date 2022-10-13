package SpringStarting.chapter4.abstractMethod02;

public class Driver{

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Mouse();
		animals[1] = new Cat();
		animals[2] = new Puppy();
		animals[3] = new Calf();
		animals[4] = new chick();
		
		for (int i =0; i<animals.length; i++) {
			animals[i].Talk();
		}


	}

}
