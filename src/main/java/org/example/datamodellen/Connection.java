package org.example.datamodellen;

import java.sql.*;

public class Connection {

    private static java.sql.Connection connection = null;
    private static String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
    private static String url;

    public Connection() {
    }



    java.sql.Connection getMySQLConnection(String username, String password, String Schema) {
        url = MYSQLDriver + Schema + "?serverTimezone=Europe/Amsterdam&amp";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to MYSQL Schema:"+Schema);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
