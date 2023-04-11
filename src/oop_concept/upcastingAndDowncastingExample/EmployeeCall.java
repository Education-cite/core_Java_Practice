package oop_concept.upcastingAndDowncastingExample;

public class EmployeeCall {
	
	
	void allEmployeeCall(Employee e) {
		System.out.println("\n");
		e.dosomething();
		e.setName();
		
		System.out.println("\n\n");

		
		if(e instanceof Admin) {
			Admin ad = (Admin)e;
			ad.dosomething();
			ad.setName();
			ad.managing();

		}else if(e instanceof Worker) {
			Worker w = (Worker)e;
			w.dosomething();
			w.setName();
			w.working();
		}else if(e instanceof Executive) {
			Executive ex = (Executive)e;
			ex.dosomething();
			ex.setName();
			ex.Executing();
		}else if(e instanceof Enginear) {
			Enginear en = (Enginear)e;
			en.dosomething();
			en.setName();
			en.developing();
		}
		
		
		
	}

}
