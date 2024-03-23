package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void launchProgressionGame() {
        String gameRule = "What number is missing in the progression?";
        String [][] questionAndAnswerPairs = new String [Engine.ROUNDS_NUMBER][2];
        Random random = new Random();
        for (int i = 0; i < questionAndAnswerPairs.length; i++) {
            String[] progressionArray = new String[10];
            int firstNumberOfArray = random.nextInt(2,10);
            progressionArray[0] = String.valueOf(firstNumberOfArray);
            for (int j = 1; j < progressionArray.length; j++) {
                int implementer = Integer.parseInt(progressionArray[j-1]) + firstNumberOfArray;
                progressionArray[j] = String.valueOf(implementer);
            }
            int indexToReplace = random.nextInt(10);
            String answer = progressionArray[indexToReplace];
            progressionArray[indexToReplace] = "..";
            StringJoiner question = new StringJoiner(" ");
            for (String s : progressionArray) {
                question.add(s);
            }
            questionAndAnswerPairs[i][0] = question.toString();
            questionAndAnswerPairs[i][1] = answer;
        }
        Engine.gameProcessor(gameRule, questionAndAnswerPairs);
    }

}
