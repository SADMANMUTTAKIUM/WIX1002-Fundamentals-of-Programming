package com.mycompany.l05q05;
// import java.util.Arrays;
import java.util.Scanner;

public class L05Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[20];
        
        // Input
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 101);
        }
        
        // Output : Random Number List
        System.out.println("A list of random integer within 0 to 100: ");
        for (int elements : numbers){
            System.out.print(elements + " ");
        }
        
    /*  // Sort in Ascending order
        Arrays.sort(numbers); 
    */
     
    /*
        // Output: Bubble Sort logic for ascending order
        for (int pass = 0; pass < numbers.length - 1; pass++){
            for (int i = 0; i < (numbers.length - 1) - pass; i++){
                if (numbers[i] > numbers[i + 1]){
                    // Swap
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        // Output: Random Number list in Ascending Order
        System.out.println("\nThe list in ascendending order: ");
        for (int elements : numbers){
            System.out.print(elements + " ");  
        }
        
        System.out.print("\nEnter a number to search: ");
        int N = input.nextInt();
        
        System.out.println("Binary Search: ");
        int foundItemIndex = Arrays.binarySearch(numbers, N);
        
        System.out.println(N + " is found in position  " + foundItemIndex);
    */    
        
        // Bubble Sort logic for descending order
        for (int pass = 0; pass < numbers.length - 1; pass++){
            for (int i = 0; i < (numbers.length - 1) - pass; i++){
                if (numbers[i] < numbers[i + 1]){
                    // Swap
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }  
            }
        }
        
        // Output: Random Number list in Descending Order
        System.out.println("\nThe list in descendending order: ");
        for (int elements : numbers){
            System.out.print(elements + " ");
        }
        
        System.out.print("\nEnter a number to search: ");
        int N = input.nextInt();
        
        // Linear Search
        boolean isFound = false;
        int linearLoopCount = 0;
        
        System.out.println("Linear Search: ");
        for (int i = 0; i < numbers.length; i++){
            linearLoopCount++; // Counting the loops
            if (numbers[i] == N){
                isFound = true;
                System.out.println(N + " is found at index " + i + ".");
                System.out.println("Linear Search took " + linearLoopCount + " loops.");
                break;   
            }
        }
        if (!isFound){
            System.out.println(N + " is not found.");
            System.out.println("Linear Search took " + linearLoopCount + " loops.");
        }
        
        // Binary Search
        int left = 0, right = numbers.length - 1;
        boolean binaryFound = false;
        int binaryLoopCount = 0;

        System.out.println("Binary Search: ");
        while (left <= right) {
            binaryLoopCount++; // Counting the loops
            int mid = (left + right) / 2;
            if (numbers[mid] == N) {
                System.out.println(N + " is found at index " + mid + ".");
                System.out.println("Binary Search took " + binaryLoopCount + " loops.");
                binaryFound = true;
                break;
            } else if (numbers[mid] < N) {
                right = mid - 1; // Move left (because it's descending order)
            } else {
                left = mid + 1;  // Move right
            }
        }

        if (!binaryFound) {
            System.out.println(N + " is not found.");
            System.out.println("Binary Search took " + binaryLoopCount + " loops.");
        }
    }
}