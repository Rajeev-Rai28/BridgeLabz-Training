/* An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, 
then how many rounds must the athlete complete

*/

//create a class AthleteRuns
 
import java.util.Scanner;
public class AthleteRuns{
	
	//calculate the perimeter and round
	public double perimeter(double firstSide, double secondSide, double thirdSide, double distanceInMeter){
		
		double totalPerimeter = firstSide+secondSide+thirdSide;
		double rounds = distanceInMeter / totalPerimeter;
		
		return rounds;
	}
		
	
	
	public static void main(String [] args){
	
		//create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input as 3 sides
		System.out.print("Enter first side of a triangle : ");
		double firstSide = sc.nextDouble();
		
		System.out.print("Enter second side of a triangle : ");
		double secondSide = sc.nextDouble();
	
		System.out.print("Enter third side of a triangle : ");
		double thirdSide = sc.nextDouble();
	
		//total distance is 5 km
		int distanceKm = 5;
		
		//distance conversion km to meters
		double distanceInMeter = distanceKm * 1000;
		
		//create a object 
		AthleteRuns athleteRuns = new AthleteRuns();
		double rounds = athleteRuns.perimeter(firstSide, secondSide, thirdSide, distanceInMeter);
		
		//display a result 
		System.out.print("The athlete will complete the "+rounds+" rounds");
		
		sc.close();
		
	}
}