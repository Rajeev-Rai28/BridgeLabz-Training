// Creating Class with name PrimeOrNot indicating the purpose is to 
// checking a prime number 

import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();

	
	Boolean isPrime = true;

	//checking a number is prime or not
	for(int i = 2; i<number; i++){
	    if(number % i == 0){
	       isPrime = false;
	       break;
	    }
	}
	
	if(isPrime == false){
	        System.out.println(number +" is Not Prime ");
	}
	else{
		System.out.println(number+" is Prime");
	}
	sc.close();
	}
}

		
	