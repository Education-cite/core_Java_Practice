package java_project.methodHiding;

public class MethodHidingTest {
public static void main(String[] args) {
	Parent p = new Child();
	p.classMethod();
	p.instanceMethod();
}
}
