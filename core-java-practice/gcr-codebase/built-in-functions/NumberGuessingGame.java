import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    // Function to generate a guess between min and max
    public static int generateGuess(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    // Function to get feedback from user
    public static String getUserFeedback(int guess) {
        System.out.println("Is the number " + guess + "? (high / low / correct)");
        return sc.nextLine().toLowerCase();
    }

    // Function to update range based on feedback
    public static int[] updateRange(String feedback, int guess, int min, int max) {
        if (feedback.equals("high")) {
            max = guess - 1;
        } else if (feedback.equals("low")) {
            min = guess + 1;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessedCorrectly && min <= max) {

            int guess = generateGuess(min, max);
            String feedback = getUserFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("🎉 Yay! I guessed your number correctly!");
                guessedCorrectly = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] range = updateRange(feedback, guess, min, max);
                min = range[0];
                max = range[1];
            } else {
                System.out.println("❌ Invalid input. Please type high, low, or correct.");
            }
        }

        sc.close();
    }
}
