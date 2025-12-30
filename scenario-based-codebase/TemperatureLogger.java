/* 11. Temperature Logger 🌡️
● Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;
public class TemperatureLogger {
	
	public static void main(String [] args){
		
		//create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		double maxTemperature = 0;
		
		
		//initializing a array to store temperature
		double [] days = new double[7];
		
		//taking input as temperature and store in array
		System.out.println("\n\t   Temperature Logger");
		
		System.out.println("+---------------------------------------------+");
		for(int i = 0; i<days.length; i++){
			System.out.print("Enter Temperature of "+(i+1)+" days in celcius : ");
			days[i] = sc.nextInt();
			sum += days[i];
		}
		
		System.out.println("+---------------------------------------------+");
		//find average
		double average = sum / 7;
		
		//find a max temperature
		for(int i = 0; i<days.length; i++){
			if(maxTemperature < days[i]){
				maxTemperature = days[i];
			}
		}
		
		System.out.println("Max temperature is : "+maxTemperature);
		System.out.printf("Average temperature is : "+"%.2f",average);
		
		System.out.println("\n+---------------------------------------------+");
		sc.close();
	}
}
		

