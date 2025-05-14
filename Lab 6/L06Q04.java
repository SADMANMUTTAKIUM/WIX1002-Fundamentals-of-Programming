package com.mycompany.l06q04;
public class L06Q04 {
    public static void main(String[] args){
        // Test cases
        int gcd1 = gcd(24, 8);
        int gcd2 = gcd(200, 625);
        
        System.out.println("GCD of (24, 8) = " + gcd1);
        System.out.println("GCD of (200, 625) = " + gcd2);
    }
    
    // Euclidean Algorithm: gcd(a, b) = gcd (b, a mod b)
    public static int gcd(int a, int b){
        while (b != 0){
            // Swap a to b, b to (a mod b)
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}