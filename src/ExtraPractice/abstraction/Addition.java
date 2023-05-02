package ExtraPractice.abstraction;

public class Addition extends MyCalculator{

	@Override
	void calculate(double a, double b) {
		// TODO Auto-generated method stub
		double result = a+b;
		System.out.println("Addition of Two Numbers : "+result);
		
	}

}
