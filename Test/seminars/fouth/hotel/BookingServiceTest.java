package seminars.fouth.hotel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class BookingServiceTest {
/**
 * Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
 * Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
 * который обычно проверяет, доступен ли номер в отеле.
 * Вам необходимо проверить правильность работы класса BookingService, который
 * использует HotelService для бронирования номера, если он доступен.
  */

    @Test
    void checkBookingServiceTrue() {
        HotelService hotelServiceMock = mock(HotelService.class);

        when(hotelServiceMock.isRoomAvailable(anyInt())).thenReturn(anyInt() % 2 == 0);

        BookingService bookingService = new BookingService(hotelServiceMock);
        assertTrue(bookingService.bookRoom(2));
        verify(hotelServiceMock, times(1));
    }

    @Test
    void checkBookingServiceFalse() {
        HotelService hotelServiceMock = mock(HotelService.class);

        when(hotelServiceMock.isRoomAvailable(anyInt())).thenReturn(anyInt() % 2 != 0);

        BookingService bookingService = new BookingService(hotelServiceMock);
        assertFalse(bookingService.bookRoom(3));
        verify(hotelServiceMock, times(1));
    }
}
