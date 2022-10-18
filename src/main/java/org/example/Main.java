package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (var connection = DriverManager.getConnection(JDBCConstans.URL, JDBCConstans.USERNAME, JDBCConstans.PASSWORD)) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}