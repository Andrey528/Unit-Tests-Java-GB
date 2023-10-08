package hw.third;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InIntervalTest {
    InInterval inInterval = new InInterval();

    @ParameterizedTest
    @ValueSource(ints = {-100, 101})
    void inIntervalFalse(int i) {
        assertThat(inInterval.numberInInterval(i)).isEqualTo(false);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 45, 100})
    void inIntervalTrue(int i) {
        assertTrue(inInterval.numberInInterval(i));
    }
}
