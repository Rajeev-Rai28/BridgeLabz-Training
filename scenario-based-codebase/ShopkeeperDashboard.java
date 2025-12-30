/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/


import java.util.Scanner;
public class ShopkeeperDashboard{
	public static void main(String[] args){
	
		//creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		//Take number of items input
		System.out.print("Enter number of items: ");
		int item = sc.nextInt();
		int[] items = new int[item];
		
		//Initialize discount and total bill
		double discount = 0.05;  //5% discount
		double discount2 = 0.10;  //10% discount
		double discount3 = 0.15;  //15% discount
		double totalBill = 0;
		double totalBillDiscounted = 0;
		
		//Loop through items for item prices
		for(int i=0; i<items.length; i++){
			System.out.print((i+1)+" Item price: ");
			items[i] = sc.nextInt();
			totalBill += items[i];
		}
		
		//Check for the discount condition and apply 5%, 10%, and 15% discount
		if(totalBill >= 3000){
			System.out.println("+------------------------------------+");
			System.out.println("  Discount Applied : 15%");
			totalBillDiscounted = totalBill * discount3;
		}
		else if(totalBill >= 2000){
			System.out.println("+------------------------------------+");
			System.out.println("  Discount Applied : 10%");
			totalBillDiscounted = totalBill * discount2;
		}
		else if(totalBill >= 1000){
			System.out.println("+------------------------------------+");
			System.out.println("  Discount Applied : 5%");
			totalBillDiscounted = totalBill * discount;
		}
		
		//Display the Total Bill with and without discount
		System.out.println("+------------------------------------+");
		System.out.println(" Total bill without discount: "+ totalBill);
		System.out.println(" Total bill with discount: "+ (totalBill - totalBillDiscounted));
		System.out.println("+------------------------------------+");	
	}
}