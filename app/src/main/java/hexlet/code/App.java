package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                """);
        String numberChoice = scanner.next();
        System.out.println("Your choice: " + numberChoice);
        switch (Integer.parseInt(numberChoice)) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.parityCheckGame();
                break;
            case 3:
                Calc.calculatorGame();
                break;
            case 0:
            default:
                scanner.close();
                break;
        }
    }
}
