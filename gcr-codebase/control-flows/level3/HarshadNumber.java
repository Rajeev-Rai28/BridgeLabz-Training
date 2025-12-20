// Creating Class with name HarshadNumber indicating the purpose is to 
// checking a number is Armstrong or not 

import java.util.Scanner;
public class HarshadNumber {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	
	int temp = number;
	int sum = 0;
	
	//digit of number
	while(temp != 0){
	      int digit = temp % 10;
	      sum += digit;
	      temp /= 10;
	}
	if(number % sum == 0){
	   System.out.print("Harshad Number");
	}
	else{
	   System.out.print("Not a Harshad Number");
	}
	sc.close();
	}
}
	