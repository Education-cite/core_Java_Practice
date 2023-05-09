package raf_Practice;

import java.util.Scanner;

public class Employee {
	public String name="eedr";
	private int accNo;
	private int accBal;
	private static Employee e;
	
	
	private Employee() {
		
	}
	
	public static synchronized Employee getEmployee() {
	
		
		if(e==null) {
			
			synchronized (Employee.class) {
				if(e==null) {
					e=new Employee();
				}
			}
		}
		return e;
	}
	
	
	
	

}
