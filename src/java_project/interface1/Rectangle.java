package java_project.interface1;

public class Rectangle implements Calculator{

	@Override
	public double calculate(double a, double b) {
		double rectangle_area = a*b;
		return rectangle_area;
	}

}
