package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getNumberFromZeroToHundred() {
        Random random = new Random();
        final int minValue = 0;
        //101 так как верхняя граница метода random не включительная
        final int maxValue = 101;
        return random.nextInt(minValue, maxValue);
    }

    public static int getSpecificNumberInRange(int minValue, int maxValue) {
        Random random = new Random();
        //+1 так как верхняя граница метода random не включительная
        return random.nextInt(minValue, maxValue + 1);
    }
}
