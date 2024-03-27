package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                Your choice:\s""");
        String gameNumber = scanner.next();
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
            case 5:
                Progression.launchProgressionGame();
                break;
            case 6:
                Prime.launchPrimeGame();
                break;
            case 0:
            default:
                System.out.println("You have chosen the wrong number. Please, enter a number in 0 to 6 range");
                scanner.close();
                break;
        }
    }
}
