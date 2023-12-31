package seminars.fouth.card;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    void methodPayWillCallMethodCharge() {
        CreditCard creditCardMock = mock(CreditCard.class);

        when(creditCardMock.getCardNumber()).thenReturn("1234567");
        when(creditCardMock.getCardHolder()).thenReturn("Ivan Ivanov");
        when(creditCardMock.getExpiryDate()).thenReturn("12/24");
        when(creditCardMock.getCvv()).thenReturn("123");

        PaymentForm paymentForm = new PaymentForm(creditCardMock);

        paymentForm.pay(100);
        paymentForm.pay(100);

        verify(creditCardMock, times(2)).charge(100);
    }
}