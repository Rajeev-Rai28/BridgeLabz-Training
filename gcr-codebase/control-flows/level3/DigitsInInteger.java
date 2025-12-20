// Creating Class with name DigitsInInteger indicating the purpose is to 
// count a digit in integer

import java.util.Scanner;
public class DigitsInInteger {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	
	//initialize a count
	int count = 0;

	//checking a digit in number
	while(number != 0){
	      count++;
	      number /= 10;
	}
	
	//display the output
	System.out.println("Number of Digit : "+count);
	
	sc.close();
	}
}

