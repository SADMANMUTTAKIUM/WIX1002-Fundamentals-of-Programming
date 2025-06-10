package com.mycompany.t09q02;
// Complete code for Organism and Animal inheritance example

// Base class Organism
class Organism {
    protected double initialSize;
    protected double growthRate;
    
    // Constructor
    public Organism(double initialSize, double growthRate) {
        this.initialSize = initialSize;
        this.growthRate = growthRate;
    }
    
    // Getter methods
    public double getInitialSize() {
        return initialSize;
    }
    
    public double getGrowthRate() {
        return growthRate;
    }
    
    // Setter methods
    public void setInitialSize(double initialSize) {
        this.initialSize = initialSize;
    }
    
    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }
    
    // Method to calculate current size after time
    public double getCurrentSize(double time) {
        return initialSize + (growthRate * time);
    }
    
    // Display method for Organism
    public void display() {
        System.out.println("=== Organism Information ===");
        System.out.println("Initial Size: " + initialSize);
        System.out.println("Growth Rate: " + growthRate);
    }
}

// Derived class Animal
class Animal extends Organism {
    private double eatingNeed;
    
    // Constructor
    public Animal(double initialSize, double growthRate, double eatingNeed) {
        super(initialSize, growthRate); // Call parent constructor
        this.eatingNeed = eatingNeed;
    }
    
    // Getter for eatingNeed
    public double getEatingNeed() {
        return eatingNeed;
    }
    
    // Setter for eatingNeed
    public void setEatingNeed(double eatingNeed) {
        this.eatingNeed = eatingNeed;
    }
    
    // Method to calculate daily food requirement
    public double getDailyFoodRequirement() {
        return eatingNeed * initialSize;
    }
    
    // Override display method to show Animal instance variables
    @Override
    public void display() {
        System.out.println("=== Animal Information ===");
        System.out.println("Initial Size: " + initialSize);
        System.out.println("Growth Rate: " + growthRate);
        System.out.println("Eating Need: " + eatingNeed);
        System.out.println("Daily Food Requirement: " + getDailyFoodRequirement());
    }
    
    // Additional method to show growth over time
    public void showGrowthOverTime(double days) {
        System.out.println("\n--- Growth Progress ---");
        double currentSize = getCurrentSize(days);
        System.out.println("After " + days + " days:");
        System.out.println("Current Size: " + currentSize);
        System.out.println("Food needed per day: " + (eatingNeed * currentSize));
    }
}

// Tester class to demonstrate the inheritance
class OrganismAnimalTester {
    public static void main(String[] args) {
        System.out.println("INHERITANCE EXAMPLE: Organism and Animal");
        System.out.println("========================================");
        
        // Create an Organism object
        System.out.println("\n1. Creating a basic Organism:");
        Organism plant = new Organism(2.5, 0.3);
        plant.display();
        System.out.println("Size after 10 days: " + plant.getCurrentSize(10));
        
        // Create an Animal object
        System.out.println("\n2. Creating an Animal (inherits from Organism):");
        Animal dog = new Animal(5.0, 1.2, 3.5);
        dog.display();
        dog.showGrowthOverTime(30);
        
        // Create another Animal
        System.out.println("\n3. Creating another Animal:");
        Animal cat = new Animal(2.0, 0.8, 2.0);
        cat.display();
        cat.showGrowthOverTime(15);
        
        // Demonstrate inheritance
        System.out.println("\n4. Demonstrating Inheritance:");
        System.out.println("Dog is an instance of Animal: " + (dog instanceof Animal));
        System.out.println("Dog is an instance of Organism: " + (dog instanceof Organism));
        System.out.println("Cat can use Organism methods: " + cat.getCurrentSize(7));
        
        // Example of polymorphism
        System.out.println("\n5. Polymorphism Example:");
        Organism[] organisms = {plant, dog, cat};
        
        for (int i = 0; i < organisms.length; i++) {
            System.out.println("\nOrganism " + (i + 1) + ":");
            organisms[i].display(); // Calls appropriate display method
        }
    }
}