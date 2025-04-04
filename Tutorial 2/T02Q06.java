package com.mycompany.t02q06;
import java.util.Scanner;

public class T02Q06 {
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter diameter: ");
       double diameter = input.nextDouble();
       
       double radius = diameter / 2; 
       double circumference = 2 * Math.PI * radius;
       
       System.out.printf("The circumference of the circle is: %.3f", circumference);
    }  
}
