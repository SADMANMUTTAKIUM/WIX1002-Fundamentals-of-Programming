package com.mycompany.l02q05;
public class L02Q05 {
    public static void main(String[] args){
        
        int number = (int) (Math.random() * (10000+1));
        System.out.println("The generated random number is = " + number);
        
        int sum = 0;
        
        while (number != 0){
            sum += number  % 10;
            number /= 10;
        }
        System.out.println("Sum of all the digits in the number is =  " + sum);
    }
}