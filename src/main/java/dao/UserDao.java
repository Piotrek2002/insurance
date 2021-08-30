package dao;

import model.User;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final String READ_USER_QUERY = "SELECT * from users where id = ?;";
    public User read(long userId) {
        User user =new User();
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(READ_USER_QUERY)
        ) {
            statement.setLong(1, userId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    user.setId(resultSet.getLong("id"));
                    user.setInsertTime(resultSet.getString("insert_time"));
                    user.setLogin(resultSet.getString("login"));
                    user.setNick(resultSet.getString("nick"));
                    user.setPassword(resultSet.getString("password"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;

    }

}
