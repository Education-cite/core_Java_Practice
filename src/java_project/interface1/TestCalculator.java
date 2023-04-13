package java_project.interface1;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c;
		c = new Circle();
		System.out.println("Area of Circle :  "+c.calculate(10, 10));
		
		c = new Rectangle();
		
		System.out.println("Area of Rectangle :  "+c.calculate(10, 10));
		


	}
}
