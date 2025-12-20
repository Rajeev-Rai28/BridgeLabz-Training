/* Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/

//create a class MaximumHandshakes
import java.util.Scanner;
public class MaximumHandshakes{

	//gate the maximum handshakes
	public static int calculateMaxHandshakes(int numberOfStudents){
	
	return (numberOfStudents * (numberOfStudents - 1))/2;
	
	}
	
	public static void main(String [] args){
		
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input a number of students
		System.out.print("Enter number of students : ");
		int numberOfStudents = sc.nextInt();
		
		// create a MaximumHandshakes object 
		MaximumHandshakes maxHandshake = new MaximumHandshakes();
		
		int maximumHandshakes = maxHandshake.calculateMaxHandshakes(numberOfStudents);
		
		//display a result 
		System.out.print("The maximum handshakes are : "+ maximumHandshakes);
		sc.close();
	}
	
}
	
	
		
		