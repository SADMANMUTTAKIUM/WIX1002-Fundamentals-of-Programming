package com.mycompany.l07q03;

import java.io.*;
import java.util.Scanner;

public class L07Q03 {
    public static void main(String[] args) {
        try {
            PrintWriter out;
            try (Scanner in = new Scanner(new FileInputStream("input.txt"))) {
                out = new PrintWriter("reverse.txt");
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    String reversed = new StringBuilder(line).reverse().toString();
                    out.println(reversed);
                }
            }
            out.close();
            System.out.println("Reversed lines saved to reverse.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}