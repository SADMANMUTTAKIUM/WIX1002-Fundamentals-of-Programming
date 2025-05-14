package com.mycompany.l06q06;
public class L06Q06 {
    public static void main(String[] args) {
        
        int countPal = 0;
        int number = 2; // Start from the smallest prime number
        
        System.out.println("First 20 palindromic prime numbers:");
        while (countPal < 20) { 
            if (isPalindromic(number) && isPrime(number)) {  
                System.out.print(number + " ");
                countPal++;
            }
            number++;
        }

        int countEmirp = 0;
        number = 2; // Reset number for emirp calculation
        
        System.out.println("\n\nFirst 20 emirp numbers:");
        while (countEmirp < 20) { 
            if (isEmirp(number)) {  
                System.out.print(number + " ");
                countEmirp++;
            }
            number++;
        }      
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {  
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindromic(int original) {
        int reversed = reverseNumber(original);
        return original == reversed; // Check if the original and reversed are equal
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int factor = 2; factor * factor <= number; factor++) { // Optimized prime check
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmirp(int original) {
        if (!isPrime(original)) {
            return false; // If the original number is not prime, then it's not Emirp 
        }
        int reversed = reverseNumber(original);
        if (reversed == original) {
            return false; // If original number == reversed number, then it's not Emirp
        }
        return isPrime(reversed); // Check if reversed number is also prime
    }
}
