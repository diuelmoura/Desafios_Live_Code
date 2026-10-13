
/*CHALLENGE STATEMENT - Number Guessing Game
 *
 * Write a Java program that implements a number guessing game.
 * The program must generate a random number between 1 and 100.
 * The player must guess the secret number within 7 attempts.
 * After each guess, the program must provide feedback:
 * - If the guess is greater than the secret number,
 * display "Too high!".
 *
 * - If the guess is less than the secret number,
 *   display "Too low!".
 *
 * - If the guess is correct,
 *   display "Congratulations!" and end the game.
 *
 * - If the player uses all 7 attempts,
 *   display "Game Over!" and reveal the secret number.
 *
 * Requirements:
 * 1. Use Scanner to read user input.
 * 2. Use Random to generate the secret number.
 * 3. Use a loop to control the number of attempts.
 * 4. Use conditional statements to compare numbers.
 * 5. Validate that the input is an integer from 1 to 100.
 *
 * Example:
 * Secret number: 42
 * Input: 70
 * Output: Too high!
 *
 * Input: 20
 * Output: Too low!
 *
 * Input: 42
 * Output: Congratulations! You guessed the number!
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        // Create objects for input and random numbers.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100.
        int secretNumber = random.nextInt(100) + 1;

        // Define the maximum number of attempts.
        int maxAttempts = 7;

        // Store the player's guess.
        int guess;

        // Control whether the player has won.
        boolean guessedCorrectly = false;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have 7 attempts.");

        // Repeat until all attempts have been used.
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("\nAttempt " + attempt + ": ");

            // Check if the user entered an integer.
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter an integer.");
                scanner.next();
                attempt--;
                continue;
            }

            // Read the player's guess.
            guess = scanner.nextInt();

            // Check if the number is within the allowed range.
            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                attempt--;
                continue;
            }

            // Check whether the guess matches the secret number.
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number!");
                guessedCorrectly = true;
                break;

            } else if (guess > secretNumber) {
                System.out.println("Too high!");

            } else {
                System.out.println("Too low!");
            }

            // Display the remaining attempts.
            System.out.println("Remaining attempts: "
                    + (maxAttempts - attempt));
        }

        // Check whether the player lost.
        if (!guessedCorrectly) {
            System.out.println("\nGame Over!");
            System.out.println("The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}

/*
 * TECHNICAL EXPLANATION
 *
 * The NumberGuessingGame program generates a random number
 * and allows the user to guess it within a limited number
 * of attempts.
 *
 * 1. Scanner and Random:
 *
 * Scanner reads the player's input from the console.
 * Random generates the secret number.
 *
 * random.nextInt(100) + 1 generates an integer
 * between 1 and 100, inclusive.
 *
 * 2. Variables:
 *
 * secretNumber stores the randomly generated number.
 * maxAttempts defines the maximum number of guesses.
 * guess stores the number entered by the player.
 * guessedCorrectly indicates whether the player has won.
 *
 * 3. For Loop:
 *
 * The for loop controls the maximum number of attempts.
 * The variable attempt starts at 1 and increases after
 * each valid guess.
 *
 * 4. Input Validation:
 *
 * scanner.hasNextInt() checks whether the input is
 * a valid integer.
 *
 * Invalid input does not consume an attempt.
 *
 * 5. Conditional Statements:
 *
 * If guess == secretNumber, the player wins.
 *
 * If guess > secretNumber, the guess is too high.
 *
 * Otherwise, the guess is too low.
 *
 * 6. Break Statement:
 *
 * The break statement immediately terminates
 * the loop when the player guesses correctly.
 *
 * 7. Continue Statement:
 *
 * The continue statement skips the remaining code
 * in the current iteration.
 *
 * It is used when the player enters invalid input.
 *
 * 8. Game Over:
 *
 * If guessedCorrectly remains false after the loop,
 * the game ends and reveals the secret number.
 *
 * TIME COMPLEXITY:
 *
 * Best Case: O(1)
 * The player guesses correctly on the first attempt.
 *
 * Worst Case: O(A)
 * The program processes up to A valid attempts.
 *
 * Since A = 7 is fixed, the practical time complexity
 * is O(1).
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 * The program uses a constant amount of auxiliary memory.
 *
 * EXAMPLE OUTPUT:
 *
 * === NUMBER GUESSING GAME ===
 * Guess a number between 1 and 100.
 * You have 7 attempts.
 *
 * Attempt 1: 70
 * Too high!
 * Remaining attempts: 6
 *
 * Attempt 2: 20
 * Too low!
 * Remaining attempts: 5
 *
 * Attempt 3: 42
 * Congratulations! You guessed the number!
 */
