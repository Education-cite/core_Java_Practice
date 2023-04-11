package java_project;

public class StaticKeywordExample {
	
	// int x = 0;

	static int x = 0;
	
	
	
	  StaticKeywordExample() {
		x++;
	}
	
	
	void getcount() {
		System.out.println("the value of count : " +x);
	}
	
	
	public static void main(String[] args) {
		StaticKeywordExample c1= new StaticKeywordExample();
		c1.getcount();
		
		StaticKeywordExample c2= new StaticKeywordExample();
		c2.getcount();
		
		StaticKeywordExample c3= new StaticKeywordExample();
		c3.getcount();
	}

}
