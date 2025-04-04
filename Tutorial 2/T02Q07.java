package com.mycompany.t02q07;
import java.util.Scanner;

public class T02Q07 {
    public static void main(String[] args) {
        // Conversion constants
        final double INCH_TO_CM = 2.54; // 1 inch = 2.54 cm
        final double CM_TO_METER = 100.0; // 100 cm = 1 meter

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for input in inches
        System.out.print("Enter the length in inches: ");
        double inches = input.nextDouble();

        // Convert inches to centimeters and then to meters
        double centimeters = inches * INCH_TO_CM;
        double meters = centimeters / CM_TO_METER;

        // Print the result in two decimal places
        System.out.printf("%.2f inches = %.2f meters%n", inches, meters);
    }
}