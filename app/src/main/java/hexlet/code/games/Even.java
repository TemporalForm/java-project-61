package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void launchParityCheckGame() {
        Random random = new Random();
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswerPairs = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < questionAndAnswerPairs.length; i++) {
            int randomNumber = random.nextInt(101);
            String question = String.valueOf(randomNumber);
            String answer = randomNumber % 2 == 0 ? "yes" : "no";
            questionAndAnswerPairs[i][0] = question;
            questionAndAnswerPairs[i][1] = answer;
        }
        Engine.gameProcessor(gameRule, questionAndAnswerPairs);
    }
}
