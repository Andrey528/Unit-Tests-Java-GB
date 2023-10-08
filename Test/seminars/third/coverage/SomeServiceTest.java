package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnEcho() {
        assertThat(someService.fizzBuzz(14)).isEqualTo("" + 14);
    }

    @Test
    void firstSixElement() {
        assertTrue(someService.firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    void lastSixElement() {
        assertTrue(someService.firstLast6(new int[]{1, 2, 3, 6}));
    }

    @Test
    void firstLastNoSixElement() {
        assertTrue(someService.firstLast6(new int[]{1, 2, 3}));
    }

    @Test
    void purchaseDegreeZeroTest() {
        assertThatThrownBy(() -> someService.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void discountDegreeZeroTest() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(64.5, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void discountUpHundred() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(64.5, 300))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void goodTest() {
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000.0);
    }

    @Test
    void luckySumA() {
        assertThat(someService.luckySum(13, 2 , 3)).isEqualTo(5);
    }

    @Test
    void luckySumB() {
        assertThat(someService.luckySum(2, 13 , 3)).isEqualTo(5);
    }

    @Test
    void luckySumC() {
        assertThat(someService.luckySum(3, 2 , 13)).isEqualTo(5);
    }

    @Test
    void luckySumMot13() {
        assertThat(someService.luckySum(1, 2 , 3)).isEqualTo(6);
    }
}
