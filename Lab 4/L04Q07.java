package com.mycompany.l04q07;
import java.util.Scanner;

public class L04Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest in %: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int totalMonths = input.nextInt();
         
        // double M = (P * (i / (12.0 * 100))) / (1 - Math.pow(1 + (i / (12.0 * 100)), -N));
        double monthlyPayment = (principal * (interestRate / (12.0 * 100))) / (1 - Math.pow(1 + (interestRate / (12.0 * 100)), -totalMonths));

        System.out.println("\nMonth      Monthly Payment      Principal      Interest      Unpaid Balance      Total Interest");

        // double unpaidBalance = P;
        double unpaidBalance = principal;
        double totalInterest = 0;

        for (int month = 1; month <= totalMonths; month++) {
            // double interest = P * ( i / (12.0 * 100));
            double interest = unpaidBalance * (interestRate / (12.0 * 100));
            // double C = M - interst;
            double principal_portion = monthlyPayment - interest;
            unpaidBalance -= principal_portion;
            totalInterest += interest;

            System.out.printf("%-2s %23.2f %14.2f %13.2f %19.2f %19.2f\n",
                             month, monthlyPayment, principal_portion, interest, unpaidBalance, totalInterest);
        }
    }
}