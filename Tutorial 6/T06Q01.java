package com.mycompany.t06q01;
import java.util.Random;

public class T06Q01 {

    // a. Define a static method that returns the maximum number from 3 integer parameters.
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // b. Define a static method that determines whether the given integer is a square number.
    public static boolean isSquareNumber(int number) {
        double sqrt = Math.sqrt(number);
        return (sqrt == (int) sqrt);
    }

    // c. Define a static method that computes the combination function C(n, k).
    public static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Helper method for factorial
    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // d. Define a static method that determines whether the parameter is a pentagonal number.
    public static boolean isPentagonalNumber(int number) {
        double n = (1 + Math.sqrt(1 + 24 * number)) / 6;
        return (n == (int) n);
    }

    // e. Define a static method that displays the number of letters and the number of digits of a String parameter.
    public static void countLettersAndDigits(String str) {
        int letterCount = 0, digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letterCount++;
            } else if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("Letters: " + letterCount + ", Digits: " + digitCount);
    }

    // f. Define a static void method that generates 10 random numbers within 0 to 100 and stores them.
    public static void generateRandomNumbers(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(101); // Generates numbers between 0 and 100
        }
    }

    // g. Define a static void method that returns the area and the circumference of a circle given the radius.
    public static void calculateCircle(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area + ", Circumference: " + circumference);
    }

    // h. Define a static method that generates a random number within 0 - 10, and returns the first random number that is generated twice.
    public static int findFirstRepeatedRandom() {
        Random random = new Random();
        boolean[] seen = new boolean[11]; // Array to track numbers generated
        while (true) {
            int num = random.nextInt(11); // Generate number between 0 and 10
            if (seen[num]) {
                return num; // Return if the number has already been generated
            }
            seen[num] = true;
        }
    }
}