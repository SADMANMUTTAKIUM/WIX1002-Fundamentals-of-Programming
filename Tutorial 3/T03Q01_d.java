package com.mycompany.t03q01_d;
import java.util.Scanner;

public class T03Q01_d {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sentence 1: ");
        String sentence1 = input.nextLine();
        
        System.out.print("Sentence 2: ");
        String sentence2 = input.nextLine();
        
        // Compare the strings in alphabetical order 
        // Negative value: ssentence1 comes before sentence2 alphabetically
        if (sentence1.compareToIgnoreCase(sentence2) < 0) { 
            System.out.println("Strings in alphabetical order: ");
            System.out.println(sentence1);
            System.out.println(sentence2);
        } 
         // Positive value: sentence2 comes before sentence1 alphabetically
        else if (sentence1.compareToIgnoreCase(sentence2) > 0) {
            System.out.println("Strings in alphabetical order: ");
            System.out.println(sentence2);
            System.out.println(sentence1);
        }
        // Zero value: Both strings are equal
        else {
            System.out.println("Both strings are equal.");
        } 
    }
}