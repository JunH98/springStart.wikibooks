package SpringStarting.chapter6.decoratorPattern;

public class Decorator implements IService {
	IService service;
	
	public String runSomething() {
		System.out.println("return decorated value to client ");

		service = new Service();

		return "really " + service.runSomething();
	}
	

}
