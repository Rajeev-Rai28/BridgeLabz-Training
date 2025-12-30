/*
14. Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;
public class MovieBookingApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int seats = 10;
		
		//Prices for seats and snacks
		double goldSeat = 200;
		double silverSeat = 150;
		double popcornPrice = 50;
		double coldDrinkPrice = 40;
		System.out.println();
		System.out.println("   Movie Ticket Booking App ");
		System.out.println("+------------------------------+");
		
		//Looping till exit or no seats available
		while(true){
			//Condition till no seats available
			if(seats == 0){
				System.out.println(" No seats available.");
				break;
			}
			
			//Enter movie choice
			System.out.println(" (Avengers / Avatar / Superman)");
			System.out.print(" Enter Movie: ");
			String movieType = sc.next().toLowerCase();
			System.out.println();
	
			//Switch movies
			switch(movieType){
				case "avengers" :
				case "avatar" :
				case "superman" :
					break;
				default :
                    System.out.println(" Invalid movie.");
                    continue;
         
			}
			
			//Enter seats choice
			System.out.println(" (Gold / Silver)");
			System.out.print(" Enter seat type: ");
			String seatType = sc.next().toLowerCase();
			System.out.println();
			
			if(!seatType.equals("gold") && !seatType.equals("silver")){
				System.out.println(" Invalid seat");
				continue;
			}
			
			//Enter snacks type
			System.out.println(" (Popcorn / Cold drink)");
			System.out.print(" Enter snacks type: ");
			String snacksType = sc.next().toLowerCase();
			System.out.println();
			
			//Calculate total bill
			double totalBill = 0.0;
			if(seatType.equals("gold")){
				totalBill += goldSeat;
			}else{
				totalBill += silverSeat;
			}
			if(snacksType.equals("popcorn")){
				totalBill += popcornPrice;
			}else if(snacksType.equals("colddrink")){
				totalBill += coldDrinkPrice;
			}else{
				System.out.println(" Invalid snack option!");
				continue;
			}
			seats--;
			
			//Display the results
			System.out.println("+------------------------------+");
			System.out.println(" Movie: "+ movieType);
			System.out.println(" Seat: "+ seatType);
			System.out.println(" Snacks: "+ snacksType);
			System.out.println(" Total Bill: "+ totalBill);
			System.out.println("+------------------------------+");
			System.out.println();
			
			System.out.print("Do you want to book another ticket? (yes/no): ");
			String choice = sc.next().toLowerCase();

			//Exit condition
			if (choice.equals("no")) {
				System.out.println("Thank you for visiting!");
				break;
			}

		}
		
		
	}
}