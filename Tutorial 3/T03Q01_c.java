package com.mycompany.t03q01_c;
import java.util.Scanner;

public class T03Q01_c {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        
        boolean isCapital = Character.isUpperCase(ch);
        
        System.out.print("Is the character a capital letter? " + isCapital);
    }
}