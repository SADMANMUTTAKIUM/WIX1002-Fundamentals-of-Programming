package com.mycompany.t01q02;
import java.util.Random; // Import the Random class to generate random numbers

public class T01Q02 {
    public static void main (String[] args){     
    // Create a Random object to generate random numbers
    Random input = new Random();
    
    //Generate a random number between 1 and 100
    // int number = (int) ((Math.randoom() * (100 + 1 - 1));
    int number = input.nextInt(100) + 1;
    
    if ( number < 50) {
        System.out.println("The number " + number + " is less than 50");
    }
    else {
        System.out.println("The number " + number + " is greater than 50");
    }
  }
}