package ExtraPractice.abstraction;

public class TestCalculatorr {

	public static void main(String[] args) {
		MyCalculator c;
		c = new Addition();
		c.calculate(12, 12);
		
		c = new Subtraction();
		c.calculate(12, 12);
		
		c = new Multification();
		c.calculate(12, 12);
		
		c = new Divition();
		c.calculate(12, 12);
	}
}
