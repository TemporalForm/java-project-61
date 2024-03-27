package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static void gameProcessor(String gameRule, String[][] gameRounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        for (String[] round : gameRounds) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + round[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
