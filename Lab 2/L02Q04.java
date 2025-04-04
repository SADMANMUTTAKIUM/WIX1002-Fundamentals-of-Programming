package com.mycompany.l02q04;
import java.util.Scanner;

public class L02Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();
        
        int hours = totalSeconds / (60 * 60);
        int minutes = (totalSeconds % (60 * 60)) / 60;
        int seconds = (totalSeconds % (60 * 60)) % 60;
        
        System.out.println(totalSeconds + " seconds is " + hours + " hours , " + minutes + " minutes and " + seconds + " seconds");  
    }
}
