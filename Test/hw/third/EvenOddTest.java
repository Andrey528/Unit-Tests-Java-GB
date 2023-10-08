package hw.third;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddTest {
    EvenOdd evenOdd = new EvenOdd();

    @Test
    void evenNumberTest() {
        assertTrue(evenOdd.evenOddNumber(4));
    }

    @Test
    void oddNumberTest() {
        assertThat(evenOdd.evenOddNumber(3)).isEqualTo(false);
    }
}
