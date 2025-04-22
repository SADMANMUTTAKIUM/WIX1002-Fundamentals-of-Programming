package com.mycompany.l04q06;
public class L04Q06 {
    public static void main(String[] args){
        
        int number = (int)(1 + Math.random() * (10000000 + 1 - 1));
        System.out.println("The generated random number is " + number);
        
        int digitCount = 0;
        
        if (number == 0){
            digitCount = 1;
        } else {
            while (number > 0){
                number /= 10; // Remove the last digit
                digitCount++;
            }
        }
        System.out.println("The number of digit in the integer is " + digitCount);
    }  
}