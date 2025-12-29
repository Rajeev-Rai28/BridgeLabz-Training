/* 6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/
import java.util.Scanner;
public class SmartParkingSystem {
	
	// Show optins in Parking sysytem
	public static void showOptions(){
	System.out.println("1. Park");
	System.out.println("2. Exit");
	System.out.println("3. Show Occupancy");
	
	}
	
	
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	int parkCapacity = 5;
	int carpark = 0;
	boolean exit = false;
	while(true){
		
		//calling a showOption method to display options
		showOptions();
		System.out.print("Choose one Option : ");
	
		//taking input
		int choose = sc.nextInt();
		
		// checking condition for parking lot is full or not
		if(parkCapacity == carpark){
			System.out.println("Parking lot is full");
			break;
		}
	
		switch(choose){
			case 1 :
				System.out.println("Car parked");
				carpark++;
				break;
			case 2 :
				//System.out.println("you are succesfully exit");
				exit = true;
				break;
			case 3 :
				System.out.println("Total parked car : "+carpark);
				System.out.println((parkCapacity- carpark)+" left space in parking lot");
				break;
			default:
                System.out.println("Invalid Option");
		}
		
		if(exit){
			System.out.println("you are succesfully exit ");
			break;
		}
		
	}
	
	System.out.println("Thank you! visit Again ");
	
	}
}
	
	
	
	
	
	
			
	