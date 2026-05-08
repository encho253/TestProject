package com.interview.junior;

import java.util.List;

public class App {

    public static void main(String[] args) {
        UserService userService = new UserService();

        List<User> users = List.of(
                new User(1, "Alice", "alice@email.com", true),
                new User(2, "Bob", null, true),
                new User(3, "Charlie", "charlie@email.com", false),
                new User(4, "", "invalid-email", true)
        );

        System.out.println("Active users:");

        List<User> activeUsers = userService.findActiveUsers(users);

        for (User user : activeUsers) {
            System.out.println(user.getName().toUpperCase() + " - " + user.getEmail());
        }

        System.out.println("Total active users: " + activeUsers.size());
    }
}
