package com.mycompany.t03q04;
import java.util.Scanner;

public class T03Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest.");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the biggest.");
        }
        else {
            System.out.println(num3 + " is the biggest.");
        }
    }
}