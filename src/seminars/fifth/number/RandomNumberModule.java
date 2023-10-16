package seminars.fifth.number;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberModule {
    /***
     * Первый модуль генерирует список случайных чисел
     */

    public ArrayList<Integer> generateList(int i) {
        if (i <= 0) throw new IllegalArgumentException("Incorrect argument");

        Random rand = new Random();
        ArrayList<Integer> someList = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            someList.add(rand.nextInt(10));
        }

        return someList;
    }
}