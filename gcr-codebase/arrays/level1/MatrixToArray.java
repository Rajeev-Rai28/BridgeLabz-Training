/*  Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/

//create a class MatrixToArray
import java.util.Scanner;
public class MatrixToArray {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a rows : ");
        int rows = sc.nextInt();
		System.out.print("Enter a columns : ");
        int columns = sc.nextInt();

        // 2D array
        int[][] matrix = new int[rows][columns];

        // 1D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
				System.out.print("Enter a ("+(i+1)+", "+ (j+1)+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copy to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
