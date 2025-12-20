/* Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)   */

import java.util.Scanner;
class WeatherCalculator {

    // calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {

        // Applying the wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        // Return value
        return windChill;
    }

    public static void main(String[] args) {

        //create Scanner object
        Scanner sc = new Scanner(System.in);

        // Creating object of WeatherCalculator 
        WeatherCalculator wc = new WeatherCalculator();

        // Taking temperature input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();

        // Taking wind speed input
        System.out.print("Enter wind speed (in mph): ");
        double speed = sc.nextDouble();

        // Calling method to calculate wind chill
        double result = wc.calculateWindChill(temp, speed);

        // Displaying result
        System.out.println("Wind Chill Temperature: " + result);
		
		sc.close();
    }
}
