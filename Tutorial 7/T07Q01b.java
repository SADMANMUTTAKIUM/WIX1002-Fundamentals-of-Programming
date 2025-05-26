package com.mycompany.t07q01b;
import java.io.*;
import java.util.Scanner;

public class T07Q01b {
    public static void main(String[] args) {
        try {
            int largest;
            try (Scanner in = new Scanner(new FileInputStream("integer.txt"))) {
                largest = Integer.MIN_VALUE;
                System.out.println("All integers from file:");
                while (in.hasNextInt()) {
                    int num = in.nextInt();
                    System.out.println(num);
                    if (num > largest) {
                        largest = num;
                    }
                }
            }
            System.out.println("Largest integer: " + largest);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}