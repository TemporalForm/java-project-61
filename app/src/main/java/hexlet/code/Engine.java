package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.App;
public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    static String userName;
    static String answer;

    public static void gameProcessor(String gameName) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the brain games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }
}
