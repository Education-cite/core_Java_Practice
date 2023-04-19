package ExtraPractice;

import java.util.Scanner;

public class SwitchStatament {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please Enter int number");
	
	int month = s.nextInt();
	String monthName = "";
	
	switch(month) {
	case 1 : monthName = "Jan";
	break;
	
	case 2 : monthName = "feb";
	break;
	
	case 3 : monthName = "march";
	break;
	
	case 4 : monthName = "april";
	break;
	
	case 5 : monthName = "may";
	break;
	
	case 6 : monthName = "Jun";
	break;
	
	
	case 7 : monthName = "July";
	break;
	
	case 8 : monthName = "august";
	break;
	
	case 9 : monthName = "september";
	break;
	
	case 10 : monthName = "october";
	break;
	
	case 11 : monthName = "November";
	break;
	
	case 12 : monthName = "December";
	break;
	
	
	default: System.out.println("Invaild Month");
	
	}
	
	System.out.println("Month Name is : " + monthName);
}
}
