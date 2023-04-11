package java_project;

import java.util.Scanner;

public class Encapsulation {
	
	private String userName;
	private double balance;
	private int reg;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		System.out.println("Please input your name");
		Scanner s = new Scanner(System.in);
	String name =	s.nextLine();
		if(name.equals(userName)) {
			
			System.out.println(" your Balance : " + balance);
		}else 
			System.out.println(" your user name is wrong");
			

		return balance;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int i) {
		this.reg = i;
	}
	
	

}




	

