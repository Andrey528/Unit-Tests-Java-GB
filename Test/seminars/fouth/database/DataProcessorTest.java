package seminars.fouth.database;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DataProcessorTest {
    /**
     * Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
     * Условие: У вас есть класс Database с методом public List<String> query(String sql), который выполняет SQL-
     * запрос и возвращает результат.
     * Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
     * выполнения запроса и обработки результатов.
     */

    @Test
    void dataProcessorClassTest() {
        Database databaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(databaseMock);

        List<String> expectedResult = new ArrayList<>(Arrays.asList("res1", "res2"));

        String query = "SELECT * FROM mytable";

        when(databaseMock.query(query)).thenReturn(expectedResult);

        List<String> actualResult = dataProcessor.processData(query);

        verify(databaseMock).query(query);

        assertEquals(actualResult, expectedResult);
    }
}
