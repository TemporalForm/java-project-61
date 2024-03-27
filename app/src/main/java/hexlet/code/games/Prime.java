package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void launchPrimeGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswerPairs = new String[Engine.ROUNDS_NUMBER][2];
        Random random = new Random();
        for (int i = 0; i < questionsAndAnswerPairs.length; i++) {
            String answer = null;
            int randomNumber = random.nextInt(101);
            if (randomNumber < 2) {
                answer = "no";
                continue;
            }
            for (int j = 2; j < Math.sqrt(randomNumber); j++) {
                if (randomNumber % j == 0 && randomNumber != 2) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
            String question = String.valueOf(randomNumber);
            questionsAndAnswerPairs[i][0] = question;
            questionsAndAnswerPairs[i][1] = answer;
        }
        Engine.gameProcessor(gameRule, questionsAndAnswerPairs);
    }
}
