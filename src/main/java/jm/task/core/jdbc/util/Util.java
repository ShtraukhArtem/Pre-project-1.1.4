package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/katadbtest";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "pass";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to the database successfully");
        } catch (SQLException e) {
            System.out.println("Failed to load JDBC driver");
            throw new RuntimeException(e);
        }
        return connection;
    }

}
