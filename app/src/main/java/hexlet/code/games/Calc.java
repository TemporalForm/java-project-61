package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static int calculate(int firstNumber, int secondNumber, char operator) {
        int operationResult;
        switch (operator) {
            case '+':
                operationResult = firstNumber + secondNumber;
                break;
            case '-':
                operationResult = firstNumber - secondNumber;
                break;
            case '*':
            default:
                operationResult = firstNumber * secondNumber;
                break;
        }
        return operationResult;
    }

    public static String[][] prepareGameRounds() {
        final int minValue = 0;
        final int maxValue = 2;
        char[] operators = {'+', '-', '*'};
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            int firstNumber = Utils.getNumberFromZeroToHundred();
            int secondNumber = Utils.getNumberFromZeroToHundred();
            int operationType = Utils.getSpecificNumberInRange(minValue, maxValue);
            char operator = operators[operationType];
            String question = firstNumber + " " + operator + " " + secondNumber;
            String answer = String.valueOf(calculate(firstNumber, secondNumber, operator));
            gameRounds[i][0] = question;
            gameRounds[i][1] = answer;
        }
        return gameRounds;
    }

    public static void launchCalculatorGame() {
        String gameRule = "What is the result of the expression?";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
