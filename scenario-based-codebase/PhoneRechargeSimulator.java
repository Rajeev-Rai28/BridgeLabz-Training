/* 10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

class PhoneRechargeSimulator {
    public static void main(String[] args) {

		//create a Scanner object
        Scanner input = new Scanner(System.in);
        int balance = 0;

		//display a multiple operator
        System.out.println("Choose your service provider:");
        System.out.println("Airtel    Jio    Idea");
        System.out.println("----------------------------------");
	
		//taking input as operator
        String serviceProvider = input.next().toLowerCase();

        while (true) {

			// use advance switch
            switch (serviceProvider) {

                case "airtel" -> {
                    System.out.println("\nAvailable Airtel plans: 100 | 250 | 500");
                    System.out.print("Enter recharge amount: ");
                    int plan = input.nextInt();

                    if (plan == 100 || plan == 250 || plan == 500) {
                        balance += plan;
                        System.out.println("Airtel recharge successful");
                    } else {
                        System.out.println("Invalid Airtel plan");
                    }
                }

                case "jio" -> {
                    System.out.println("\nAvailable Jio plans: 150 | 350 | 400");
                    System.out.print("Enter recharge amount: ");
                    int plan = input.nextInt();

                    if (plan == 150 || plan == 350 || plan == 400) {
                        balance += plan;
                        System.out.println("Jio recharge successful");
                    } else {
                        System.out.println("Invalid Jio plan");
                    }
                }

                case "idea" -> {
                    System.out.println("\nAvailable Idea plans: 200 | 300 | 400");
                    System.out.print("Enter recharge amount: ");
                    int plan = input.nextInt();

                    if (plan == 200 || plan == 300 || plan == 400) {
                        balance += plan;
                        System.out.println("Idea recharge successful");
                    } else {
                        System.out.println("Invalid Idea plan");
                    }
                }

                default -> {
                    System.out.println("Invalid service provider");
                    return;
                }
            }

            System.out.println("Current balance: " + balance);

            System.out.print("Do you want to exit? (yes/no): ");
            String exitChoice = input.next().toLowerCase();
			
			//Checking a exit condition
            if (exitChoice.equals("yes")) {
                break;
            }
        }

        System.out.println("\nFinal balance: " + balance);
		System.out.println("Thank you for using Reacharge simulator");
		
    }
}