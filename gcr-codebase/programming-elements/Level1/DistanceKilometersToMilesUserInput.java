import java.util.Scanner;
public class DistanceKilometersToMilesUserInput {
	public static void main(String [] args) {
	
	//creating a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//take input
	System.out.print("Enter the distance in km : ");
	double kiloMeter = sc.nextDouble();

	//converts in miles, 1km = 1.6 miles
	double totalMiles = kiloMeter * 1.6;

	//display the result
	System.out.println("The total miles is "+totalMiles+" mile for the given "+ kiloMeter+" km");
	}
}
