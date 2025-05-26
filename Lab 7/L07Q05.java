package com.mycompany.l07q05;

import java.io.*;
import java.util.*;

class Person {
    String name;
    int age;
    char gender;
    
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class L07Q05 {
    public static void main(String[] args) {
        try {
            ArrayList<Person> people;
            try (DataInputStream in = new DataInputStream(new FileInputStream("person.dat"))) {
                int totalRecords = in.readInt();
                people = new ArrayList<>();
                for (int i = 0; i < totalRecords; i++) {
                    String name = in.readUTF();
                    int age = in.readInt();
                    char gender = in.readChar();
                    people.add(new Person(name, age, gender));
                }
            }
            
            // Sort by name
            Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
            
            // Display
            System.out.println("Name\t\tAge\tGender");
            System.out.println("----------------------------");
            for (Person p : people) {
                String genderText = (p.gender == 'M') ? "Male" : "Female";
                System.out.printf("%-15s %d\t%s%n", p.name, p.age, genderText);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}