// Creating Class with name VolumeOfEarth indicating the purpose is to 
//  find a volume

public class VolumeOfEarth{
	public  static void main(String [] args){

		//predefine input		
		int radiusOfEarth = 6378;
		double pi = 3.14;
		
		//convert radius in km to miles
		double radiusInMiles = 0.621371*radiusOfEarth;	
		
		//find volume cubic in kilometer 		
		double  cubicKilometer = (4.0/3.0)*pi*radiusOfEarth*radiusOfEarth*radiusOfEarth;

		//find volume cubic in miles
		double cubicMiles =  (4.0/3.0)pi radiusInMiles * radiusInMiles * radiusInMiles ;

		//display the output
		System.out.print("The volume of earth in cubic kilometer is "+cubicKilometer+" and cubic miles is "+cubicMiles);

		}
}