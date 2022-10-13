package SpringStarting.chapter6.proxyPattern;

public class ClientWithProxy {

	public static void main(String[] args) {
		// Call with proxy
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());

	}

}
