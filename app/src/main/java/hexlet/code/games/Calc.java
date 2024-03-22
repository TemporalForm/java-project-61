package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final String game = "Calc";
    public static void calculatorGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer;
        int roundsCounter = 0;
        int firstNumber;
        int secondNumber;
        int operationType;
        int result;
        while (roundsCounter < Engine.ROUNDS_NUMBER) {
            firstNumber = random.nextInt(101);
            secondNumber = random.nextInt(101);
            operationType = random.nextInt(3);
            switch(operationType) {
                case 0:
                    result = firstNumber + secondNumber;
                    System.out.println("Question: "
                            + firstNumber + " + " + secondNumber
                            + "\nYour answer: ");
                    break;
                case 1:
                    result = firstNumber - secondNumber;
                    System.out.println("Question: "
                            + firstNumber + " - " + secondNumber
                            + "\nYour answer: ");
                    break;
                default:
                    System.out.println("Question: "
                            + firstNumber + " * " + secondNumber
                            + "\nYour answer: ");
                    result = firstNumber * secondNumber;
                    break;
            }
            answer = scanner.next();
            if (result == Integer.parseInt(answer)) {
                System.out.println("Correct!");
                roundsCounter++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
                roundsCounter = 0;
            }
        }
        System.out.println("Congratulations, " + Engine.getUserName() + "!");
        scanner.close();
        }
    }
