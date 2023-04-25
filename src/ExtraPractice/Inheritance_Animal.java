package ExtraPractice;

public class Inheritance_Animal {
	int id=10;
	
	
	Inheritance_Animal(){
		System.out.println("parent Constructor");

	}
	
	static {
		System.out.println("parent Static block");
	}
	
	
	{
		System.out.println("parent instance block");

	}
	
	private void m1() {
		System.out.println("private parent method");

	}
	
	
	 void m2() {
		System.out.println("default parent method");

	}
	 
	 
	 protected void m3() {
			System.out.println("protected parent method");

		}
	 
	 
	 public void m4() {
			System.out.println("public parent method");

		}
	
	

}
