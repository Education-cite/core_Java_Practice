package java_project.interface1;

public class Circle implements Calculator{

	@Override
	public double calculate(double a, double b) {
		double area = pai*a*b;
		return area;
		
		
	}
	
	

}
