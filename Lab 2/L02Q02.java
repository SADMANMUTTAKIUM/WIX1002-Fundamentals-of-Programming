package com.mycompany.l02q02;
import java.util.Scanner;
public class L02Q02 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input: Price of the car (P)
        System.out.print("Enter the price of the car (P): ");
        double P = input.nextDouble();

        // Input: Down payment (D)
        System.out.print("Enter the down payment (D): ");
        double D = input.nextDouble();

        // Input: Interest rate in percentage (R)
        System.out.print("Enter the interest rate (R) in %: ");
        double R = input.nextDouble();

        // Input: Loan duration in years (Y)
        System.out.print("Enter the loan duration in years (Y): ");
        double Y = input.nextDouble();

        // Calculate the monthly payment (M)
        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        // Output the monthly payment rounded to two decimal places
        System.out.printf("The monthly payment (M) is: %.2f%n", M);
    }
}