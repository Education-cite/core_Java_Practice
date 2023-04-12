package oop_concept.abstraction_Constructor;

public abstract class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void display() {
		System.out.println("Emaployee ID : " + id + ",  Emaployee name : " + name);
	}

}
