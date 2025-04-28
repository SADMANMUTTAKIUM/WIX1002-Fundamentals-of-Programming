package com.mycompany.l05q03;
import java.util.Scanner;

public class L05Q03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the employee number: ");
        int N = scan.nextInt();
        
        int[][] workHours = new int[N][7];
        
        for (int i = 0; i < N; i++){ // Rows
            for (int j = 0; j < 7; j++){ // Columns
                workHours[i][j] = (int) (1 + (Math.random() * (8)));
            } 
        }
        
        int[] totalHours = new int[N];
        
        System.out.println("Display the work hours schedule for " + N + " members: ");
        System.out.println("\t     Su Mo Tu We Th Fr Sa | Total");
        for (int i = 0; i < N; i++){
            System.out.print("Employee " + (i + 1)+ " : ");
            for (int j = 0; j < 7; j++){
                totalHours[i] += workHours[i][j];
                System.out.print(workHours[i][j] + "  ");
            }
            System.out.print("| " + totalHours[i]);
            System.out.println();
        } 
        
                // Sort employees by total hours in descending order using bubble sort
        for (int pass = 0; pass < totalHours.length - 1; pass++) {
            for (int i = 0; i < totalHours.length - 1 - pass; i++) {
                if (totalHours[i] < totalHours[i + 1]) {
                    // Swap total hours
                    int temp = totalHours[i];
                    totalHours[i] = totalHours[i + 1];
                    totalHours[i + 1] = temp;

                    // Swap corresponding rows in workHours
                    int[] tempRow = workHours[i];
                    workHours[i] = workHours[i + 1];
                    workHours[i + 1] = tempRow;
                }
            }
        }
        
//        // Sort employees by total hours in descending order using bubble sort
//        for (int pass = 0; pass < totalHours.length - 1; pass++) {
//            for (int i = 0; i < totalHours.length - 1 - pass; i++) {
//                if (totalHours[i] < totalHours[i + 1]) {
//                    // Swap total hours
//                    int temp = totalHours[i];
//                    totalHours[i] = totalHours[i + 1];
//                    totalHours[i + 1] = temp;
//
//                    // Swap corresponding rows in workHours
//                    int[] tempRow = workHours[i];
//                    workHours[i] = workHours[i + 1];
//                    workHours[i + 1] = tempRow;
//                }
//            }
//        }
    }
}