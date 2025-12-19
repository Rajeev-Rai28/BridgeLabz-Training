// Creating Class with name PrintOddEvenFrom1ToN indicating the purpose is to 
// check if the number even or odd

import java.util.Scanner;
public class PrintOddEvenFrom1ToN {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a number
	System.out.print("Enter your Number : ");
	int number = sc.nextInt();
	
	//checking a number this is natural number or not
	if(number < 0){
	   System.out.println("This is not natural number : ");
	 }
	 else{
	   
           //print the number which is odd or even
	   for(int i = 1; i<=number; i++){
		
		if(i % 2 == 0){
		   System.out.println("The Number is even: "+i);
		}
		else{
		   System.out.println("The Number is odd : "+i);
		}
	     }
	   }
	sc.close();
	}
}
		