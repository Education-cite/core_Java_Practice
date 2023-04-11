package java_project.supperKeyword;

public class Employee extends Persion{

//	int id;
//	String name;
	double salary;
	int age = 80;
	
	public Employee() {
		System.out.println("Default constructor child class");

	}

	public Employee(int id, String name, double salary) {
		super( id, name);	
		this.salary = salary;
	}
	
	@Override
	void work() {
		super.work();
		System.out.println("child class method");
	}
	
	
	void display() {
		System.out.println(id + " " + name + " " + " " + salary + " " + age + " " + super.age);
	}
	
	
	
	
}
