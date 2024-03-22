package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void launchGreatestCommonDivisorGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswerPairs = new String[Engine.ROUNDS_NUMBER][2];
        Random random = new Random();
        for (int i = 0; i < questionsAndAnswerPairs.length; i++) {
            String answer = null;
            int firstNumber = random.nextInt(101);
            int secondNumber = random.nextInt(101);
            int leastNumber = Math.min(firstNumber, secondNumber);
            for (int j = leastNumber; j > 1; j--) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    answer = String.valueOf(j);
                    break;
                }
                answer = "1";
            }
            questionsAndAnswerPairs[i][0] = firstNumber + " " + secondNumber;
            questionsAndAnswerPairs[i][1] = answer;
        }
        Engine.gameProcessor(gameRule, questionsAndAnswerPairs);
    }
}
