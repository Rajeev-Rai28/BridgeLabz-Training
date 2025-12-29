/*
 The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
	
	public static void main(String [] args){
	
		//creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		//creating a random object
		Random r = new Random();
		
		int min = 1;
		int max = 100;
		
		int attempt = 0;
		
		//taking input a random number
		int randomNumber = r.nextInt(((max - min) + 1) + min);
		
		do{
			
			//show number limit and left attempt
			System.out.println("enter a number between 1 to 100");
			System.out.println("You have "+(5-attempt)+" attempt left");
			
			int number = sc.nextInt();
			
			
			if(number > 100){
				System.out.println("Number should enter betwwen 1 to 100");
				attempt++;
				continue;
			}
			attempt++;
			if(randomNumber > number){
				System.out.println("Too Low");
			}
			else if(randomNumber < number){
				System.out.println("Too High");
			}
			else{
				System.out.println("you won the game");
				break;
			}
			
			if(attempt == 5){
				System.out.println("limit exceed");
				break;
			}
		}while(true);
		
		System.out.println("Random Number is : "+randomNumber);
		if(attempt >= 5){
			System.out.println("Better luck next time");
		}
		
		
	}
}