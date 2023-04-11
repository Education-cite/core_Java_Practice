package java_project.singleton;

public class Student {
	 String name ="enamul";
	 int age = 18;
	
	private static final Student stobj = new Student(); 
	
	private Student() {
		
	}
	
	
	public static Student getStudentInstance() {
		return stobj;
	}
	

}
