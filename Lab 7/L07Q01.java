package com.mycompany.l07q01;

import java.io.*;
import java.util.Scanner;

public class L07Q01 {
    public static void main(String[] args) {
        // First, create the binary file with course data
        createCourseFile();
        
        // Then search for courses
        searchCourse();
    }
    
    public static void createCourseFile() {
        try {
            // Store course data
            try (DataOutputStream out = new DataOutputStream(new FileOutputStream("coursename.dat"))) {
                // Store course data
                out.writeUTF("WXES1116"); out.writeUTF("Programming I");
                out.writeUTF("WXES1115"); out.writeUTF("Data Structure");
                out.writeUTF("WXES1110"); out.writeUTF("Operating System");
                out.writeUTF("WXES1112"); out.writeUTF("Computing Mathematics I");
            }
            System.out.println("Course data saved to coursename.dat");
        } catch (IOException e) {
            System.out.println("Error creating course file: " + e.getMessage());
        }
    }
    
    public static void searchCourse() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String searchCode = input.nextLine();
        
        try {
            boolean found;
            try (DataInputStream in = new DataInputStream(new FileInputStream("coursename.dat"))) {
                found = false;
                try {
                    while (true) {
                        String code = in.readUTF();
                        String name = in.readUTF();
                        
                        if (code.equals(searchCode)) {
                            System.out.println("Course Name: " + name);
                            found = true;
                            break;
                        }
                    }
                } catch (EOFException e) {
                    // End of file
                }
            }
            
            if (!found) {
                System.out.println("Course code not found!");
            }
        } catch (IOException e) {
            System.out.println("Error reading course file: " + e.getMessage());
        }
    }
}