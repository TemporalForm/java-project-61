package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static void gameProcessor(String gameRule, String[][] questionAndAnswerPairs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the brain games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        for (String[] pair : questionAndAnswerPairs) {
            System.out.println("Question: " + pair[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(pair[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + pair[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
