package com.mycompany.t01q06;

import java.util.Random;

public class T01Q06 {
    public static void main(String[] args){
    
    Random input =  new Random();
    
    System.out.println("Generated numbers: ");
    
    int min = 1000;
    int max = 0;
     
    for (int i = 0; i < 10; i++){
     // Generate 10 random number between 0 and 999
     int randomNumber = input.nextInt(1000); 
     System.out.print(randomNumber + " ");
     
     if (randomNumber < min){
         min = randomNumber;
     }
     if (randomNumber > max){
         max = randomNumber;
     }
    }
    System.out.print("\nMinimum number: " + min);
    System.out.print("\nMaximum number: " + max);
  }
}   
