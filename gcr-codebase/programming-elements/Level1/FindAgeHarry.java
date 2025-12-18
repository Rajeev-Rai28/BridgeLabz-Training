/* Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___  */

public class FindAgeOfHarry {
	public static void main(String [] args) {
		// create a variable birthYear and assign a value is 2000.
		int birthYear =  2000;
		
		// create a variable currentYear and assign a currentYear value.
		int currentYear = 2024;
	
		// create a variable currenAge and find the age.
		int currentAge = currentYear - birthYear;

		//diplay the current age.
		System.out.println("Harry's age in 2024 is "+currentAge);
	}
}