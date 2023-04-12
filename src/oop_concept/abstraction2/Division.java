package oop_concept.abstraction2;

public class Division extends Calculator{

	@Override
	void calculate(int a, int b) {
		int result = a/b;
		System.out.println("two number Division is : " + result);
	}
}
