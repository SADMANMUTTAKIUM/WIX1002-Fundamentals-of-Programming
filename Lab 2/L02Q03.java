package com.mycompany.l02q03;
public class L02Q03 {
    public static void main(String[] args){
        
        System.out.println("Generated random numbers : ");
        int sum = 0;
        double average = 0;
        
        for (int i = 1; i <= 3; i++){
            int number = (int) (10 + (Math.random() * (50 - 10 + 1)));
            System.out.print(number + " ");
            
            sum += number;
        } 
        average = sum / 3;
        System.out.println("\nSum = " + sum);
        System.out.printf("Average = %.2f", average);
    }
}
