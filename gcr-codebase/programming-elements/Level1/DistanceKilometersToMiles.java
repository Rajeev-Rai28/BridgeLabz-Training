/* 
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/

public class DistanceKilometersToMiles {
	public static void main(String [] args) {
	
	//input initialize
	double kilometer = 10.8;

	//converts in miles, 1km = 1.6 miles
	double toMiles = kilometer * 1.6;

	//display the result
	System.out.println("The distance "+ kilometer+ " km in miles is "+ toMiles);
	}
}
