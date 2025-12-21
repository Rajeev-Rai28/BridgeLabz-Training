/*  Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/

//create a class TableSixToNine
import java.util.Scanner;
public class TableSixToNine {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);

        // Input number
		System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // Array to store results
        int[] result = new int[4];

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
		sc.close();
    }
}
