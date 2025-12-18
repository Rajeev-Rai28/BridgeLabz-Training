//we are creating a Natural Number class

import java.util.Scanner;
public class NaturalNumber {
	public static void main(String[] args){
	
	//create a scanner object 
	Scanner sc = new Scanner(System.in);
	
	//taking input
	System.out.print("Enter a Number : "); 
	int number = sc.nextInt();
	
	//checking a number is natural or not
	if(number < 0){
	   System.out.println("The number "+number+" is not a natural number");
	}
	else{
	    int sum = number * (number + 1) / 2;
	    System.out.println("The sum of "+sum+" natural numbers is "+number);
	}
	sc.close();
	}
}
	