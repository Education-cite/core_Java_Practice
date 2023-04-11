package java_project;

public class ThisKeyword {

	String name;
	int age;
	String address;
	double fee;
	
	

	public ThisKeyword(String name, int age, String address) {
		
		this.name = name;       //this keyword use to current class object reffer
		this.age = age;
		this.address = address;
		
	}
	
	
	
	public ThisKeyword(String name, int age, String address, double fee) {
		this(name,age,address);      //this keyword use to current class Constructor invoke
		this.fee = fee;
	}
	
	void display() {
		System.out.println("Name : "+ name +" Age :" +age + " address :" +address + " Fee : " +fee);
	}
	
	
	void display1() {
		this.display();    //this keyword use to current class method invoke
	}
	
	
	
	void m1(ThisKeyword thisKeyword) {
		System.out.println("m1 method call-----");
	}
	
	
	void m2() {
		m1(this); 		//this keyword use to current class method argument pass
	}
	
	
	
	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword("Enamul", 33, "Dhaka");
		t.display1();
		ThisKeyword t1 = new ThisKeyword("Enamul", 33, "Dhaka",1000);
		t1.display1();
		t1.m2();

	}
	
	
	
	
	
}
