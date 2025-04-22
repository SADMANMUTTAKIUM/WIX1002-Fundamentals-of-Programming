package com.mycompany.t04q01_d;
import java.util.Scanner;

public class T04Q01_d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}