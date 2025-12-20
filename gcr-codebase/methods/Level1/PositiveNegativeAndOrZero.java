/* Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero */

//create a class PositiveNegativeAndOrZero
import java.util.Scanner;
public class PositiveNegativeAndOrZero{
	
	//checking a number 
	public int checkPositiveNegativeAndOrZero(int number){
	
		if(number < 0){
			return -1;
		}
		else if(number > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
		

	public static void main(String [] args){
	
		//create a scanner object
		Scanner sc = new Scanner(System.in);
	
		//taking input from the user number
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
	
		PositiveNegativeAndOrZero positiveNegativeAndOrZero = new PositiveNegativeAndOrZero();
		int result = positiveNegativeAndOrZero.checkPositiveNegativeAndOrZero(number);
	
		//display a result	
		if(result == -1){
			System.out.print("The number is negative ");
		}
		else if(result == 1){
			System.out.print("The number is positive");
		}
		else{
			System.out.print("The number is zero ");
		}
		sc.close();
		
	}
	
}
	
	