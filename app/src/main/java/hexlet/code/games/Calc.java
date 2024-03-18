package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculatorGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the brain games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        String answer;
        int counter = 0;
        int firstNumber;
        int secondNumber;
        int operationNumber;
        int result;
        while (counter < 3) {
            firstNumber = random.nextInt(101);
            secondNumber = random.nextInt(101);
            operationNumber = random.nextInt(3);
            switch(operationNumber) {
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
                counter++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
                counter = 0;
            }
        }
        }
    }
