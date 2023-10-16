package seminars.fifth.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    /***
     * У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для
     * получения информации о пользователе. Ваша задача - написать интеграционный тест, который
     * проверяет, что UserService и UserRepository работают вместе должным образом
     */

    UserRepository repo = new UserRepository();
    UserService service = new UserService(repo);

    @Test
    void integrationTest() {
        int userId = 3;
        String expectedUserName = "User " + userId;
        String actualUserName = service.getUserName(userId);

        assertEquals(expectedUserName, actualUserName);
    }
}
