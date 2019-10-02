/*
    Logically, if we focus on the population as a whole, the probability
    that a new born character has a specific gender is 50%. Therefore,
    the gender ratio of the new generation will be 1:1.
*/

package Chapter_06;

import java.util.Random;

public class _07 {
    public static double generateManyFamilies(int familiesNumber) {
        int girls = familiesNumber, boys = 0;

        for (int i = 0; i < familiesNumber; i++) {
            boys += generateOneFamily();
        }

        return girls / (double) (girls + boys);
    }

    private static int generateOneFamily() {
        int girls = 0, boys = 0;
        Random random = new Random();

        while (girls == 0) {
            if (random.nextBoolean())
                girls++;
            else
                boys++;
        }

        return boys;
    }
}