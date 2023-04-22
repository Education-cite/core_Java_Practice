package ExtraPractice;

public class OverLoading_Calsulator {
	
	int doAddition(int a, int b) {
		int result=a+b;
		return	result; 
	}
	
	int doAddition(int a, int b,int c) {
		int result=a+b+c;
		return	result; 
	}
	
	void doAddition( int b,double a) {
		System.out.println("addition is Two number is : "+(a+b)); 

	}
	
	void doAddition(double a, int b) {
		System.out.println("addition is Two number is : "+(a+b)); 
	}
	
	void doAddition(float a, int b,int c,float d) {
		System.out.println("addition is Two int number is : "+(b+c)); 
		System.out.println("addition is Two float number is : "+(a+d)); 

	}

}
