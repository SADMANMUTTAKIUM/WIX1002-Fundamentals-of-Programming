package com.mycompany.t01q10;

import java.util.Random;

public class T01Q10 {
    public static void main(String[] args){
        
        Random rand = new Random();
        
        int totalStudents = 100;
        
        // Initialize counter for male and female students 
        int maleStudentsCount = 0;
        int femaleStudentsCount = 0;
        
        // Generate random genders for 100 students
        for (int i = 0; i < totalStudents; i++) {
            // Randomly assign gender: 0 for male, 1 for female
            // Generates 0 or 1
            int gender = rand.nextInt(2); 
            if (gender == 1) {
                femaleStudentsCount++;
            }
            else {
                maleStudentsCount++;
            }     
        }

        // Display the number of female students
        System.out.println("Number of female students: " + femaleStudentsCount);
        System.out.println("Number of female students: " + maleStudentsCount);
    }
}