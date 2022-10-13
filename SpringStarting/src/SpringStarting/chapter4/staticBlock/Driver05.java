package SpringStarting.chapter4.staticBlock;

public class Driver05 {

	public static void main(String[] args) {

		System.out.println("main method start");
		System.out.println(Animal02.age);
		
	}

}

class Animal02{
	static int age = 0;
	
	static {
		System.out.println("Animal class ready on");
	}
}