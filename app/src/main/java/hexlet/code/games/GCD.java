package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int leastNumber = Math.min(firstNumber, secondNumber);
        int greatestCommonDivisor = 0;
        for (int j = leastNumber; j > 0; j--) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                greatestCommonDivisor = j;
                return greatestCommonDivisor;
            }
        }
        return greatestCommonDivisor;
    }

    public static String[][] prepareGameRounds() {
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
