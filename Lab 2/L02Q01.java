package com.mycompany.l02q01;
import java.util.Scanner;

public class L02Q01 {
    public static void main(String[] args) {
        
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) / 1.8;

        // Display the result in two decimal places
        System.out.printf("The temperature in Celsius is: %.2f degree%n", celsius);
    }
}