/*
 Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.
*/

import java.util.Scanner;
public class MetroSmartCard{

	//calculate fare using ternary operator
	public static int calculateFare(int distance){
	
		return (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;
	}
	
	public static double deductBalance(double balance, int fare){
		return balance - fare;
	}
	
	public static void displayBalance(double balance){
		System.out.println("Remaining Balance : "+balance+" Rs.");
	}
	
	public static void main(String[] args){
	
		//create a Scanner object
		Scanner sc = new Scanner(System.in);
		double balance = 100; //initial smart card balance
		
		System.out.println("Distance 0 to 5 km  : 10 Rs.");
		System.out.println("Distance 5 to 15 km : 20 Rs.");
		System.out.println("Distance more than 15 km : 30 Rs.");
	
		while(balance > 0){
			
			System.out.println();
			System.out.println("Current Balance : "+balance+" Rs.");
			System.out.println("Enter distance traveled (or -1 to quit): ");
		
			int distance = sc.nextInt();
	
			//Exit condition
			if(distance == -1){
				break;
			}
		
			int fare = calculateFare(distance);
			
			System.out.println("Fare : "+fare+" Rs.");
			
			//check sufficient balance
			if(balance >= fare){
				balance = deductBalance(balance, fare);
				displayBalance(balance);
				
			}
			
			else{
				System.out.println("Insufficient balance. Please recharge.");
				break;
			}
		}
		
		System.out.println("Thank you for using Delhi Metro");
		sc.close();
	}
}
			
			
			
			
			
			
			