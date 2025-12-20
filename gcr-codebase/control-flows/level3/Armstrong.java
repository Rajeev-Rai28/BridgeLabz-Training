// Creating Class with name Armstrong indicating the purpose is to 
// checking a number is Armstrong or not 

import java.util.Scanner;
public class Armstrong {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	
	int originalNumber = number;
	int sum = 0;
	
	//digit of number
	while(originalNumber != 0){
	      int digit = originalNumber % 10;
	      sum += (digit*digit*digit);
	      originalNumber /= 10;
	}
	if(number == sum){
	   System.out.print(number +" is Armstrong Number");
	}
	else{
	   System.out.print(number +" is not Armstrong Number");
	}
	sc.close();
	}
}
	