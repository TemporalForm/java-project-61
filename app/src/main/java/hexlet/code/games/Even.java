package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            int randomNumber = Utils.getNumberFromZeroToHundred();
            String question = String.valueOf(randomNumber);
            String answer = isEven(randomNumber) ? "yes" : "no";
            gameRounds[i][0] = question;
            gameRounds[i][1] = answer;
        }
        return gameRounds;
    }

    public static void launchParityCheckGame() {
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);

    }
}
