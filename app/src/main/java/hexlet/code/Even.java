package hexlet.code;

import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void parityCheckGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(" Answer 'yes' if the number is even, otherwise answer 'no'");
        String answer;
        int counter = 0;
        int number;
        boolean numberIsEven;
        while (counter < 3) {
            number = random.nextInt(101);
            System.out.println("Question: "
                    + number
                    + "\nYour answer: ");
            answer = scanner.next();
            numberIsEven = number % 2 == 0;
            if (answer.equals("yes") && numberIsEven) {
                System.out.println("Correct!");
                counter++;
            } else if (answer.equals("no") && !numberIsEven) {
                System.out.println("Correct!");
                counter++;
            } else if (answer.equals(("yes")) && !numberIsEven) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'");
                counter = 0;
            } else if (answer.equals(("no")) && numberIsEven) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'");
                counter = 0;
            } else if (!answer.equals(("no")) && !answer.equals(("yes")) && numberIsEven) {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was 'yes'");
                counter = 0;
            } else {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was 'no'");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
