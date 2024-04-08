package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {

    private static String[] getProgressionArray(int arrayLength, int firstNumber, int commonDifference) {

        String[] progressionArray = new String[arrayLength];
        progressionArray[0] = String.valueOf(firstNumber);
        for (int j = 1; j < progressionArray.length; j++) {
            int implementer = Integer.parseInt(progressionArray[j - 1]) + commonDifference;
            progressionArray[j] = String.valueOf(implementer);
        }
        return progressionArray;
    }

    private static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        final int minValue = 0;
        final int minDiffValue = 2;
        final int maxValue = 10;
        final int arrayLength = 10;
        for (int i = 0; i < gameRounds.length; i++) {
            int commonDifference = Utils.getSpecificNumberInRange(minDiffValue, maxValue);
            int firstNumber = Utils.getSpecificNumberInRange(minValue, maxValue);
            StringJoiner question = new StringJoiner(" ");
            String[] progressionArray = getProgressionArray(arrayLength, firstNumber, commonDifference);
            int indexToReplace = Utils.getSpecificNumberInRange(minValue, maxValue - 1);
            String answer = progressionArray[indexToReplace];
            progressionArray[indexToReplace] = "..";
            for (String s : progressionArray) {
                question.add(s);
            }
            gameRounds[i][0] = question.toString();
            gameRounds[i][1] = answer;
        }
        return gameRounds;
    }

    public static void launchProgressionGame() {
        String gameRule = "What number is missing in the progression?";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }

}
