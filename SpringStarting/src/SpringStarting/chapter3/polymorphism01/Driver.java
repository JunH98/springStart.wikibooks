package SpringStarting.chapter3.polymorphism01;

public class Driver {

	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.name = "Pororo";
		pororo.habitat= "Antartica";
		pororo.showName();
		pororo.showName("Lambo");
		pororo.showHabitat();
		
		Animal pingu = new Penguin();
		
		pingu.name = "pingu";
		pingu.showName();

	}

}
