package seminars.third.activeUsers;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> usersList = new ArrayList<>();

    public boolean addUser(User user) {
        if (user.isActive()) {
            usersList.add(user);
            return true;
        } else
            return false;
    }

    public boolean findByName(String username) {
        for (User user: usersList) {
            if (user.getName().equals(username))
                return true;
        }

        return false;
    }

    public void kickUsers() {
        for (User user: usersList) {
            if (!user.isAdmin())
                user.setActive(false);
        }
    }

    public List<User> getUsersList() {
        return usersList;
    }
}
