package com.mycompany.t01q01.java;

import java.util.Scanner;

public class T01Q01 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();
    
    System.out.println("Multiplication of the given two numbers =  " + num1 * num2);
    }
}