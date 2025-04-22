package com.mycompany.t04q04;
import java.util.Scanner;

public class T04Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine(); 
        
        String reversed = "";
        
        for (int i = sentence.length() - 1; i >= 0; i--){
            reversed += sentence.charAt(i);
        }
        System.out.print("Reversed number: " + reversed);    
    }
}

/*
import java.util.Scanner;

public class T04Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        
        int reversed = 0;
        
        while (digit != 0){
            reversed = reversed * 10 + number % 10;
            digit /= 10; 
        }
        System.out.print("Reversed number: " + reversed);
        
    }
}
*/
