package com.mycompany.t07q01c;

import java.io.*;
import java.util.Random;

public class T07Q01c {
    public static void main(String[] args) {
        try {
            try (DataOutputStream out = new DataOutputStream(new FileOutputStream("integer.dat"))) {
                Random rand = new Random();
                
                for (int i = 0; i < 10; i++) {
                    int randomNum = rand.nextInt(1001); // 0 to 1000
                    out.writeInt(randomNum);
                }
            }
            System.out.println("Random integers saved to integer.dat");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}