package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
    private static java.sql.Connection connection;
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection("jbdc:mysql://localhost/projectsilledb"+"user=Bruger1&password=Password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
