package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void launchCalculatorGame() {
        String gameRule = "What is the result of the expression?";
        String[][] questionAndAnswerPairs = new String[Engine.ROUNDS_NUMBER][2];
        Random random = new Random();
        for (int i = 0; i < questionAndAnswerPairs.length; i++) {
            int firstNumber = random.nextInt(101);
            int secondNumber = random.nextInt(101);
            int operationType = random.nextInt(3);
            int result;
            char operator = switch (operationType) {
                case 0 -> {
                    result = firstNumber + secondNumber;
                    yield '+';
                }
                case 1 -> {
                    result = firstNumber - secondNumber;
                    yield '-';
                }
                default -> {
                    result = firstNumber * secondNumber;
                    yield '*';
                }
            };
            String question = String.valueOf(result);
            questionAndAnswerPairs[i][0] = firstNumber + " " + operator + " " + secondNumber;
            questionAndAnswerPairs[i][1] = String.valueOf(result);
        }
        Engine.gameProcessor(gameRule, questionAndAnswerPairs);
        }
    }
