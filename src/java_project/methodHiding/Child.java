package java_project.methodHiding;

public class Child extends Parent{
	static void classMethod() {
		System.out.println("This is calling childClass Static overrideMethod");
	}
	
	
	void instanceMethod() {
		System.out.println("This is calling childClass  instanceMethod overrideMethod");
	}
}
