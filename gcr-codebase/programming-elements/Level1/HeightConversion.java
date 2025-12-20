//import a Scanner class 

import java.util.Scanner;
public class HeightConversion {
	public static void main(String [] args) {

	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input 
	System.out.print("Enter your height in cm : ");
	double heightCm = sc.nextDouble();

	//convert height centimeter to inch
	double heightInches = heightCm / 2.54;

	int feet = (int)heightInches/12;
	 
	double inches = heightInches % 12;
	
	system.out.println("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inches);

	sc.close();
	}
}