package seminars.third.activeUsers;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepoTest {
    User user;
    User admin = new User("God", "unrealisticallyDifficultPassword");
    UserRepo userRepo;

    @BeforeEach
    void userInit() {
        user = new User("Andrew", "123");
        userRepo = new UserRepo();
    }

    @Test
    void addUserFalseTest() {
        assertThat(userRepo.addUser(user)).isEqualTo(false);
        assertThat(userRepo.getUsersList().size()).isEqualTo(0);
    }

    @Test
    void addUserTrueTest() {
        user.auth("Andrew", "123");
        assertTrue(userRepo.addUser(user));
        assertThat(userRepo.getUsersList().size()).isEqualTo(1);
    }

    @Test
    void findByNameFalseTest() {
        userRepo.addUser(user);
        assertThat(userRepo.findByName("Andrey")).isEqualTo(false);
    }

    @Test
    void findByNameFalseTest2() {
        assertThat(userRepo.findByName("Andrey")).isEqualTo(false);
    }

    @Test
    void findByNameTrueTest() {
        user.auth("Andrew", "123");
        userRepo.addUser(user);
        assertTrue(userRepo.findByName("Andrew"));
    }

    @Test
    void addAdminTrueTest() {
        user.auth("Andrew", "123");
        admin.setAdmin(true);
        admin.auth("God", "unrealisticallyDifficultPassword");

        userRepo.addUser(user);
        userRepo.addUser(admin);

        assertTrue(userRepo.getUsersList().get(1).isAdmin());
    }

    @Test
    void addAdminFalseTest() {
        user.auth("Andrew", "123");
        admin.auth("God", "unrealisticallyDifficultPassword");

        userRepo.addUser(user);
        userRepo.addUser(admin);

        assertThat(userRepo.getUsersList().get(1).isAdmin()).isEqualTo(false);
    }

    @Test
    void kickUsersTrueTest() {
        user.auth("Andrew", "123");
        admin.setAdmin(true);
        admin.auth("God", "unrealisticallyDifficultPassword");

        userRepo.addUser(user);
        userRepo.addUser(admin);
        userRepo.kickUsers();

        assertTrue(userRepo.getUsersList().get(1).isActive());
        assertThat(userRepo.getUsersList().get(0).isActive()).isEqualTo(false);
    }
}
