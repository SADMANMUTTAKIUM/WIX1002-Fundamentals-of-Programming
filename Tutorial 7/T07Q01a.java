package com.mycompany.t07q01a;
import java.io.*;
import java.util.Random;

public class T07Q01a {
    public static void main(String[] args) {
        try {
            try (PrintWriter out = new PrintWriter("integer.txt")) {
                Random rand = new Random();
                
                for (int i = 0; i < 10; i++) {
                    int randomNum = rand.nextInt(1001); // 0 to 1000
                    out.println(randomNum);
                }
            }
            System.out.println("Random integers saved to integer.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
