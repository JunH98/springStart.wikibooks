package SpringStarting.chapter3.polymorphism01;

public class Penguin extends Animal {

	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s is livin %s.\n",name, habitat);
	}
	
	// overriding - 재정의 : 상위클래스와 같은 이름, 같은 인자 
	public void showName() {
		System.out.println("Ignored");
	}
	
	// overloading - 중복정의 : 같은메소드 이름, 다른인자
	public void showName(String yourName) {
		System.out.printf("Hi %s, i`m %s.\n", yourName, name);
	}
}
