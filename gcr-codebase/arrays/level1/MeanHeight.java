/* Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/

//create a class MeanHeight
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {

		//create a scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];

        double sum = 0;

        // Input heights and calculate sum
        for (int i = 0; i < heights.length; i++) {
			System.out.print("Enter a Player "+(i+1)+" height : ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / 11;

        System.out.println("Mean Height = " + mean);
		
		sc.close();
    }
}
