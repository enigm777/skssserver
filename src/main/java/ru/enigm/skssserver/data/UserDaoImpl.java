package ru.enigm.skssserver.data;

import ru.enigm.skssserver.model.User;

import java.sql.*;

/**
 * Implementation of {@link UserDao}
 *
 * @author Ural Nigmatullin
 */
public class UserDaoImpl implements UserDao {

    private static final String SELECT_USER_SQL = "SELECT * FROM users WHERE name = ?";
    private static final String NAME_COLUMN = "name";
    private static final String PASSWORD_COLUMN = "password";

    @Override
    public User getUserByUsername(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;

        try {
            connection = DatasourceFactory.getMysqlDatasource().getConnection();
            statement = connection.prepareStatement(SELECT_USER_SQL);
            statement.setString(1, username);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = new User(resultSet.getString(NAME_COLUMN), resultSet.getString(PASSWORD_COLUMN));
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
