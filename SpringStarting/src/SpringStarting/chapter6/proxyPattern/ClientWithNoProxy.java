package SpringStarting.chapter6.proxyPattern;

public class ClientWithNoProxy {

	public static void main(String[] args) {
		//call with out proxy
		Service service = new Service();
		System.out.println(service.runSomething());

	}

}
