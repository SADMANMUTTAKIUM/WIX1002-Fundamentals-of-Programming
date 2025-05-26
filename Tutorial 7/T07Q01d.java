package com.mycompany.t07q01d;

import java.io.*;

public class T07Q01d {
    public static void main(String[] args) {
        try {
            int sum;
            int count;
            try (DataInputStream in = new DataInputStream(new FileInputStream("integer.dat"))) {
                sum = 0;
                count = 0;
                System.out.println("All integers from binary file:");
                try {
                    while (true) {
                        int num = in.readInt();
                        System.out.println(num);
                        sum += num;
                        count++;
                    }
                } catch (EOFException e) {
                    // End of file reached
                }
            }
            
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average: " + average);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}