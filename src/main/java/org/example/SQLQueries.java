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
            INSERT INTO user (first_name, last_name,age) VALUES 
            ('Petro', 'Ravlyk', 25),
            ('Anna','Kolombo',33),
            ('Ivan', 'Koma',21),
            ('Yaroslav', 'Pauk',13),
            ('Oleksandr', 'Tarakan',44),
            ('Olha', 'Trach',65) 
             """;

    public final static String UPDATE_AGE = """
            UPDATE user SET age=? WHERE id=?
            """;

    public final static String UPDATE_NAME = """
            Update user Set first_name=? WHERE id=?
            """;

    public static final String YOUNGER18 = """
            SELECT * FROM user WHERE age<35
            """;
    public static final String NAME_ENDS_O = """
            SELECT * FROM user WHERE first_name LIKE '%0'
            """;

    public static final String AGE_BETWEEN = """
            SELECT * FROM user WHERE age BETWEEN 18 and 60
            """;
}
