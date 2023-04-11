package java_project.methodHiding;

public class Parent {

	static void classMethod() {
		System.out.println("This is calling parentClass Static Method");
	}
	
	
	void instanceMethod() {
		System.out.println("This is calling parentClass  instanceMethod Method");
	}
	
	
	
}
