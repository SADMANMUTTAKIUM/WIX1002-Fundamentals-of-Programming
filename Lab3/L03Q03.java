package com.mycompany.l03q03;
import java.util.Scanner;

public class L03Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sales volume: ");
        double salesVolume = input.nextDouble();

        double commissionRate;
        double commission;

        if (salesVolume >= 0 && salesVolume <= 100) {
            commissionRate = 0.05; // 5%
        } else if (salesVolume > 100 && salesVolume <= 500) {
            commissionRate = 0.075; // 7.5%
        } else if (salesVolume > 500 && salesVolume <= 1000) {
            commissionRate = 0.10; // 10%
        } else {
            commissionRate = 0.125; // 12.5%
        }
        commission = salesVolume * commissionRate;
        
        System.out.printf("The commission for sales volume %.2f is: %.2f%n", salesVolume, commission);
    }
}