package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        //+1 так как верхняя граница метода random не включительная
        return random.nextInt(min, max + 1);
    }
}
