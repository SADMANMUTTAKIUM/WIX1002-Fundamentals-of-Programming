package com.mycompany.t06q02;
public class T06Q02 {

    // Method to display three numbers in decreasing order
    public static void displayDecreasingOrder(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.print(a + " ");
            if (b >= c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(c + " " + b);
            }
        } else if (b >= a && b >= c) {
            System.out.print(b + " ");
            if (a >= c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            if (a >= b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }

    // Main method to test displayDecreasingOrder
    public static void main(String[] args) {
        System.out.print("Decreasing order of (12, 5, 9): ");
        displayDecreasingOrder(12, 5, 9);

        System.out.print("Decreasing order of (3, 7, 1): ");
        displayDecreasingOrder(3, 7, 1);

        System.out.print("Decreasing order of (8, 8, 8): ");
        displayDecreasingOrder(8, 8, 8);
    }
}
