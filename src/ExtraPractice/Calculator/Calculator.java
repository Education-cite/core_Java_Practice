package ExtraPractice.Calculator;

public class Calculator {

	int result;
	
	public int addition(int a,int b) {
		int result = a+b;
		return result;
		
	}
	
	public int squre(int a) {
		int result = a*a;
		return result;
		
	}
	
	
	public int minimum(int a,int b) {
		if(a<b) {
			return a;

		}else {
			return b;

		}
		
	}
	
}
