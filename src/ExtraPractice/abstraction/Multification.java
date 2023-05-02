package ExtraPractice.abstraction;

public class Multification extends MyCalculator{

	@Override
	void calculate(double a, double b) {
		// TODO Auto-generated method stub
		double result = a*b;
		System.out.println("Multification of Two Numbers : "+result);
	}

}
