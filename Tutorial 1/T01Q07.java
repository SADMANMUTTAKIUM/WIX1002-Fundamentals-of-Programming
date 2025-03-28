package com.mycompany.t01q07;

import java.util.Random;

public class T01Q07 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        
        int oddCount = 0;  // Initialize counter for odd numbers
        int evenCount = 0;  // Initialize counter for even numbers
        
        System.out.println("Generated Numbers: ");
        
        // Generate 10 random numbers between 10 and 100
        for (int i = 0; i < 10; i++) {
            // int randomNumber = (int) ((Math.random()* (100 - 10 + 1));
            int randomNumber = rand.nextInt(91) + 10;  // Generate a random number between 10 and 100
            System.out.print(randomNumber + " ");  // Print generated numbers

            // Check if the number is even or odd
            if (randomNumber % 2 == 0) {  // If the number is divisible by 2, it’s even
                evenCount++; // evenCount = evenCount + 1;
            } else {  // Otherwise, it’s Odd
                oddCount++; // oddCount = oddCount + 1;
            }
        }
        // Print the count of even and odd numbers
        System.out.println("\nTotal Number of even numbers: " + evenCount);
        System.out.println("Total Number of odd numbers: " + oddCount);
    }
}
