import java.util.Scanner;

public class T01Q12 {
    public static void main(String[] args) {
        // Step 1: Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Step 2: Initialize variables
        Scanner input = new Scanner(System.in);
        int guess = 0; // User's guess
        int attempts = 0; // Number of attempts

        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Try to guess the number!");

        // Step 3: Start guessing loop
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt(); // Read user's guess
            attempts++; // Increment attempt count

            // Step 4: Provide feedback
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
    }
}
