package com.mycompany.t03q02;
public class T03Q02 {
    public static void main(String[] args) {
        
        int num1 = 10, num2 = 10; // Example values
        int x = 5, y = -1, z = 3; // Example values
        String s1 = "Hello", s2 = "Hello"; // Example values

        // a. Corrected
        if (num1 == num2)
            System.out.println("Number 1 is equal to number 2.");

        // b. Corrected
        if (x > y && x > z)
            System.out.println("x is the largest number");

        // c. Corrected
        if (s1.equals(s2))
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings.");

        // d. Corrected
        if (x > 0 || y > 0)
            System.out.println("Either x or y is positive");
    }
}