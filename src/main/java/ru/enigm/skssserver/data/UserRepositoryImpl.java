package ru.enigm.skssserver.data;

import ru.enigm.skssserver.domain.UserRepository;
import ru.enigm.skssserver.model.User;

/**
 * Implementation for {@link UserRepository}
 *
 * @author Ural Nigmatullin
 */
public class UserRepositoryImpl implements UserRepository {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User findUserByUserName(String username) {
        return userDao.getUserByUsername(username);
    }
}
