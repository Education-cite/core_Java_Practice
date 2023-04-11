package java_project;

public class If_Statement {

	public static void main(String[] args) {

		// -------if example-------------

		int number = 33;

		if (number >= 33) {

			System.out.println("you are Passed");
		}

		// if-else example -----------------

		int n = 11;

		if (n % 2 == 0) {

			System.out.println(n + " is Even Number");
		} else {
			System.out.println(n + " is odd Number");

		}

		// if-else-if example -----------------

		int num = 87;
		String grade = null;
		if (num <= 100 && num >= 80) {
			grade = "A+";
		} else if (num <= 79 && num >= 70) {
			grade = "A";

		} else if (num <= 69 && num >= 60) {
			grade = "A-";

		} else if (num <= 59 && num >= 50) {
			grade = "B";

		} else if (num <= 49 && num >= 40) {
			grade = "C";

		} else if (num <= 39 && num >= 33) {
			grade = "D";

		} else if (num <= 32 && num >= 0) {
			grade = "F";
		}
		System.out.println("Your grade is : " + grade);

		// nested if Example--------------

		int marks = 110;
		int weight = 80;
		if (marks >=80) {
			if (weight >= 80) {
				System.out.println(" you are Perfect");
			}

		} else {
			System.out.println(" you are not Perfect");

		}

	}

}
