/* Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/

//create a class FindSmallestAndLargest
import java.util.Scanner;
public class FindSmallestAndLargest{
	
	//calculate sum of natural number 
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){

			int smallest  = 0;
			int largest = 0;
			
			if(number1 < number2 && number1 < number3){
				smallest = number1;
			}
			else if(number2 < number1 && number2 < number3){
				smallest = number2;
			}
			else{
				smallest = number3;
			}
			
			if(number1 > number2 && number1 > number3){
				largest = number1;
			}
			else if(number2 > number1 && number2 > number3){
				largest = number2;
			}
			else{
				largest = number3;
			}
			
			int [] arr = new int[2];
			
			arr[0] = smallest;
			arr[1] = largest;
			
			return arr;
		
		
	}
		

	public static void main(String [] args){
	
		//create a scanner object
		Scanner sc = new Scanner(System.in);
	
		//taking input from the user number
		System.out.print("Enter a first number : ");
		int number1 = sc.nextInt();
		System.out.print("Enter a second number : ");
		int number2 = sc.nextInt();
		System.out.print("Enter a first number : ");
		int number3 = sc.nextInt();
	
		FindSmallestAndLargest smallestAndLargest = new FindSmallestAndLargest();
		int [] arr = smallestAndLargest.findSmallestAndLargest(number1, number2, number3);
	
		//display a result	
		System.out.print("Smallest number is : "+ arr[0]+ " And Largest is : "+arr[1]);
		
		sc.close();
		
	}
	
}