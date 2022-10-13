package SpringStarting.chapter3.reference;

public class CallByValue {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		b = 20;
		
		System.out.println(a);
		System.out.println(b);
	}

}
