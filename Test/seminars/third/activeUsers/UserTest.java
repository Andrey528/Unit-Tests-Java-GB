package seminars.third.activeUsers;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void trueAuthTest() {
        User user = new User("Andrew", "123");
        assertTrue(user.auth("Andrew", "123"));
    }

    @Test
    void falseAuthTest() {
        User user = new User("Andrew", "123");
        assertThat(user.auth("Andrey", "12")).isEqualTo(false);
    }
}
