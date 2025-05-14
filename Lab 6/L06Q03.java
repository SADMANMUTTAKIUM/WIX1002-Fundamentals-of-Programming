package com.mycompany.l06q03;
import java.util.Scanner;

public class L06Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArray = new int[10];
        int[] reversedArray = new int[10]; 

        // Input
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }

        // Reverse numbers and store them in reversedArray
        reverseNumbers(numbersArray, reversedArray);

        // Output original array
        System.out.println("Original array:");
        printArray(numbersArray);

        // Output reversed numbers
        System.out.println("Reversed numbers in array:");
        printArray(reversedArray);
    }

    public static void reverseNumbers(int[] numbers, int[] reversed) {
        for (int i = 0; i < numbers.length; i++) {
            int reversedNumber = 0;
            int number = numbers[i];

            // Reverse the number
            while (number > 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }

            reversed[i] = reversedNumber; // Store in new array
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}