package oop_concept.upcastingAndDowncastingExample;

public class Admin extends Employee{
	
	
	@Override
	void dosomething() {
		
		System.out.println("Admin DoSomething");
	}
	
	
	
	void managing() {
		
		System.out.println("Admin manageing");
	}

}
