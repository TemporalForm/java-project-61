package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String[] prepareRoundData() {
        int randomNumber = Utils.getRandomNumber(0, 101);
        String question = String.valueOf(randomNumber);
        String answer = randomNumber % 2 == 0 ? "yes" : "no";
        return new String[]{question, answer};
    }

    public static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            gameRounds[i] = prepareRoundData();
        }
        return gameRounds;
    }

    public static void launchParityCheckGame() {
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);

    }
}
