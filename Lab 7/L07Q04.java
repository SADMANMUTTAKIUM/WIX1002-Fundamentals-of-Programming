package com.mycompany.l07q04;

import java.io.*;
import java.util.Scanner;

public class L07Q04 {
    public static void main(String[] args) {
        try {
            int characters;
            int words;
            int lines;
            try (Scanner in = new Scanner(new FileInputStream("input.txt"))) {
                characters = 0;
                words = 0;
                lines = 0;
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    lines++;
                    characters += line.length();
                    
                    // Count words (split by spaces)
                    if (!line.trim().isEmpty()) {
                        String[] wordArray = line.trim().split("\\s+");
                        words += wordArray.length;
                    }
                }
            }
            
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
