package seminars.fifth.number;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.*;

class NumberTest {
    //5.1.
    /***
     * Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
     * тест, который проверяет, что оба модуля работают вместе правильно
     */
    @Test
    void testGenerateNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        assertThat(randomNumberModule.generateList(5).size()).isEqualTo(5);
    }

    @Test
    void testMAxNumber() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.takeMaxNumber(Arrays.asList(4, 3, 5, 6, 7))).isEqualTo(7);
    }

    @Test
    void integrationTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        ArrayList<Integer> res = randomNumberModule.generateList(5);
        assertThat(maxNumberModule.takeMaxNumber(res)).isEqualTo(Collections.max(res));
    }
}