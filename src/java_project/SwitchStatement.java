package java_project;

public class SwitchStatement {
	public static void main(String[] args) {
		
		int month = 11;
		String monthName="";
		
		switch(month) {
		
		case 1:monthName="January";
		break;
		
		case 2:monthName="february";
		break;
		
		case 3:monthName="March";
		break;
		
		case 4:monthName="April";
		break;
		
		case 5:monthName="may";
		break;
		
		case 6:monthName="June";
		break;
		
		case 7:monthName="July";
		break;
		
		case 8:monthName="august";
		break;
		
		case 9:monthName="September";
		break;
		
		case 10:monthName="October";
		break;
		
		case 11:monthName="November";
		break;
		
		case 12:monthName="December";
		break;
		
		default:System.err.println("Invalide Month");
		
			
		}
				
		System.out.println(monthName);
	}
}
