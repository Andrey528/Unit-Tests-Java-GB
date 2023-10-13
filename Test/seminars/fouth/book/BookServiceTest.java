package seminars.fouth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    /***
     * У вас есть класс BookService, который использует интерфейс BookRepository для получения
     * информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя
     * Mockito для создания мок-объекта BookRepository.
     */

    private BookRepository bookRepositoryMock;
    private BookService bookService;

    @BeforeEach
    void init() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void testFindById() {
        Book book = new Book("1", "Бесприданница", "Бунин");
        when(bookRepositoryMock.findById("1")).thenReturn(book);

        assertEquals(book, bookService.findBookById("1"));
        verify(bookRepositoryMock, times(1)).findById("1");
    }

    @Test
    void testFindAll() {
        List<Book> books = new ArrayList<>(List.of(new Book("1", "Book1", "Author1"), new Book("2", "Book2", "Author2")));
        when(bookRepositoryMock.findAll()).thenReturn(books);

        assertEquals(books, bookService.findAllBooks());
        verify(bookRepositoryMock, times(1)).findAll();
    }
}
