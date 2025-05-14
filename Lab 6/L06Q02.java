package com.mycompany.l06q02;
public class L06Q02 {

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        System.out.println("Triangle:");
        printTriangle(5, '*');

        System.out.println("\nDiamond:");
        printDiamond(5, '*');
    }

    public static void printTriangle(int height, char c) {
        for (int i = 1; i <= height; i++) {
            multiPrint(i, c);
            System.out.println();
        }
    }

    public static void printDiamond(int height, char c) {
        // Upper part
        for (int i = 1; i <= height; i++) {
            multiPrint(height - i, ' '); // Print leading spaces
            multiPrint(2 * i - 1, c); // Print stars
            System.out.println(); // Move to next line
        }
        // Lower part (inverted)
        for (int i = height - 1; i >= 1; i--) {
            multiPrint(height - i, ' '); // Print leading spaces
            multiPrint(2 * i - 1, c); // Print stars
            System.out.println(); // Move to next line
        }
    }
}