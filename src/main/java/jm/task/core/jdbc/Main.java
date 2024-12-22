package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userServiceImpl = new UserServiceImpl();

        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Mike", "Ivanov", (byte) 32);
        userServiceImpl.saveUser("Sveta", "Petrova", (byte) 24);
        userServiceImpl.saveUser("Denis", "Orlov", (byte) 29);
        userServiceImpl.saveUser("Alex", "Lebedev", (byte) 21);
        userServiceImpl.getAllUsers();
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();

    }
}
