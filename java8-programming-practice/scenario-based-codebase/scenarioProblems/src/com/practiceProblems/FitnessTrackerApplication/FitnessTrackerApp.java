package com.practiceProblems.FitnessTrackerApplication;
import java.util.Scanner;

public class FitnessTrackerApp {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		FitnessUtility fu = new FitnessUtility();
		
		try {
			System.out.println("Enter activity in format Activity:Duration:Intensity");
			String input = sc.nextLine();
			
			String [] parts = input.split(":");
			String activityName = parts[0];
			double duration = Double.parseDouble(parts[1]);
			int intensityLevel = Integer.parseInt(parts[2]);
			
			System.out.println("Enter your weight in kg : ");
			double weight = sc.nextDouble();
			
		fu.checkActivityValidName(activityName);
			fu.checkValidDurationAndIntensity(duration, intensityLevel);
			fu.checkWeight(weight);
			fu.checkInput(parts);
			System.out.println("Total Calories : "+fu.burnCalorie(activityName,duration, intensityLevel, weight));
			
		}
		catch(FitnessException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
	
		
	}
}
