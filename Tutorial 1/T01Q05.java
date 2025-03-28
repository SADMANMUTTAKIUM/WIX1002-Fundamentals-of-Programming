import java.util.Scanner;  

public class T01Q05 {
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);  

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        // Read the length from user input
        double length = input.nextDouble();  

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        // Read the width from user input
        double width = input.nextDouble();  

        // Calculate the perimeter of the rectangle using the formula
        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
