package com.mycompany.l04q08;
public class L04Q08 {
    public static void main(String[] args){
        
        int n = (int)(Math.random() * (101));
        System.out.println("The generated random number is " + n);
        
        int count = 0;
        int number = 2;
        
        System.out.print("The first " + n + " prime number are: ");
        while (count < n){
            boolean isPrime = true; // Initialize all numbers till n are Prime
            
            for (int divisor = 2; divisor <= number/2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + " ");
                count++; 
            }
            number++;
        }
    }
}    