package com.mycompany.t01q08;

import java.util.Scanner;

public class T01Q08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Please enter a sentence: ");
        // Convert the sentence to uppercase to count both 'U' and 'M' regardless of case
        String sentence = scan.nextLine().toUpperCase();
        
        // Initialize counters
        int countU = 0;
        int countM = 0;
        
        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // Check if the character is 'U' or 'M'
            if (ch == 'U') {
                countU++;
            } else if (ch == 'M') {
                countM++;
            }
        }
        // Output the results
        System.out.println("Number of 'U' in the sentence: " + countU);
        System.out.println("Number of 'M' in the sentence: " + countM);
    }
}
