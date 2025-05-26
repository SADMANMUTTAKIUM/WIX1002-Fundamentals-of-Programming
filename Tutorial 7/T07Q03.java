package com.mycompany.t07q03;

import java.io.*;
import java.util.Scanner;

public class T07Q03 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        
        // Write binary representation to file
        try {
            try (PrintWriter out = new PrintWriter("data.txt")) {
                for (int i = 0; i < sentence.length(); i++) {
                    char c = sentence.charAt(i);
                    String binary = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
                    out.println(c + " = " + binary);
                }
            }
            System.out.println("Binary data written to data.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        
        // Read and display
        try {
            try (Scanner in = new Scanner(new FileInputStream("data.txt"))) {
                System.out.println("Reading from file:");
                while (in.hasNextLine()) {
                    System.out.println(in.nextLine());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}