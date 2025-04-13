package com.mycompany.l03q05;
import java.util.Scanner;

public class L03Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();
        System.out.print("Enter value for d: ");
        double d = input.nextDouble();
        System.out.print("Enter value for e: ");
        double e = input.nextDouble();
        System.out.print("Enter value for f: ");
        double f = input.nextDouble();
        
        double determinant = (a * d) - (b * c);
        
        if (determinant == 0){
            System.out.println("The equation has no solution.");
        } else{
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        } 
    } 
}