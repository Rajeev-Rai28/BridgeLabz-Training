/* Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and module operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor)  */

//create a class FindQuotientAndModule
import java.util.Scanner;
public class FindQuotientAndModule{
	
	//calculate sum of natural number 
	public static int[] findRemainderAndQuotient(int number, int divisor){

		int quotient  = number / divisor;
		int reminder = number % divisor;
			
			
		int []arr = new int[2];	
		arr[0] = quotient;
		arr[1] = reminder;
			
		return arr;
		
		
	}
		

	public static void main(String [] args){
	
		//create a scanner object
		Scanner sc = new Scanner(System.in);
	
		//taking input from the user 
		System.out.print("Enter a  number : ");
		int number = sc.nextInt();
		System.out.print("Enter a divisior : ");
		int divisor = sc.nextInt();
	
		//create a object of FindQuotientAndModule
		FindQuotientAndModule obj = new FindQuotientAndModule();
		int [] arr = obj.findRemainderAndQuotient(number, divisor);
	
		//display a result	
		System.out.print("quotient is : "+ arr[0]+ " And reminder is : "+arr[1]);
		
		sc.close();
		
	}
	
}