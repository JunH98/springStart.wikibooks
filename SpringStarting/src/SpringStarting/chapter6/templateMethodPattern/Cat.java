package SpringStarting.chapter6.templateMethodPattern;

public class Cat extends Animal{
	@Override
	//추상 메소드 오버라이딩
	void play() {
		System.out.println("meow meow");
	}
	
	
	@Override
	//Hook (갈고리)메소드 오버라이딩
	void runSomething() {
		System.out.println("meow meow tail swing~");
	}

}
