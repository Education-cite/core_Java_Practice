package oop_concept.methodOverloading;

public class TestOverriding {

	public static void main(String[] args) {
		ChangeJourneyDate changeDate = new ChangeJourneyDate();
		//changeDate.startJourney();
		
		
		Journey j = new ChangeJourneyDate(); // upcasting
		j.startJourney();
		j.endJourney();
		
	}
	
}
