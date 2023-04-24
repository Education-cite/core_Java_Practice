package ExtraPractice;

public class TestStatic {
public static void main(String[] args) {
	StaticUse s1 = new StaticUse(101,"Enamul");
	s1.display();
	StaticUse s2 = new StaticUse(102,"Tawhide");
	s2.display();
	StaticUse s3 = new StaticUse(103,"Taslima");
	s3.display();
	StaticUse.setCompanyname("walton Group");
	StaticUse s4 = new StaticUse(104,"nayem");

	s4.display();


}
}
