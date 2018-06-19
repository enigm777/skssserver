package ru.enigm.skssserver.data;

import ru.enigm.skssserver.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Implementation of {@link UserDao}
 *
 * @author Ural Nigmatullin
 */
public class UserDaoImpl implements UserDao {

    private DataSource dataSource = DatasourceFactory.getMysqlDatasource();

    @Override
    public User getUserByUsername(String username) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        User user = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users where name = " + username);

            if (resultSet.next()) {
                user = new User(resultSet.getString("name"), resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    }
}
