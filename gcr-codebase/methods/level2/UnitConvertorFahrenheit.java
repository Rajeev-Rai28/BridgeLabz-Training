/* Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;  */

public class UnitConvertorFahrenheit {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // Formula: (F - 32) * 5 / 9
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        // Formula: (C * 9 / 5) + 32
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = liters * 0.264172;
        return liters2gallons;
    }

    // Main method to test the UnitConvertor class
    public static void main(String[] args) {

        System.out.println("100°F = " + convertFarhenheitToCelsius(100) + " °C");
        System.out.println("37°C = " + convertCelsiusToFarhenheit(37) + " °F");

        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("70 kg = " + convertKilogramsToPounds(70) + " pounds");

        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("10 liters = " + convertLitersToGallons(10) + " gallons");
    }
}
