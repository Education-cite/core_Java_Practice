package java_project;

public class StaticKeyword {
	
	static int x = m1();
	
	
	static {
		System.out.println("Static Block");
	}
	
	
	static int m1() {
		System.out.println("Static Method");
		return 10;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(x);
	}
	
	

}
