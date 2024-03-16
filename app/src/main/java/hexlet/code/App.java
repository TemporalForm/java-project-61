package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                """);
        String choiceNumber = scanner.next();
        System.out.println("Your choice: " + choiceNumber);
        switch (Integer.parseInt(choiceNumber)) {
            case 1:
                System.out.println("Welcome to the brain games!");
                Cli.greetUser();
                break;
            case 0:
            default:
                scanner.close();
                break;
        }
    }
}
