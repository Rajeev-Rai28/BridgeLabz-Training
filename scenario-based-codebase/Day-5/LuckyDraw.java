/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;
public class LuckyDraw{
	
	public static void main(String [] args){
		
		//Creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Diwali mela!\n");
		
		int totalSlots = 10;
		
		while(true){
			
			//breaking condition
			if(totalSlots == 0){
				System.out.println("Slots are full");
				break;
			}
			
			//taking a input 
			System.out.print("Enter a number : ");
			int number = sc.nextInt();
			
			//check number is divisible by 3 and 5
			if(number % 3 == 0 && number % 5 == 0){
				System.out.println("You won a gift\n");
			}
			else{
				System.out.println("Invalid number\n");
			}
			
			totalSlots--;
		}
		sc.close();
	}
}