package java_project.singleton;

public class SingletonTest {
public static void main(String[] args) {
	Student s = Student.getStudentInstance();
	System.out.println(s.name);
	SingletonLazyPattern sn = SingletonLazyPattern.getLazyInstance();
	System.out.println(sn.address);

}
}
