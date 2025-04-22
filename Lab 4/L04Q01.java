package com.mycompany.l04q01;
import java.util.Scanner;

public class L04Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        
        System.out.print("The factors are: ");
        
        for (int i = 1; i <= integer; i++){
            if (integer % i == 0){
                System.out.print(i);
                // System.out.print(i + ", ");
                if (i != integer){
                    System.out.print(", "); // Print a comma if it's not the last factor
                }
            }
        } 
    }  
}