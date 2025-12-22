/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. 
Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the
 sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/

import java.util.Scanner;
public class NumberChecker{
		
	public static int countDigits(int number){
		int count = 0;
		
		while(number != 0){
			
			count++;
			number /= 10;
		}
		
		return count;
	}
	
	public static int[] digitsStoreInArray(int number, int count){
		
		int [] arr = new int[count];
		int index = 0;
		while(number != 0){
			
			arr[index++] = number % 10;
			number /= 10;
		}
	
		return arr;
	}
	
	
	
	public static boolean checkIsDuck(int digitsArray[]){

		boolean check = true;
		for(int i = 0; i<digitsArray.length; i++){
			if(digitsArray[i] == 0){
				check = false;
			}
		}
		
		return check;
	}
	
	public static boolean isArmstrong(int [] digitsArray, int number){
		
		int sum = 0;
		for(int i = 0; i<digitsArray.length; i++){
		
			sum += (digitsArray[i] * digitsArray[i] * digitsArray[i]);
			
		}
		
		
		return number == sum;
		
	}
	
	public static int[] largestAndSecondLargest(int [] digitsArray){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i<digitsArray.length; i++){
			if(largest < digitsArray[i]){
				secondLargest = largest;
				largest = digitsArray[i];
			}
			else if(digitsArray[i] > secondLargest && digitsArray[i] != largest){
				secondLargest = digitsArray[i];
			}
		}
		return new int [] {largest, secondLargest};
	}
	
	public static int[] smallestAndSeconSmallest(int [] digitsArray){

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i<digitsArray.length; i++){
			if(smallest > digitsArray[i]){
				secondSmallest = smallest;
				smallest = digitsArray[i];
			}
			else if(digitsArray[i] < secondSmallest && digitsArray[i] != smallest){
				secondSmallest = digitsArray[i];
			}
		}
		return new int [] {smallest, secondSmallest};
	}

	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		int count = countDigits(number);
		
		int [] digitsArray = digitsStoreInArray(number, count);
		
		boolean isDuck = checkIsDuck(digitsArray);
		
		boolean armstrong = isArmstrong(digitsArray, number);
		
		int [] largest = largestAndSecondLargest(digitsArray);
		
		int [] smallest = smallestAndSeconSmallest(digitsArray); 
		
		//display a results
		System.out.println("Total count digit in Number is : "+count);
		System.out.println("Duck Number : "+isDuck);
		System.out.println("Armstrong number : "+armstrong);
		System.out.println("Largest : "+largest[0]+" And second largest : "+largest[1]);
		System.out.println("smallest : "+smallest[0]+" And second smallest : "+smallest[1]);
		
		sc.close();
		
	}
}