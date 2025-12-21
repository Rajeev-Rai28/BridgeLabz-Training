/* Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array. 
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/

import java.util.Scanner;

public class FactorsDynamic {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numer : ");
        int number = sc.nextInt();

        int max = 10;
        int[] factors = new int[max];
        int index = 0;

        // Loop to find factors
        for (int i = 1; i <= num; i++) {
            if (number % i == 0) {

                // Resize array if full
                if (index == max) {
                    max *= 2;
                    int[] temp = new int[max];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        // Display factors
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
