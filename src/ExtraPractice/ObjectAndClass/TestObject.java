package ExtraPractice.ObjectAndClass;

public class TestObject {

public static void main(String[] args) {
	Student s = new Student();
	s.id=1;
	s.name="Enamul";
	s.Gender="Male";
	s.dept="Php";
//	s.display();
			
//	s.studentInfo(11, "Tawhide", "Male", "Java");
//	s.display();
	
	s.studentInformation(s);
	s.display();
	
	Student s1 = new Student();
	s1.id=2;
	s1.name="Tarjina";
	s1.Gender="Female";
	s1.dept="Gave";
	
	s1.studentInformation(s1);
	s1.display();
	
}
}
