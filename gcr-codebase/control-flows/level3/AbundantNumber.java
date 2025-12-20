// Creating Class with name AbundantNumber indicating the purpose is to 
// checking a number is Abundant or not 

import java.util.Scanner;
public class AbundantNumber {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	
	int sum = 0;
	
	for(int i = 1; i<number; i++){
	    if(number % i == 0){
	       sum += i;
	    }
	}
	
	if(sum > number){
	    System.out.println("Abundant Number");
	}
	else{
	   System.out.println("Not an Abundant Number");
	}
	sc.close();
	}
}
