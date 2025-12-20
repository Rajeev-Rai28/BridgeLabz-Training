// Creating Class with name FindAllMultipulseOfNumber indicating the purpose is to 
// print all multipules of a number between 100 to 1

import java.util.Scanner;
public class FindAllMultipulseOfNumber {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();

	// find multipules of a number between 100 to 1 using for loop
	for(int i = 100; i>=1; i--){
	    if(number % i == 0){
		System.out.println(i);
		continue;
	     }
	}
	sc.close();
	}
}