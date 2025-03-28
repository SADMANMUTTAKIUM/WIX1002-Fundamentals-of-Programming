package com.mycompany.t01q11;

import java.util.Arrays;
import java.util.Collections;

public class T01Q11 {
    public static void main(String[] args){
        
        // Step 1: Generate 5 random numbers and store them in an array
        Integer[] numbers = new Integer[5];
        for (int i = 0; i < 5; i++){
            numbers[i] = (int) (Math.random() * (1000 - 0 + 1));
        }
        // Step 2: Display the original random numbers
        System.out.println("Original random numbers are: ");
        for (int num: numbers){ // for-each loop: It iterates through each element of the numbers array.
            System.out.print(num + " "); 
        }
        System.out.println();
        
        // Step 3: Sort the numbers in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        
        // Step 4: Display the sorted numbers
        System.out.println("Random numbers in descending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
