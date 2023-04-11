package oop_concept.upcasting;

public class Dog extends Animal{
	
	@Override
	void eat() {
		System.out.println("Dog is Eating");
	}
	
	void barking() {
		System.out.println("Dog is barking");
	}

}
