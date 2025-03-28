package com.mycompany.t01q04;

import java.util.Random;

public class T01Q04 {
    public static void main(String [] args){
        
    Random input = new Random();
    
    // int player1 = (int) ((Math.random() * (6 + 1 - 1));
    // int player2 = (int) ((Math.random() * (6 + 1 - 1));
    int player1= input.nextInt(6)+1;
    int player2 = input.nextInt(6)+1;
    
    // Print the result of Player 1's and player 2's roll
    System.out.println("Player 1 roll the dice: " + player1);
    System.out.println("Player 2 roll the dice: " + player2);
    
    // Compare the rolls of Player 1 and Player 2 to determine the winner
    if (player1 > player2){
        System.out.println("Player 1 wins the roll");
    }
    else if (player1 < player2){
        System.out.println("Player 2 wins the roll");
    }
    // player1 = player2
    else { 
        System.out.println("It's a draw!");
    }
  }
}