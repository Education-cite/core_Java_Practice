package ExtraPractice;

import java.util.Scanner;

public class Employee {
	
	private String empName;
	private Long empAccNo;
	private double empBalance;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpAccNo() {
		return empAccNo;
	}
	public void setEmpAccNo(Long empAccNo) {
		this.empAccNo = empAccNo;
	}
	public double getEmpBalance() {
		Scanner s = new Scanner(System.in);
		System.out.println("please Enter your Account No ; ");
		double d = s.nextDouble();
		if(d==empAccNo) {
			System.out.println("Your Account Balance is : "+empBalance);
		}else {
			System.out.println("Wrong Account Number");
		}
		return empBalance;
	}
	public void setEmpBalance(double empBalance) {
		this.empBalance = empBalance;
	}
	
	
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpName("enamul");
		e.setEmpAccNo(1234l);
		e.setEmpBalance(5000);
		
		e.getEmpBalance();
	}
	
	

}
