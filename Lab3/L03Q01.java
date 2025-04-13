package com.mycompany.l03q01;
import java.util.Scanner;

public class L03Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1 = ");
        double num1 = input.nextDouble();
        System.out.print("Number 2 = ");
        double num2 = input.nextDouble();
        System.out.print("Operator (+, -, *, /, or %) = ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) { // Avoid division by zero
                    result = num1 / num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) { // Avoid modulus by zero
                    result = num1 % num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}