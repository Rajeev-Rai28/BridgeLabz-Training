/* 
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatch{
	public static void main(String[] args){

		//Created a labelled loop to control the outer loop form inner loop
		watch:
		for(int hour=0; hour<24; hour++){
			for(int minute=0; minute<60; minute++){
				
				//Show the time
				System.out.print("Time - ");
				//Break if the time is 13 : 00 and simulate power cut
				if(hour==13 && minute==0){
					System.out.println(hour+" : "+"0"+minute +" <- Power cut");
					break watch;
				}
				
				//Formating the time in 24 hour format
				if(hour<10){
					System.out.print("0" + hour+" : ");
				}  
				else{
					System.out.print(hour + " : ");
				}      
				if(minute<10){
					System.out.println("0"+ minute);
				} 
				else {
					System.out.println(minute);
				}  
			}	
		}
	}
}