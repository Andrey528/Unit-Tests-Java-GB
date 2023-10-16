package seminars.fifth.order;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {
    /**
     * У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и
     * PaymentService. Класс OrderService обрабатывает заказы и делает вызовы к
     * PaymentService для обработки платежей. Ваша задача - написать интеграционный тест,
     * который проверяет, что OrderService и PaymentService взаимодействуют корректно
     */

    @Test
    void payTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        String orderId = "0012";
        double amount = 500.0;

        assertTrue(orderService.placeOrder(orderId, amount));
    }
}
