package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {

    public static String[] prepareRoundData() {
        String[] progressionArray = new String[10];
        //Создается число для инициализации 0 индекса массива прогрессии
        //и, соответственно, определения разности прогрессии
        int firstNumberOfArray = Utils.getRandomNumber(2, 10);
        progressionArray[0] = String.valueOf(firstNumberOfArray);
        //Цикл для заполнения массива прогрессии, начинается с 1 индекса,
        //так как 0 уже инициализирован ранее
        for (int j = 1; j < progressionArray.length; j++) {
            int implementer = Integer.parseInt(progressionArray[j - 1]) + firstNumberOfArray;
            progressionArray[j] = String.valueOf(implementer);
        }
        //Генерация рандомного номера индекса для замены в нём числа
        int indexToReplace = Utils.getRandomNumber(0, 10);
        //Замена числа в массиве по индексу
        String answer = progressionArray[indexToReplace];
        progressionArray[indexToReplace] = "..";
        //Сборка чисел массива через пробел для дальнейшего преобразования в строку
        //для правильного отображения
        StringJoiner question = new StringJoiner(" ");
        for (String s : progressionArray) {
            question.add(s);
        }
        return new String[]{question.toString(), answer};
    }

    public static String[][] prepareGameRounds() {
        String[][] gameRounds = new String[Engine.ROUNDS_NUMBER][2];
        for (int i = 0; i < gameRounds.length; i++) {
            gameRounds[i] = prepareRoundData();
        }
        return gameRounds;
    }

    public static void launchProgressionGame() {
        String gameRule = "What number is missing in the progression?";
        String[][] gameRounds = prepareGameRounds();
        Engine.gameProcessor(gameRule, gameRounds);
    }

}
