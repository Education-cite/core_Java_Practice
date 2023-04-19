package ExtraPractice;

import java.util.Scanner;

public class If_Else_Statement {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Please Enter int number");
	
	int num = s.nextInt();
	String grade = "";
	
	if(num>=80 && num<=100) {
		System.out.println(grade="A+");
	}
	
	else if(num>=70 && num<=79) {
		System.out.println(grade="A");
	}
	
	else if(num>=60 && num<=69) {
		System.out.println(grade="A-");
	}
	
	else if(num>=50 && num<=59) {
		System.out.println(grade="B");
	}
	
	else if(num>=40 && num<=49) {
		System.out.println(grade="C");
	}
	
	else if(num>=33 && num<=39) {
		System.out.println(grade="D");
	}
	
	else if(num>=0 && num<=32){
		System.out.println(grade="F");
	}else {
		System.out.println("Invalid Point");
	}
	
	
	
	
	
}
}
