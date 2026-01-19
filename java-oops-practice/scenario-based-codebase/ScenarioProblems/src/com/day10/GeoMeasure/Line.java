package com.day10.GeoMeasure;

public class Line {

    // Encapsulated data (hidden)
    private double x1, y1, x2, y2;

    // Constructor to initialize line coordinates
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;   // using this keyword
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of line
    public double getLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to display line
    public void display() {
        System.out.println("Line [(" + x1 + "," + y1 + ") -> (" + x2 + "," + y2 + ")] Length = " + getLength());
    }
}
