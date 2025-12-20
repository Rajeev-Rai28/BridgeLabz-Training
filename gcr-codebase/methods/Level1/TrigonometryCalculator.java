/* Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle) */

import java.util.Scanner;
class TrigonometryCalculator {

    // calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle degrees to radians
        double radians = Math.toRadians(angle);

        // Array to store sine, cosine, and tangent values
        double[] result = new double[3];

        // Calculating sine of the angle
        result[0] = Math.sin(radians);

        // Calculating cosine of the angle
        result[1] = Math.cos(radians);

        // Calculating tangent of the angle
        result[2] = Math.tan(radians);

        // Returning array containing results
        return result;
    }

    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // Creating object of TrigonometryCalculator 
        TrigonometryCalculator tc = new TrigonometryCalculator();

        // taking angle input in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling method to calculate trigonometric functions
        double[] values = tc.calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.println("Sine value: " + values[0]);
        System.out.println("Cosine value: " + values[1]);
        System.out.println("Tangent value: " + values[2]);
		
		sc.close();
    }
}
