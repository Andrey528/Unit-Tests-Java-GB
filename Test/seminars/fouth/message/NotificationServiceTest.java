package seminars.fouth.message;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    /**
     * Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
     * Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
     * recipient), который отправляет сообщение получателю.
     * Вам необходимо проверить правильность работы класса NotificationService, который использует
     * MessageService для отправки уведомлений.
     */

    @Test
    void messageDeligateTest() {
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);

        String message = "this not so easy";
        String receiver = "evil_coder";
        notificationService.sendNotification(message, receiver);
        verify(messageServiceMock, times(1)).sendMessage(message, receiver);
    }
}
