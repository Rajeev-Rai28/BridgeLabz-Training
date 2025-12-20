/* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”   */
	
//create a class SimpleInterest to compute a simple interest

import java.util.Scanner;
public class SimpleInterest{

	// gate simple interest
	public static double calculateSimpleInterest(double principal, double rate, double time){
		
		double calculateInterest = (principal * rate * time) / 100;
		
		return calculateInterest;
		
	}	

	public static void main(String [] args){
		
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking a input
		System.out.print("Enter a principal : ");		
		double principal = sc.nextDouble();
		
		System.out.print("Enter a rate : ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter a time : ");
		double time = sc.nextDouble();
		
		// Create a SimpleInterest object
		SimpleInterest simpleInterst = new SimpleInterest();
		
		double interest = simpleInterst.calculateSimpleInterest(principal, rate, time);
		
		//print the result
		System.out.println("The Simple Interest is "+interest+" for Principal "+principal+" , Rate of Interest "+rate+" and Time "+time);
		
		sc.close();
		
	}
	
}	
	
		
	
	
