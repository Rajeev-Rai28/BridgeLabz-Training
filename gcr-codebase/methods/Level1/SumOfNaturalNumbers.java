/* Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop */

//create a class SumOfNaturalNumbers
import java.util.Scanner;
public class SumOfNaturalNumbers{
	
	//calculate sum of natural number 
	public int calculateSumOfNaturalNumbers(int number){

		int sum = 0;
		
		//check a number is natural or not
		if(number > 0){
			for(int i = 1; i<=number; i++){
			sum += i;
			}
		}
		return sum;
		
	}
		

	public static void main(String [] args){
	
		//create a scanner object
		Scanner sc = new Scanner(System.in);
	
		//taking input from the user number
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
	
		SumOfNaturalNumbers sumOfNatural = new SumOfNaturalNumbers();
		int sum = sumOfNatural.calculateSumOfNaturalNumbers(number);
	
		//display a result	
		System.out.print("The sum of Natural number : "+sum);
		
		sc.close();
		
	}
	
}
	