package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Leo", "Messi", (byte) 35);
        userService.saveUser("Cristiano", "Ronaldo", (byte) 38);
        userService.saveUser("Eden", "Hazard", (byte) 32);
        userService.saveUser("Erling", "Haaland", (byte) 22);
        for (User user: userService.getAllUsers()){
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
