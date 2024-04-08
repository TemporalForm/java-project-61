package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0 && number != 2) {
                return false;
            }
        }
        return true;
    }

    private static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        String answer;
        for (int i = 0; i < gameRounds.length; i++) {
            int randomNumber = Utils.getNumberFromZeroToHundred();
            answer = isPrime(randomNumber) ? "yes" : "no";
            String question = String.valueOf(randomNumber);
            gameRounds[i][0] = question;
            gameRounds[i][1] = answer;
        }
        return gameRounds;
    }

    public static void launchPrimeGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
