/*
Create a program to calculate BMI of 10 persons and
display height, weight, BMI, and status.
*/

import java.util.Scanner;

public class BMICalculation {

    // Method to calculate BMI and Status for one person
    // Returns String array: [BMI, Status]
    public String[] calculateBMI(double weightKg, double heightCm) {

        // Convert height from cm to meter
        double heightMeter = heightCm / 100;

        double bmi = weightKg / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to compute BMI and status for all persons
    // Returns 2D String array: Height, Weight, BMI, Status
    public String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display BMI details in tabular format
    public void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persons = 10;

        // 2D array: [weight, height]
        double[][] data = new double[persons][2];

        // Take user input
        for (int i = 0; i < persons; i++) {

            System.out.print("\nEnter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        BMICalculation obj = new BMICalculation();

        // Process BMI
        String[][] result = obj.processBMI(data);

        // Display result
        obj.displayResult(result);

        sc.close();
    }
}
