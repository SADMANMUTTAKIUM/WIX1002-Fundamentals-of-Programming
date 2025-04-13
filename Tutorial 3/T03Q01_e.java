package com.mycompany.t03q01_e;
import java.util.Scanner;

public class T03Q01_e {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int day = input.nextInt();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                // Handle invalid input
                System.out.println("Invalid input! Please enter a number between 0 and 6.");
        }
    }
}
