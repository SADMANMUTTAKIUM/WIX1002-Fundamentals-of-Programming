package com.mycompany.l06q05;
import java.util.Scanner;

public class L06Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int score = 0;
        
        
        while (true){
            System.out.println("Enter the answer \"Negative number to quit\".");          
            int a = (int) (Math.random() * (13));
            int b = (int) (Math.random() * (13));

            System.out.printf("%d x %d =", a, b);
            System.out.print(" ");
            int userAnswer = input.nextInt();
            
            if (userAnswer < 0){
                break; // exit the loop
            }
            
            if (checkMultiplication(a, b, userAnswer)){
                score++; // Increase score if correct
            }
        }   System.out.print("Your score is " + score);
    }
    
    public static boolean checkMultiplication(int num1, int num2, int num3){
        
        return num3 == (num1 * num2);
    }
}