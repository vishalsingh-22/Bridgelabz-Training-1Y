import java.util.*;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }

        System.out.println("Guessed correctly!");
    }
}
