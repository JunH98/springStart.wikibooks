package SpringStarting.chapter6.proxyPattern;

public class Proxy implements IService {
	IService service1;
	
	public String runSomething() {
		System.out.println("호출에 대한 흐름제어가 주목적, 반환결과를 그대로 전달\n");
		
		service1 = new Service();
		return service1.runSomething(); 
	}

}
