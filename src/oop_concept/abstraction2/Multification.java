package oop_concept.abstraction2;

public class Multification extends Calculator{
	
	@Override
	void calculate(int a, int b) {
		int result = a*b;
		System.out.println("two number Multification is : " + result);
	}
}
