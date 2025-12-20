// Creating Class with name FindAllMultipulseOfNumberUsingWhileLoop indicating the purpose is to 
// print all multipules of a number between 100 to 1

import java.util.Scanner;
public class FindAllMultipulseOfNumberUsingWhileLoop {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();

	// find multipules of a number between 100 to 1 using for loop
	int counter = number-1;
	while(counter > 1){
	    if(number % counter == 0){
		System.out.println(counter);
		
	     }
	    counter--;
	}
	sc.close();
	}
}