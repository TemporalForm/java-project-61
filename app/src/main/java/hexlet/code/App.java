package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                """);
        String gameNumber = scanner.next();
        System.out.println("Your choice: " + gameNumber);
        switch (Integer.parseInt(gameNumber)) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.launchParityCheckGame();
                break;
            case 3:
                Calc.launchCalculatorGame();
                break;
            case 4:
                GCD.launchGreatestCommonDivisorGame();
                break;
            case 0:
            default:
                scanner.close();
                break;
        }
    }
}
