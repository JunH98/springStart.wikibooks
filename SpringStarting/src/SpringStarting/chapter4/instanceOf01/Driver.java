package SpringStarting.chapter4.instanceOf01;

class Animal{

}

class Birds extends Animal{

}

class Penguin extends Birds{

}

public class Driver{
	public static void main(String[] args) {
		Animal animalInstance = new Animal();
		Animal birdsInstance = new Birds();
		Animal penguinInstance = new Penguin();
		
		System.out.println(animalInstance instanceof Animal);

		System.out.println(birdsInstance instanceof Animal);
		System.out.println(birdsInstance instanceof Birds);

		System.out.println(penguinInstance instanceof Animal);
		System.out.println(penguinInstance instanceof Birds);
		System.out.println(penguinInstance instanceof Penguin);
		
		System.out.println(penguinInstance instanceof Object);
		
	}
	
}