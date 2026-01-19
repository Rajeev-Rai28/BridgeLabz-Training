package com.day10.GeoMeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Bonus: store multiple lines
        ArrayList<Line> lines = new ArrayList<>();

        System.out.println("Enter details for Line 1:");
        Line line1 = createLine(sc);
        lines.add(line1);

        System.out.println("\nEnter details for Line 2:");
        Line line2 = createLine(sc);
        lines.add(line2);

        System.out.println("\n--- Line Details ---");
        line1.display();
        line2.display();

        double len1 = line1.getLength();
        double len2 = line2.getLength();

        System.out.println("\n--- Comparison Result ---");
        if (len1 == len2) {
            System.out.println("Both lines are of EQUAL length.");
        } else if (len1 > len2) {
            System.out.println("Line 1 is LONGER than Line 2.");
        } else {
            System.out.println("Line 2 is LONGER than Line 1.");
        }

        // Bonus: allow user to add more lines
        System.out.print("\nDo you want to add more lines? (yes/no): ");
        String choice = sc.next();

        while (choice.equalsIgnoreCase("yes")) {
            Line newLine = createLine(sc);
            lines.add(newLine);

            System.out.print("Add more? (yes/no): ");
            choice = sc.next();
        }

        // Display all stored lines
        System.out.println("\n--- All Stored Lines ---");
        for (int i = 0; i < lines.size(); i++) {
            System.out.print("Line " + (i + 1) + ": ");
            lines.get(i).display();
        }

        sc.close();
    }

    // Helper method to create Line object
    private static Line createLine(Scanner sc) {
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        return new Line(x1, y1, x2, y2);
    }
}
