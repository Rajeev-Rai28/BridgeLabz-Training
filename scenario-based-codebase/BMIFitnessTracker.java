/*  Maya’s BMI Fitness Tracker

Maya is a fitness coach who wants to calculate BMI for her clients.

Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and 
prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. 
Use meaningful variable names and proper comments to maintain clean code.
*/

import java.util.Scanner;
public class BMIFitnessTracker {
	
	//calculate a BMI
	public static double calculateBMI(double weight,double height){
		return weight / (height * height);
	}
	
	// get the BMI category
	public static String getBMICategory(double bmi){
		
		if(bmi < 18.5){
			return "Underweight";
		}
		else if(bmi >= 18.5 && bmi < 25){
			return "Normal";
		}
		else{
			return "Overweight";
		}
	}
	
	
	public static void main(String [] args){
	
		// creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.print("Enter your weight (in kg): ");
		double weightInKg = sc.nextDouble();
		
		System.out.print("Enter your height (in meters): ");
		double heightInMeters = sc.nextDouble();
		
		//calculate BMI
		double bmi = calculateBMI(weightInKg, heightInMeters);
		
		//calculate category
		String bmiCategory = getBMICategory(bmi);
		
		//display the result
		System.out.println("Your BMI is : " + bmi);
        System.out.println("BMI Category: " + bmiCategory);
		
		sc.close();
	}
}
