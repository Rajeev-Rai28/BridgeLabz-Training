// Creating Class with name PowerOfNumberUsingWhileLoop indicating the purpose is to 
// print  power of a number

import java.util.Scanner;
public class PowerOfNumberUsingWhileLoop {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	System.out.print("Enter your power : ");
	int power = sc.nextInt();
	
	int result = 1;
	
	int counter = 1;
	while(counter <= power){
		result *= number;
		counter++;
	}
	
	System.out.println(result);
	}
}