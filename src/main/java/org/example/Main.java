package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBCConstans.URL, JDBCConstans.USERNAME, JDBCConstans.PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.CREATE_TABLE);
//            preparedStatement.execute(SQLQueries.CREATE_TABLE);
//            preparedStatement.execute(SQLQueries.INSERT_USERS);
//            PreparedStatement preparedStatement1 = connection.prepareStatement(SQLQueries.UPDATE_AGE);
//            preparedStatement1.setInt(1,333);
//            preparedStatement1.setInt(2,2);

            PreparedStatement preparedStatement2 = connection.prepareStatement(SQLQueries.UPDATE_NAME);
            preparedStatement2.setString(1, "Tetjana");
            preparedStatement2.setInt(2, 2);
            preparedStatement2.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}