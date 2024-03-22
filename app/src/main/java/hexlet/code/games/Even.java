package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Even {
    public static void launchParityCheckGame() {
        Random random = new Random();
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'";
        String[][] questionAndAnswerPairs = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < questionAndAnswerPairs.length; i++) {
            int randomNumber = random.nextInt(101);
            String question = String.valueOf(randomNumber);
            String answer = randomNumber %2 == 0 ? "yes" : "no";
            questionAndAnswerPairs[i][0] = question;
            questionAndAnswerPairs[i][1] = answer;
        }
        Engine.gameProcessor(gameRule, questionAndAnswerPairs);
    }
}

// Код до класса Engine
/*
        while (roundsCounter < Engine.ROUNDS_NUMBER) {
            number = random.nextInt(101);
            System.out.println("Question: "
                    + number
                    + "\nYour answer: ");
            answer = scanner.next();
            numberIsEven = number % 2 == 0;
            if (answer.equals("yes") && numberIsEven) {
                 System.out.println("Correct!");
                 roundsCounter++;
             } else if (answer.equals("no") && !numberIsEven) {
                 System.out.println("Correct!");
                 roundsCounter++;
             } else if (answer.equals(("yes")) && !numberIsEven) {
                 System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'");
                 roundsCounter = 0;
             } else if (answer.equals(("no")) && numberIsEven) {
                 System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'");
                 roundsCounter = 0;
             } else if (!answer.equals(("no")) && !answer.equals(("yes")) && numberIsEven) {
                 System.out.println("'" + answer + "' is wrong answer. Correct answer was 'yes'");
                 roundsCounter = 0;
             } else {
                 System.out.println("'" + answer + "' is wrong answer. Correct answer was 'no'");
                 roundsCounter = 0;
             }
        }*/
