package oop_concept.abstraction2;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c;
		c = new Addition();
		c.calculate(12, 10);
		
		c = new Substraction();
		c.calculate(12, 10);
		
		c = new Multification();
		c.calculate(12, 10);
		
		c = new Division();
		c.calculate(12, 12);
		
	}
}
