package com.mycompany.t02q05;
import java.util.Scanner;
public class T02Q05 {
    public static void main(String[] args) {
        // a. Correct the error in the final variable and its modification
        final double AMOUNT = 32.5;
        // AMOUNT += 10; // This is invalid because AMOUNT is final (constant)
        System.out.println("The amount is " + AMOUNT);

        // b. Correct the string initialization
        String chapter = "Summary"; // Use double quotes for Strings
        System.out.println(chapter);

        // c. Correct the pre/post-increment usage
        int num = 0; // Initialize the variable before incrementing
        ++num; // Pre-increment
        num++; // Post-increment (used correctly now)
        int num1 = num; // Assign num to num1
        System.out.println("num: " + num);
        System.out.println("num1: " + num1);

        // d. Correct the printf format
        int Num = 3000; 
        System.out.printf("%4.2f\n", (double) Num); // Cast to double for decimal formatting

        // e. Correct the Scanner object usage
        Scanner keyboard = new Scanner(System.in); // Scanner should read from System.in
        System.out.print("Enter your contact: ");
        String contact = keyboard.nextLine();
        System.out.println("Contact: " + contact);
    }
}