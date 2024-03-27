package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static String[] prepareRoundData() {
        int randomNumber = Utils.getRandomNumber(0, 100);
        String answer = null;
        String question = String.valueOf(randomNumber);
        //Если число меньше двух, то оно не простое
        if (randomNumber < 2) {
            answer = "no";
            return new String[]{question, answer};
        }
        //Перебор делителей до корня из числа, начиная с 2
        //Если делится без остатка, то число не простое
        //Если не делится без остатка, то число простое
        for (int j = 2; j <= Math.sqrt(randomNumber); j++) {
            if (randomNumber % j == 0 && randomNumber != 2) {
                answer = "no";
                break;
            } else {
                answer = "yes";
            }
        }
        return new String[]{question, answer};
    }

    public static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            gameRounds[i] = prepareRoundData();
        }
        return gameRounds;
    }

    public static void launchPrimeGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
