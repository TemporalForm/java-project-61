package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String[] prepareRoundData() {
        int firstNumber = Utils.getRandomNumber(0, 101);
        int secondNumber = Utils.getRandomNumber(0, 101);
        int operationType = Utils.getRandomNumber(0, 3);
        int operationResult;
        char operator = switch (operationType) {
            case 0 -> {
                operationResult = firstNumber + secondNumber;
                yield '+';
            }
            case 1 -> {
                operationResult = firstNumber - secondNumber;
                yield '-';
            }
            default -> {
                operationResult = firstNumber * secondNumber;
                yield '*';
            }
        };
        String question = firstNumber + " " + operator + " " + secondNumber;
        String answer = String.valueOf(operationResult);
        return new String[]{question, answer};
    }

    public static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            gameRounds[i] = prepareRoundData();
        }
        return gameRounds;
    }

    public static void launchCalculatorGame() {
        String gameRule = "What is the result of the expression?";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }
}
