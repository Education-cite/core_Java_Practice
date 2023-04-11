package oop_concept.upcasting;

public class Cat extends Animal{

	@Override
	void eat() {
		System.out.println("Cat is Eating");
	}
	
	void maw() {
		System.out.println("Cat is mawing");
	}
}
