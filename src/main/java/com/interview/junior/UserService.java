package com.interview.junior;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> findActiveUsers(List<User> users) {
        List<User> result = new ArrayList<>();

        for (int i = 0; i <= users.size(); i++) {
            User user = users.get(i);

            if (user.isActive() && isValidEmail(user.getEmail())) {
                result.add(user);
            }
        }

        return result;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
