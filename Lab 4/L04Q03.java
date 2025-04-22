package com.mycompany.l04q03;
import java.util.Scanner;

public class L04Q03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int score; // X
        int max = Integer.MIN_VALUE; // Initialize to smallest possible value
        int min = Integer.MAX_VALUE; // Initialize to largest possible value
        // int max = 0;
        // int min = 100;
        int sum = 0; // ∑X
        int count = 0; // N
        double sumSqrt = 0; // ∑X^2
        
        // while(score >= 0)
        while(true){
            
            System.out.print("Enter a score [negative score to quit]: ");
            score = input.nextInt(); // X
            
            if (score < 0){
                break; // Exit the loop for negative score
            }
            
            count++; 
            
            if (score > max){
                max = score; // Update maximum score
            }
            if (score < min){
                min = score; // Update minimum score
            }
            
            sum += score; // ∑X
            sumSqrt += Math.pow(score, 2); // ∑X^2
        }
        
        if (count > 0){
            double average = (double) sum / count;
            double standardDeviation = Math.sqrt((sumSqrt - Math.pow(sum, 2) / count) / (count - 1));
            
            System.out.println("Maximum score: " + max);
            System.out.println("Minimum score: " + min);
            System.out.printf("Average score: %.2f\n" , average);
            System.out.printf("Satandard Deviaton: %.2f\n", standardDeviation);
        } else {
            System.out.println("No scores were entered.");
        } 
    }
}