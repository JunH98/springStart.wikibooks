package SpringStarting.chapter6.templateMethodPattern;

public abstract class Animal {
	// template method
	public void playWithOwner() {
		System.out.println("come on");
		play();
		runSomething();
		System.out.println("good boy");
	}
	
	abstract void play();
	void runSomething() {
		System.out.println("tail swing~");
	}

}
