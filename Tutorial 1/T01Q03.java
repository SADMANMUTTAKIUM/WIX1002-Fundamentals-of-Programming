package com.mycompany.t01q03;

import java.util.Scanner;

public class T01Q03 {

    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your obtained mark: ");
    int mark = input.nextInt();
    
    if (mark >= 40) {
    System.out.println("Congratulations! You are passed in the examination");
    }
    else {
    System.out.println("You are failed in the examination.");
    }
   }
}