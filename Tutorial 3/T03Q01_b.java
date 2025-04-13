package com.mycompany.t03q01_b;
import java.util.Scanner;

public class T03Q01_b {
    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 2 == 0){
            System.out.print("Even number.");
        } else {
            System.out.print("Odd number.");
        }
    }    
}
