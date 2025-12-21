/* Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check 
if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/

// create a class NumberCheck 
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);

        // Array of 5 integers
        int[] arr = new int[5];

        // Input and checking
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                // Positive number
                if (arr[i] % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Comparing first and last elements
        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater");
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("First element is Less");
        } else {
            System.out.println("First and Last elements are Equal");
        }
		
		sc.close();
    }
}
