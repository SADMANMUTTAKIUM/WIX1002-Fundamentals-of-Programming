package com.mycompany.l04q04;
import java.util.Scanner;

public class L04Q04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday,..., 6 for Saturday): ");
        int firstDay = input.nextInt();
        if (firstDay < 0 || firstDay > 6) {
            System.out.println("Invalid first day. Please enter a value between 0 and 6.");
            return;
        }

        for (int month = 1; month <= 12; month++){
            if (month != 5 && month != 8){
                continue;
           }
            
            String monthName = "";
            switch (month){
                case 1: 
                    monthName = "January";
                    break;
                case 2: 
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Invalid Choice";
                    break;
            }
            
            System.out.println("\n\t\t" + monthName + " " + year + " "); // Print month and the year
            System.out.println(" -----------------------------------"); // Print border
            System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat"); // Print days name
            
            for (int i = 0; i < firstDay; i++){ 
                System.out.print("     "); // Print leading spaces for the first day of the month
            }
            
            int daysInMonth = 0;
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                    daysInMonth = 31;
                    break;
                }
                case 4: case 6: case 9: case 11:{
                    daysInMonth = 30;
                    break;
                }
                case 2:{
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                }         
            }
            
            for (int day = 1; day <= daysInMonth; day++){
                System.out.printf("%5d", day); // Print the days of the month
                
                if ((firstDay + day) % 7 == 0){
                    System.out.println(); // If it's Sunday (the 7th day), move to the next line
                }
            }
            
            System.out.println(); // Newline after the month is printed
            
            // Update the first day for the next month
            firstDay = (firstDay + daysInMonth) % 7;
        }   
    }
}