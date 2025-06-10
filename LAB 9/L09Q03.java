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

// Lecturer class - inherits from PersonProfile
class Lecturer extends PersonProfile {
    private ArrayList<String> courseNames;
    private ArrayList<String> courseCodes;
    private ArrayList<String> semesters;
    private ArrayList<String> sessions;
    private ArrayList<Integer> creditHours;
    private ArrayList<Integer> numStudents;
    private String fileName;
    
    // Constructor
    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        courseNames = new ArrayList<>();
        courseCodes = new ArrayList<>();
        semesters = new ArrayList<>();
        sessions = new ArrayList<>();
        creditHours = new ArrayList<>();
        numStudents = new ArrayList<>();
        readFromFile(fileName);
    }
    
    // Method to read lecturer data from file
    private void readFromFile(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data.length >= 6) {
                    courseNames.add(data[0].trim());
                    courseCodes.add(data[1].trim());
                    semesters.add(data[2].trim());
                    sessions.add(data[3].trim());
                    creditHours.add(Integer.parseInt(data[4].trim()));
                    numStudents.add(Integer.parseInt(data[5].trim()));
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.out.println("Please make sure lecturer.txt exists in your project folder.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    // Method to compute updated credit hour based on number of students
    public double computeCreditHour(int originalHour, int students) {
        if (students >= 150) {
            return originalHour * 3.0;
        } else if (students >= 100) {
            return originalHour * 2.0;
        } else if (students >= 50) {
            return originalHour * 1.5;
        } else {
            return originalHour * 1.0;
        }
    }
    
    // Method to get total teaching load (sum of all updated credit hours)
    public double getTotalTeachingLoad() {
        double total = 0;
        for (int i = 0; i < creditHours.size(); i++) {
            total += computeCreditHour(creditHours.get(i), numStudents.get(i));
        }
        return total;
    }
    
    // Method to get total number of students taught
    public int getTotalStudents() {
        int total = 0;
        for (int students : numStudents) {
            total += students;
        }
        return total;
    }
    
    // Method to get course with highest enrollment
    public String getHighestEnrollmentCourse() {
        if (numStudents.isEmpty()) return "No courses";
        
        int maxIndex = 0;
        for (int i = 1; i < numStudents.size(); i++) {
            if (numStudents.get(i) > numStudents.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return courseNames.get(maxIndex) + " (" + numStudents.get(maxIndex) + " students)";
    }
    
    // Method to get course with lowest enrollment
    public String getLowestEnrollmentCourse() {
        if (numStudents.isEmpty()) return "No courses";
        
        int minIndex = 0;
        for (int i = 1; i < numStudents.size(); i++) {
            if (numStudents.get(i) < numStudents.get(minIndex)) {
                minIndex = i;
            }
        }
        return courseNames.get(minIndex) + " (" + numStudents.get(minIndex) + " students)";
    }
    
    // Method to get workload category
    public String getWorkloadCategory() {
        double totalLoad = getTotalTeachingLoad();
        if (totalLoad >= 15) return "Heavy Load";
        else if (totalLoad >= 10) return "Moderate Load";
        else return "Light Load";
    }
    
    // Override display method
    @Override
    public void display() {
        super.display();
        
        if (courseNames.isEmpty()) {
            System.out.println("\nNo course data found. Please check if lecturer.txt exists.");
            return;
        }
        
        System.out.println("\n=== Teaching Summary ===");
        System.out.println("Total Courses: " + courseNames.size());
        System.out.println("Total Students: " + getTotalStudents());
        System.out.printf("Total Teaching Load: %.1f credit hours\n", getTotalTeachingLoad());
        System.out.println("Workload Category: " + getWorkloadCategory());
        System.out.println("Highest Enrollment: " + getHighestEnrollmentCourse());
        System.out.println("Lowest Enrollment: " + getLowestEnrollmentCourse());
        
        System.out.println("\n=== Course Profile ===");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.println("Course " + (i + 1) + ":");
            System.out.println("  Name: " + courseNames.get(i));
            System.out.println("  Code: " + courseCodes.get(i));
            System.out.println("  Semester: " + semesters.get(i));
            System.out.println("  Session: " + sessions.get(i));
            System.out.println("  Original Credit Hour: " + creditHours.get(i));
            System.out.println("  Number of Students: " + numStudents.get(i));
            System.out.printf("  Updated Credit Hour: %.1f\n", 
                computeCreditHour(creditHours.get(i), numStudents.get(i)));
            
            // Show multiplier used
            int students = numStudents.get(i);
            String multiplier;
            if (students >= 150) multiplier = "3.0x (≥150 students)";
            else if (students >= 100) multiplier = "2.0x (100-149 students)";
            else if (students >= 50) multiplier = "1.5x (50-99 students)";
            else multiplier = "1.0x (<50 students)";
            
            System.out.println("  Multiplier Applied: " + multiplier);
            System.out.println("  ---");
        }
    }
}

// Tester class for Lab 3
class Lab3LecturerTester {
    public static void main(String[] args) {
        System.out.println("LAB 3: LECTURER CLASS INHERITANCE TEST");
        System.out.println("======================================");
        
        // Create sample lecturer.txt file if it doesn't exist
        createSampleLecturerFile();
        
        // Create Lecturer object
        Lecturer lecturer1 = new Lecturer("Dr. Sarah Johnson", "Female", "10/05/1975", "lecturer.txt");
        
        // Display lecturer information
        lecturer1.display();
        
        System.out.println("\n=== Testing Credit Hour Computation ===");
        System.out.println("Testing computeCreditHour method:");
        System.out.println("3 credit hours with 200 students -> " + lecturer1.computeCreditHour(3, 200) + " (3x multiplier)");
        System.out.println("2 credit hours with 120 students -> " + lecturer1.computeCreditHour(2, 120) + " (2x multiplier)");
        System.out.println("4 credit hours with 75 students -> " + lecturer1.computeCreditHour(4, 75) + " (1.5x multiplier)");
        System.out.println("3 credit hours with 30 students -> " + lecturer1.computeCreditHour(3, 30) + " (1x multiplier)");
        
        // Create another lecturer
        System.out.println("\n" + "=".repeat(60));
        Lecturer lecturer2 = new Lecturer("Prof. Michael Chen", "Male", "25/12/1968", "lecturer.txt");
        lecturer2.display();
    }
    
    // Method to create sample lecturer.txt file
    private static void createSampleLecturerFile() {
        try {
            File file = new File("lecturer.txt");
            if (!file.exists()) {
                PrintWriter writer = new PrintWriter(file);
                writer.println("Advanced Mathematics, MTH301, Semester 2, 2023/2024, 3, 120");
                writer.println("Basic Statistics, STA101, Semester 1, 2023/2024, 2, 180");
                writer.println("Linear Algebra, MTH201, Semester 1, 2023/2024, 4, 75");
                writer.println("Calculus Tutorial, MTH102, Semester 2, 2023/2024, 1, 25");
                writer.println("Research Methods, MTH401, Semester 2, 2023/2024, 3, 45");
                writer.close();
                System.out.println("Sample lecturer.txt file created successfully!");
                System.out.println("File contents:");
                System.out.println("Advanced Mathematics, MTH301, Semester 2, 2023/2024, 3, 120");
                System.out.println("Basic Statistics, STA101, Semester 1, 2023/2024, 2, 180");
                System.out.println("Linear Algebra, MTH201, Semester 1, 2023/2024, 4, 75");
                System.out.println("Calculus Tutorial, MTH102, Semester 2, 2023/2024, 1, 25");
                System.out.println("Research Methods, MTH401, Semester 2, 2023/2024, 3, 45");
                System.out.println("" + "=".repeat(60));
            }
        } catch (Exception e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }
}