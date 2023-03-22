package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соединения с БД
    private final static String DB_URL = "jdbc:mysql://localhost/new_schema";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "root";
    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
