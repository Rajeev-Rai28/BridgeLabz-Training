// Creating Class with name LeapYearWithSingleCondition indicating the purpose is to 
// check a Leap year or not 

import java.util.Scanner;
public class LeapYearWithSingleCondition {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter a Year : ");
	int year = sc.nextInt();

	//checking a year
	while(year>=1582){
	if(year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 400 == 0){
	   System.out.println(year +" LeapYear");
	   break;
	 }
	else {
	   System.out.println(year +" is not LeapYear");
	   break;
	 }
	}
	sc.close();
	}
}


	  
