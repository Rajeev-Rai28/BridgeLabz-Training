/* 
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;
public class DistanceTracker{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int totalDistance = 0;
		
		while(true){
			
			totalDistance += 3;
			System.out.println();
			System.out.print("Do you want to get off (yes/no) : ");
			String userChoice = sc.next().toLowerCase();
			if(userChoice.equals("yes")){
				System.out.println("Total distance : "+totalDistance+" km travelled by user");
				System.out.println("Thank You !");
				break;
			}
		}
		sc.close();
	}
}
