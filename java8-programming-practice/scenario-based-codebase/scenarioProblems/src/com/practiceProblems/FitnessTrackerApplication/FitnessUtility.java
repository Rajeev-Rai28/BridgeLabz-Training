package com.practiceProblems.FitnessTrackerApplication;

public class FitnessUtility {
	
	public boolean checkActivityValidName(String activityName) throws FitnessException{
		
		if( !(activityName.equals("Walking") || activityName.equals("Running") || activityName.equals("Cycling"))){
			throw new FitnessException("Error : Invalid "+activityName);
		}
		
		return true;
	}
	
	public boolean checkValidDurationAndIntensity(double duration, int intensityLevel) throws FitnessException{
		
		if( !(duration > 0 || (intensityLevel > 0 && intensityLevel < 9))) {
			throw new FitnessException("Error : Invalid duration or intensity");
		}
		
		return true;
	}
	
	public boolean checkWeight(double weight) throws FitnessException{
		if(weight < 1 ) {
			throw new FitnessException("Error:User Weight is invalid.");
		}
		
		return true;
	}
	
	public boolean checkInput(String [] parts) throws FitnessException{
		
		
		if(!(parts.length == 3 || parts[0].matches("^[a-zA-Z]+$") || parts[1].matches("^\\d+(\\.\\d+)?$") || parts[2].matches("^\\d+$"))) {
			throw new FitnessException("Error:Invalid activity data format.");
		}
		return true;
	}
	
	public double burnCalorie(String activity,double duration, int intensity, double weight ) {
		int caloriesPerMinute = 0;
		switch(activity) {
		case "Walking" : 
			caloriesPerMinute = 3;
			break;
		case "Running" : 
			caloriesPerMinute = 7;
		case "Cycling" : 
			caloriesPerMinute = 5;
		}
		return (caloriesPerMinute * duration * intensity * 60) / weight;
		
	}
}
