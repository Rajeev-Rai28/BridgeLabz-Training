/* Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. 
Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

//create a class OddEvenArray
import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
		
		//create a Scanner object
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numer : ");
        int number = sc.nextInt();

        // Check natural number
        if (number <= 0) {
            System.out.println("Invalid Natural Number");
            return;
        }

        // Arrays for odd and even numbers
        int[] oddArr = new int[number / 2 + 1];
        int[] evenArr = new int[number / 2 + 1];

        int odd = 0, even = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArr[even++] = i;
            } else {
                oddArr[odd++] = i;
            }
        }

        // Display odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < odd; i++) {
            System.out.print(oddArr[i] + " ");
        }

        // Display even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < even; i++) {
            System.out.print(evenArr[i] + " ");
        }
    }
}
