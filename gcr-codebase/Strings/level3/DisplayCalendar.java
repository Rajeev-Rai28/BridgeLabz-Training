/*
Create a program to display a calendar for a given month and year.
*/

import java.util.Scanner;

public class DisplayCalendar {

    // Method to get month name
    public String getMonthName(int month) {

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to check leap year
    public boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get number of days in a month
    public int getDaysInMonth(int month, int year) {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to get first day of the month (Gregorian Calendar Algorithm)
    // Returns 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public int getFirstDay(int month, int year) {

        int d = 1;
        int m = month;
        int y = year;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display calendar
    public void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        // Print header
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First for-loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second for-loop to print days
        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        DisplayCalendar obj = new DisplayCalendar();

        // Display calendar
        obj.displayCalendar(month, year);

        sc.close();
    }
}
