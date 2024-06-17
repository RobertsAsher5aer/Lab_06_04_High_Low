import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput = false;

        System.out.println("Guess the random number 1-10!");

        do {
            do {
                System.out.print("Enter your guess: ");
                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    if (userGuess >= 1 && userGuess <= 10) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Enter a guess in the range, 1-10.");
                        validInput = false;
                        scanner.next();
                    }
                }
            } while (!validInput);

            if (userGuess < targetNumber) {
                System.out.println("Your guess was low! ");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess was high! ");
            } else {
                System.out.println("Your guess was right on the money! ");
            }

        } while (userGuess != targetNumber);
    }
}