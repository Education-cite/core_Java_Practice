package oop_concept.inheritance;

public class Animal {
	
	String name="tuni";
	int age;
	
	public Animal() {
		System.out.println("constructor called from parent");
	}
	
	static {
		System.out.println("staticblock called from parent");

	}
	
	{
		System.out.println("instanceblock called from parent");

	}
	
	

}
