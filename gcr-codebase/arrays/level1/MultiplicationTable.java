/*  Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___  */

//create a class MultiplicationTable
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);

        // taking input
		System.out.print("Enter your Number : ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

