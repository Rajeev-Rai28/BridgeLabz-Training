/* Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, 
the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value */

//create a class ArraySum
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
		
		// create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Array of maximum 10 elements
        double[] arr = new double[10];

        // Variable to store sum
        double total = 0.0;

        // Index variable
        int index = 0;

        // Infinite loop
        while (true) {
			
			System.out.print("Enter a "+(index+1) +" number : ");
            double num = sc.nextDouble();

            // Break if number is 0, negative or array limit reached
            if (num <= 0 || index == 10) {
                break;
            }

            // Store value and increment index
            arr[index++] = num;
        }

        // Loop to calculate sum
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println(arr[i]);
        }

        // Display total
        System.out.println("Total = " + total);
    }
}
