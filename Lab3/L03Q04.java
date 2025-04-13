package com.mycompany.l03q04;
public class L03Q04 {
    public static void main(String[] args){
        
        int player1Roll1 = (int) (1+ Math.random() * (6- 1 + 1));
        System.out.println("Player-1 Roll-1: " + player1Roll1);
        int player2Roll1 = (int) (1+ Math.random() * (6- 1 + 1));
        System.out.println("Player-2 Roll-1: " + player2Roll1);
        int player1Roll2 = (int) (1+ Math.random() * (6- 1 + 1));
        System.out.println("Player-1 Roll-2: " + player1Roll2);
        int player2Roll2 = (int) (1+ Math.random() * (6- 1 + 1));
        System.out.println("Player-2 Roll-2: " + player2Roll2);
        
        int resultPlayer1 = player1Roll1 + player1Roll2;
        int resultPlayer2 = player2Roll1 + player2Roll2;
        
        if (resultPlayer1 > resultPlayer2){
            System.out.println("Player-1 wins!");
        } else{
            System.out.println("Player-2 wins!");
        }
    }
}