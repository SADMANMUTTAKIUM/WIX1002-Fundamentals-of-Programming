package com.mycompany.l03q06;
import java.util.Scanner;

public class L03Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter the x-coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the point: ");
        double y = input.nextDouble();

        double distanceSquared = Math.pow(x, 2) + Math.pow(y, 2);
        double radiusSquared = Math.pow(radius, 2);

        if (distanceSquared < radiusSquared) {
            System.out.println("The point lies within the circle.");
        } else if (distanceSquared > radiusSquared) {
            System.out.println("The point lies outside the circle.");
        } else {
            System.out.println("The point lies on the circumference of the circle.");
        }
    }
}

/*
import java.util.Scanner;

public class L03Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Ask for the coordinates of the point
        System.out.print("Enter the x-coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the point: ");
        double y = input.nextDouble();

        // Calculate the distance from the point to the origin
        double distance = Math.sqrt(x * x + y * y);

        // Determine whether the point is inside, on, or outside the circle
        if (distance < radius) {
            System.out.println("The point is inside the circle.");
        } else if (distance == radius) {
            System.out.println("The point is on the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }
    }
}
*/