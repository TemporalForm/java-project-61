package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static int findGreatestCommonDivisor(int a, int b) {
        return b == 0 ? a : findGreatestCommonDivisor(b, a % b);
    }

    private static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        final int minValue = 1;
        final int maxValue = 100;
        for (int i = 0; i < gameRounds.length; i++) {
            int firstNumber = Utils.getSpecificNumberInRange(minValue, maxValue);
            int secondNumber = Utils.getSpecificNumberInRange(minValue, maxValue);
            String question = firstNumber + " " + secondNumber;
            String answer = String.valueOf(findGreatestCommonDivisor(firstNumber, secondNumber));
            gameRounds[i][0] = question;
            gameRounds[i][1] = answer;
        }
        return gameRounds;
    }

    public static void launchGreatestCommonDivisorGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
