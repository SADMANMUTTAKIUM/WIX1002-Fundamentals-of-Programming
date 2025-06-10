package com.mycompany.l01q02;
import java.util.*;
import java.io.*;

// Base class PersonProfile
class PersonProfile {
    protected String name;
    protected String gender;
    protected String dateOfBirth;
    
    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public void display() {
        System.out.println("=== Personal Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Student class - inherits from PersonProfile
class Student extends PersonProfile {
    private ArrayList<String> courseNames;
    private ArrayList<String> courseCodes;
    private ArrayList<String> semesters;
    private ArrayList<String> sessions;
    private ArrayList<Integer> marks;
    private String fileName;
    
    // Constructor
    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        courseNames = new ArrayList<>();
        courseCodes = new ArrayList<>();
        semesters = new ArrayList<>();
        sessions = new ArrayList<>();
        marks = new ArrayList<>();
        readFromFile(fileName);
    }
    
    // Method to read course data from file
    private void readFromFile(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data.length >= 5) {
                    courseNames.add(data[0].trim());
                    courseCodes.add(data[1].trim());
                    semesters.add(data[2].trim());
                    sessions.add(data[3].trim());
                    marks.add(Integer.parseInt(data[4].trim()));
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.out.println("Please make sure course.txt exists in your project folder.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    // Method to get grade based on marks
    public String getGrade(int mark) {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }
    
    // Method to calculate GPA
    public double calculateGPA() {
        if (marks.isEmpty()) return 0.0;
        
        double totalPoints = 0;
        for (int mark : marks) {
            totalPoints += getGradePoints(mark);
        }
        return totalPoints / marks.size();
    }
    
    // Helper method to convert marks to grade points
    private double getGradePoints(int mark) {
        if (mark >= 85) return 4.0;
        else if (mark >= 75) return 3.7;
        else if (mark >= 70) return 3.3;
        else if (mark >= 65) return 3.0;
        else if (mark >= 60) return 2.7;
        else if (mark >= 55) return 2.3;
        else if (mark >= 50) return 2.0;
        else if (mark >= 45) return 1.7;
        else if (mark >= 35) return 1.0;
        else return 0.0;
    }
    
    // Method to get total courses
    public int getTotalCourses() {
        return courseNames.size();
    }
    
    // Method to get highest mark
    public int getHighestMark() {
        if (marks.isEmpty()) return 0;
        return Collections.max(marks);
    }
    
    // Method to get lowest mark
    public int getLowestMark() {
        if (marks.isEmpty()) return 0;
        return Collections.min(marks);
    }
    
    // Override display method
    @Override
    public void display() {
        super.display();
        
        if (courseNames.isEmpty()) {
            System.out.println("\nNo course data found. Please check if course.txt exists.");
            return;
        }
        
        System.out.println("\n=== Academic Performance ===");
        System.out.println("Total Courses: " + getTotalCourses());
        System.out.println("Highest Mark: " + getHighestMark());
        System.out.println("Lowest Mark: " + getLowestMark());
        System.out.printf("GPA: %.2f\n", calculateGPA());
        
        System.out.println("\n=== Course Details ===");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.println("Course " + (i + 1) + ":");
            System.out.println("  Name: " + courseNames.get(i));
            System.out.println("  Code: " + courseCodes.get(i));
            System.out.println("  Semester: " + semesters.get(i));
            System.out.println("  Session: " + sessions.get(i));
            System.out.println("  Mark: " + marks.get(i));
            System.out.println("  Grade: " + getGrade(marks.get(i)));
            System.out.println("  ---");
        }
    }
}

// Tester class for Lab 2
class Lab2StudentTester {
    public static void main(String[] args) {
        System.out.println("LAB 2: STUDENT CLASS INHERITANCE TEST");
        System.out.println("=====================================");
        
        // Create sample course.txt file if it doesn't exist
        createSampleCourseFile();
        
        // Create Student object
        Student student1 = new Student("John Doe", "Male", "15/03/2000", "course.txt");
        
        // Display student information
        student1.display();
        
        System.out.println("\n=== Testing Individual Methods ===");
        System.out.println("Testing getGrade method:");
        System.out.println("Mark 95 -> Grade: " + student1.getGrade(95));
        System.out.println("Mark 78 -> Grade: " + student1.getGrade(78));
        System.out.println("Mark 65 -> Grade: " + student1.getGrade(65));
        System.out.println("Mark 45 -> Grade: " + student1.getGrade(45));
        System.out.println("Mark 30 -> Grade: " + student1.getGrade(30));
        
        // Create another student
        System.out.println("\n" + "=".repeat(50));
        Student student2 = new Student("Jane Smith", "Female", "22/08/1999", "course.txt");
        student2.display();
    }
    
    // Method to create sample course.txt file
    private static void createSampleCourseFile() {
        try {
            File file = new File("course.txt");
            if (!file.exists()) {
                PrintWriter writer = new PrintWriter(file);
                writer.println("Mathematics I, MTH101, Semester 1, 2023/2024, 85");
                writer.println("Physics I, PHY101, Semester 1, 2023/2024, 78");
                writer.println("Chemistry I, CHE101, Semester 1, 2023/2024, 92");
                writer.println("Programming I, CSC101, Semester 1, 2023/2024, 88");
                writer.println("English, ENG101, Semester 1, 2023/2024, 76");
                writer.println("Calculus, MTH201, Semester 2, 2023/2024, 82");
                writer.close();
                System.out.println("Sample course.txt file created successfully!");
                System.out.println("File contents:");
                System.out.println("Mathematics I, MTH101, Semester 1, 2023/2024, 85");
                System.out.println("Physics I, PHY101, Semester 1, 2023/2024, 78");
                System.out.println("Chemistry I, CHE101, Semester 1, 2023/2024, 92");
                System.out.println("Programming I, CSC101, Semester 1, 2023/2024, 88");
                System.out.println("English, ENG101, Semester 1, 2023/2024, 76");
                System.out.println("Calculus, MTH201, Semester 2, 2023/2024, 82");
                System.out.println("" + "=".repeat(50));
            }
        } catch (Exception e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }
}