package com.mycompany.l02q06;
import java.util.Scanner;

public class L02Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Weight of water in grams
        System.out.print("Enter the amount of water in grams: ");
        double waterInGrams = input.nextDouble();

        // Convert grams to kilograms
        double waterInKg = waterInGrams / 1000;

        // Input: Initial temperature in Fahrenheit
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTempFahrenheit = input.nextDouble();

        // Input: Final temperature in Fahrenheit
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTempFahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double initialTempCelsius = (initialTempFahrenheit - 32) / 1.8;
        double finalTempCelsius = (finalTempFahrenheit - 32) / 1.8;

        // Calculate the energy in joules
        double energy = waterInKg * (finalTempCelsius - initialTempCelsius) * 4184;

        // Output: Display the energy needed
        System.out.printf("The energy needed is %.6e joules%n", energy);
    }
}