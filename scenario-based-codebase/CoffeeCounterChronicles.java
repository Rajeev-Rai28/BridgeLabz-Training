/*Problem : The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.

Write a Java program that asks the user for the coffee type using switch, accepts quantity, 
calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, 
and continues serving customers using a while loop. The program should stop when the user types “exit”.

*/

import java.util.Scanner;
public class CoffeeCounterChronicles {
	
	static double gstRate = 0.18;
	
	public static void diplayMenu(){
		
		System.out.println("Available Cofee Types : ");
		System.out.println("1. Espresso      : 120");
		System.out.println("2. Latte         : 150");
		System.out.println("3. Cappuccino    : 180");
		System.out.println("Type 'exit' to close the cafe oreder");
		
	}
	
	public static double getCoffeePrice(String coffeeType){
	
		switch (coffeeType){
		
			case "espresso":
				return 120;
			case "latte":
				return 150;
			case "cappuccino":
				return 180;
			default:
				return 0;
		}
		
	}
			
	public static double calculateGST(double amount){
		return amount * gstRate;
	}
	
	public static void printBill(String coffeeType, double pricePerCup,int quantity, double totalAmount, double gstAmount, double finalBill){
		
		System.out.println("BILL DETAILS :");
		System.out.println("Coffee Type : "+coffeeType);
		System.out.println("Price per cup : "+pricePerCup+" Rs.");
		System.out.println("Quantity : "+ quantity);
		System.out.println("Total Amount : "+totalAmount +" Rs.");
		System.out.println("GST (18%) : "+gstAmount +" Rs.");
		System.out.println("Final Bill : "+finalBill+" Rs.");
	}
	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			
			diplayMenu();
		
			System.out.print("Enter Cofee Types : ");
			String coffeeType = sc.next().toLowerCase();
			
			if(coffeeType.equals("exit")){
				System.out.println("your order close. Thank you! ☕");
				break;
			}
			
			double pricePerCup = getCoffeePrice(coffeeType);
			
			if(pricePerCup == 0){
				System.out.println("Invalid coffe type, try again");
				continue;
			}
			
			
			System.out.print("Enter quantity : ");
			int quantity = sc.nextInt();
			
			double totalAmount = pricePerCup * quantity;
			double gstAmount = calculateGST(totalAmount);
			double finalBill = totalAmount + gstAmount;
			
			printBill(coffeeType, pricePerCup, quantity, totalAmount, gstAmount, finalBill);
		}
		
		sc.close();
	}
}
		
		
		
		