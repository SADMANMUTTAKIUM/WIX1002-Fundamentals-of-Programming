package com.mycompany.l04q05;
import java.util.Scanner;

public class L04Q05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to two players Dice Game!");
        System.out.println("Game condtion: ");
        System.out.println("1. The first players that reach more than 100 points win the game.");
        System.out.println("2. If the player rolls a 6, has the chance to roll again.");
        
        int player1Point = 0, player2Point = 0;
        int turn = 1; // Start with Player 1 
        
        while (player1Point <= 100 && player2Point <= 100){
            System.out.println("\nPlayer " + turn + "'s turn: Press Enter to roll the dice");
            input.nextLine(); // Wait for the player to press Enter (Empty Line) before rolling the dice
            int roll = (int) (1 + Math.random() * (6 - 1 + 1));
            System.out.println("Player " + turn + " rolled: " + roll);
            
            switch (turn){
            case 1:
                player1Point += roll;
                System.out.println("Player 1's total point: " + player1Point);
                if (roll == 6){
                    System.out.println("Player 1 rolled a 6! Roll again.");   
                } else {
                    turn = 2;
                }
                break;
            case 2: 
                player2Point += roll;
                System.out.println("Player 2's total point: " + player2Point);
                if (roll == 6){
                    System.out.println("Player 2 rolled a 6! Roll again.");   
                } else {
                    turn = 1;
                }
                break; 
            }
        }
        
        if (player1Point >= 100){
            System.out.println("\nCongratulations, Player 1 wins with " + player1Point + " points!");
        } else if (player2Point >= 100){
            System.out.println("\nCongratulations, Player 2 wins with " + player2Point + " points!");
        }
    }
}
