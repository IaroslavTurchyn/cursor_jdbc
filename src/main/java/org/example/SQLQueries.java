package org.example;

public class SQLQueries {
    public final static String CREATE_TABLE = """
            CREATE TABLE IF NOT EXISTS user(
            id int PRIMARY KEY AUTO_INCREMENT,
            first_name varchar(50),
            last_name varchar(50),
            age int)
            """;

    public final static String INSERT_USERS = """
            INSERT INTO user (first_name, last_name,age) VALUES ('Petro', 'Ravlyk', 25),
            ('Anna','Kolombo',33),
            ('Olha', 'Trend',45)
            """;

    public final static String UPDATE_AGE = """
            UPDATE user SET age=? WHERE id=?
            """;

    public final static String UPDATE_NAME = """
            Update user Set first_name=? WHERE id=?
            """;
}
