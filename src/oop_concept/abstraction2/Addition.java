package oop_concept.abstraction2;

public class Addition extends Calculator{

	@Override
	void calculate(int a, int b) {
		int result = a+b;
		System.out.println("two number sum is : " + result);
	}

}
