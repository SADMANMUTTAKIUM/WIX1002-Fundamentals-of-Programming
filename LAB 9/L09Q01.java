package com.mycompany.l01q01;
import java.util.*;
import java.text.DecimalFormat;
// Base class Shape
class Shape {
    protected String name;
    protected double perimeter;
    protected double area;
    private final DecimalFormat df = new DecimalFormat("#.##");
    
    // Constructor
    public Shape(String name) {
        this.name = name;
    }
    
    // Accessor methods
    public double getPerimeter() { return perimeter; }
    public double getArea() { return area; }
    
    // Mutator methods
    public void setPerimeter(double perimeter) { this.perimeter = perimeter; }
    public void setArea(double area) { this.area = area; }
    
    // Display method
    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Perimeter: " + df.format(perimeter));
        System.out.println("Area: " + df.format(area));
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle() {
        super("Rectangle");
    }
    
    public void inputSides() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
    
    public void computePerimeterArea() {
        perimeter = 2 * (length + width);
        area = length * width;
    }
}

// Square class
class Square extends Shape {
    private double side;
    
    public Square() {
        super("Square");
    }
    
    public void inputSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        side = sc.nextDouble();
    }
    
    public void computePerimeterArea() {
        perimeter = 4 * side;
        area = side * side;
    }
}

// Circle class
class Circle extends Shape {
    private double diameter;
    private double radius;
    
    public Circle() {
        super("Circle");
    }
    
    public void inputDiameter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        diameter = sc.nextDouble();
        radius = diameter / 2;
    }
    
    public void computePerimeterArea() {
        perimeter = Math.PI * diameter;
        area = Math.PI * radius * radius;
    }
}