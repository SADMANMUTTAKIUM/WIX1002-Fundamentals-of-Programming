package com.mycompany.t05q06;
import java.util.Random;

public class T05Q06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Generate a random number (0-255)
        int number = rand.nextInt(256); 
        
        // Array to store 8-bit binary
        int[] binaryArray = new int[8]; 
        
        // Convert number to binary and store in array
        for (int i = 7; i >= 0; i--) { // Start from the last index (LSB)
            binaryArray[i] = number % 2; // Remainder: Get the last bit (0 or 1)
            number /= 2; // Result: Divide number by 2 to move to the next bit
        }

        // Display the binary number
        System.out.print("Binary representation: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
        System.out.println(); // Move to the next line
    }
}