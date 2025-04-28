package com.mycompany.l05q02;
public class L05Q02 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10]; 
        int count = 0; 
        
        System.out.print("Generated non-duplicate random numbers: ");
        
        while (count < numbers.length) {
            int generateNumber = (int) (Math.random() * 21); 
            
            boolean isDuplicate = false;
            
            // Check if the number is already in the array
            int i;
            for (i = 0; i < count; i++) {
                if (numbers[i] == generateNumber) {
                    isDuplicate = true;
                    break; // Duplicate found, exit the loop
                }
            }
            
            // If no duplicate was found, add the number to the array
            if (!isDuplicate) {
                numbers[count] = generateNumber;
                count++; // Move to the next index
            }
        }
        
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
