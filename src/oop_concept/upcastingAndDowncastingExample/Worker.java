package oop_concept.upcastingAndDowncastingExample;

public class Worker extends Employee{
	
	@Override
	void dosomething() {
		
		System.out.println("Worker DoSomething");
	}


	void working() {
		
		System.out.println("Worker working");
	}


}
