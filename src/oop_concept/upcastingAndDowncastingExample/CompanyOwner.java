package oop_concept.upcastingAndDowncastingExample;

public class CompanyOwner {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		Admin a = new Admin();
		Enginear en = new Enginear();
		Worker w = new Worker();
		Executive ex = new Executive();
		
		EmployeeCall call = new EmployeeCall();
		
		call.allEmployeeCall(em);
		call.allEmployeeCall(a);
		call.allEmployeeCall(en);
		call.allEmployeeCall(w);
		call.allEmployeeCall(ex);
		
		
		
		
	}

}
