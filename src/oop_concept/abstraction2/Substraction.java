package oop_concept.abstraction2;

public class Substraction extends Calculator{
	
	@Override
	void calculate(int a, int b) {
		int result = a-b;
		System.out.println("two number substraction is : " + result);
	}

}
