package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/taxi?serverTimezone=UTC"; // feel free to change this field to your own URL
    private static final String USERNAME = "root"; // feel free to change this field to your own username
    private static final String PASSWORD = "150595"; // feel free to change this field to your own password
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // feel free to change this field to your own JDBC driver

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
