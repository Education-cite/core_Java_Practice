package java_project.supperKeyword;

public class Persion {

	int id;
	String name;
	int age = 50;
	
	public Persion() {
		System.out.println("Default constructor Parent class");
	}
	
	
	public Persion(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	
	void work() {
		
		System.out.println("parent class method");
	}
	
	
}
