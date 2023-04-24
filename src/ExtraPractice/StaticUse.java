package ExtraPractice;

public class StaticUse {

	int id;
	String name;
	static String companyName="Walton";
	
	public StaticUse(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public void display() {
		System.out.println("Id : "+id +", Name : " +name+ ", companyName : " +companyName);
	}
	
	
	static void setCompanyname(String companyName ) {
	StaticUse.companyName=companyName;
	}
	
	
	
}
