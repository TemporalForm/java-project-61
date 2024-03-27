package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static String[] prepareRoundData() {
        int firstNumber = Utils.getRandomNumber(1, 100);
        int secondNumber = Utils.getRandomNumber(1, 100);
        int leastNumber = Math.min(firstNumber, secondNumber);
        String answer = null;
        // Цикл для поиска НОД по убыванию от меньшего числа с шагом 1
        for (int j = leastNumber; j > 0; j--) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                answer = String.valueOf(j);
                break;
            }
        }
        String question = firstNumber + " " + secondNumber;
        return new String[]{question, answer};
    }

    public static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            gameRounds[i] = prepareRoundData();
        }
        return gameRounds;
    }

    public static void launchGreatestCommonDivisorGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
