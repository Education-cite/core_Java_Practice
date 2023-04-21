package ExtraPractice.ObjectAndClass;

public class Student {

	int id;
	String name,Gender,dept;
	
	
	public void studentInfo(int id,String name,String Gender,String department) {

		this.id=id;
		this.name=name;
		this.Gender=Gender;
		dept=department;
		
	}
	
	
	
	public void studentInformation(Student st) {

		id=st.id;
		name=st.name;
		Gender=st.Gender;
		dept=st.dept;
		
	}
	
	
	public void display() {
		System.out.println(id+ " " + name + " " +Gender+ " " + dept);
		
	}
	
}
