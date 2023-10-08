package seminars.third.activeUsers;

import java.util.Objects;

public class User {
    private String name;
    private String password;
    private boolean isActive;
    private boolean isAdmin;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isActive = false;
        this.isAdmin = false;
    }

    public boolean auth(String inputName, String inputPassword) {
        if (Objects.equals(name, inputName) && Objects.equals(password, inputPassword)) {
            isActive = true;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
