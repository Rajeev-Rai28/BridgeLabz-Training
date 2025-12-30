/*12. Train Reservation Queue
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.Scanner;
public class TrainReservationQueue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int seats = 10;  //Ten seats
		int count = 0;		
		System.out.println("  Train Reservation System");
		System.out.println();
		System.out.println(" (Book / Exit / Show Seats)");
		
		MAIN:
		while(true){
			System.out.println("+--------------------------+");
			System.out.print(" Enter task: ");		
			String task = sc.nextLine().toLowerCase();
			
			//Exit logic
			if(task.equals("exit")){
				System.out.println(" Thankyou for visiting!");
				System.out.println();
				break;
			}
			
			//Switch for chooseing between book, and show seats available
			switch(task){
				case "book" :
				
					//Exit if no seat available
					if((seats-count)==0){
						System.out.println(" No seats available.");
						System.out.println();
						break MAIN;
					}
					
				    System.out.println(" The ticket is 100/-");
					System.out.print(" Pay the amount: ");
					double amount = sc.nextDouble();
					sc.nextLine();   // buffer cleaner
					
					//Logic for checking the amount
					if(amount<100){
						System.out.println("Invalid amount");
						break;
					}
					
					System.out.println("+--------------------------+");
					System.out.println("       Ticket booked");
					
					if (amount > 100){
						System.out.println(" Remaining balance: " + (amount - 100));
					}
					System.out.println();
					count++;
					break;
					
				case "show seats" :
					System.out.println(" "+ (seats-count) + " seats are available");
					System.out.println();
					break;
					
				default :
					continue;
			}
		}
	}
}