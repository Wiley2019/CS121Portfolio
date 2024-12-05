package labSix;

import java.util.Scanner;

public class Rectangle {
    // Static Scanner object
    static Scanner scnr = new Scanner(System.in);

    // Method to get the length of the rectangle
    public static double getLength() {
        System.out.print("Enter the rectangle's length: ");
        return scnr.nextDouble();
    }

    // Method to get the width of the rectangle
    public static double getWidth() {
        System.out.print("Enter the rectangle's width: ");
        return scnr.nextDouble();
    }

    // Method to calculate the area of the rectangle
    public static double getArea(double length, double width) {
        return length * width;
    }

    // Method to display the data
    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        // Get length and width from user
        double length = getLength();
        double width = getWidth();

        // Calculate area
        double area = getArea(length, width);

        // Display the results
        displayData(length, width, area);

        // Close the scanner
        scnr.close();
    }
}
