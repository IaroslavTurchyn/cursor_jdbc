package org.example;

import java.sql.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBCConstans.URL, JDBCConstans.USERNAME, JDBCConstans.PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.CREATE_TABLE);
            preparedStatement.execute();

//            PreparedStatement insertUsers=connection.prepareStatement(SQLQueries.INSERT_USERS);
//            insertUsers.execute();


            ResultSet resultSetYounger18 = preparedStatement.executeQuery(SQLQueries.YOUNGER18);
            ArrayList<User> yonger18 = new ArrayList<>();
            while (resultSetYounger18.next()) {
                User user = new User();
                user.setId(resultSetYounger18.getInt("id"));
                user.setFirst_name(resultSetYounger18.getString("first_name"));
                user.setLast_name(resultSetYounger18.getString("last_name"));
                user.setAge(resultSetYounger18.getInt("age"));

                yonger18.add(user);

            }
            yonger18.forEach(System.out::println);
            System.out.println("________________________");
            ResultSet resultSetNamesendsO = preparedStatement.executeQuery(SQLQueries.NAME_ENDS_O);
            ArrayList<User> namesEndsO = new ArrayList<>();
            while (resultSetNamesendsO.next()) {
                User user = new User();
                user.setId(resultSetNamesendsO.getInt("id"));
                user.setFirst_name(resultSetNamesendsO.getString("first_name"));
                user.setLast_name(resultSetNamesendsO.getString("last_name"));
                user.setAge(resultSetNamesendsO.getInt("age"));

                namesEndsO.add(user);


            }
            namesEndsO.forEach(System.out::println);

            System.out.println("________________________");
            ResultSet resultSetAgeBetween = preparedStatement.executeQuery(SQLQueries.AGE_BETWEEN);
            ArrayList<User> ageBetween = new ArrayList<>();
            while (resultSetAgeBetween.next()) {
                User user = new User();
                user.setId(resultSetAgeBetween.getInt("id"));
                user.setFirst_name(resultSetAgeBetween.getString("first_name"));
                user.setLast_name(resultSetAgeBetween.getString("last_name"));
                user.setAge(resultSetAgeBetween.getInt("age"));
                ageBetween.add(user);


            }
            ageBetween.forEach(System.out::println);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }
    }

