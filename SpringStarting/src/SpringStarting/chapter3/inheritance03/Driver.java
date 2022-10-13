package SpringStarting.chapter3.inheritance03;

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.name = "Pororo";
		pororo.habitat= "Antartica";
		
		pororo.showName();
		pororo.showHabitat();
		
		Animal pingu = new Penguin();
		
		pingu.name = "Pingu";
//		pingu.habitat = "EBS";
		
		pingu.showName();
//		pingu.showHabitat();
		
//		Penguin Happyfeet = new Animal();
	}

}
