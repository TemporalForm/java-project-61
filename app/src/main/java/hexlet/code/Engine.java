package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.App;
public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    static String userName;

    public static void gameProcessor(String gameName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the brain games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        switch(gameName) {
            case "Even":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
                break;
            case "Calc":
                System.out.println("What is the result of the expression?");
                break;
            default:
                break;
        }
    }

    public static String getUserName() {
        return userName;
    }
}
