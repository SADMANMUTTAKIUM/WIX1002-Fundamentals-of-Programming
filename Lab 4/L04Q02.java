package com.mycompany.l04q02;
import java.util.Scanner;

public class L04Q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++){
            //sum += (i * (i + 1)) / 2;
            for (int j = 1; j <= i; j++){
                sum += j;
            }
        }
        System.out.println("Sum of the series = " + sum);
    }
}