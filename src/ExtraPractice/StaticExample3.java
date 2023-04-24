package ExtraPractice;

public class StaticExample3 {
	static int a=m1();
	
	static {
		System.out.println("Call Static Block");
	}
	
	public static int m1() {
		System.out.println("Call Static M1 method");
		return 10;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Call Static Main method");
		System.out.println("value of a : "+a);

		
		StaticExample3 e = new StaticExample3();
		
		
	}
	

}
