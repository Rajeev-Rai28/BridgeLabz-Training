/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;
public class CurrencyConverter{
	
	public static void main(String [] args){
		
		//creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		double result = 0;
		String nextConversion = "";
		
		System.out.println("+-------------Currency Converter-------------+");
		do{
			System.out.print("Enter Amount in INR : ");
			double amount = sc.nextDouble();
			
			System.out.println("Dollar / Yen / Dhiram");
			System.out.print("Enter targeted currency : ");
			String targetCurrency = sc.next().toLowerCase();
			String currency = "";
			switch(targetCurrency){
				
				case "dollar" :
					double convertDollar = amount * 0.011; //1 inr = 0.011 Dollar
					result = convertDollar;
					currency = "Dollar";
					break;
					
				case "yen" :
					double convertYen = amount * 1.74; // 1 inr = 1.74 Yen
					result = convertYen;
					currency = "Yen";
					break;
					
				case "dhiram" :
					double convertDhiram = amount * 0.041; // 1 inr = 0.041 Dhiram
					result = convertDhiram;
					currency = "Dhiram";
					break;
					
				default :
					System.out.println("Invalid input");
			}
			
			System.out.println("\nThe INR Amount is : "+amount+" And Convert into "+currency+" is : "+result);
				
			System.out.print("Do you want another conversion (Yes/No) : ");
			nextConversion = sc.next().toLowerCase();
		}while(nextConversion.equals("yes"));
		
		System.out.println("\nThankYou!");
		
		sc.close();
	}
}
		
		
