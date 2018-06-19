package ru.enigm.skssserver.domain;

import ru.enigm.skssserver.model.User;

/**
 * Repository interface for User
 *
 * @author Ural Nigmatullin
 */
public interface UserRepository {

    /**
     * Find user by user name in database
     * @param username user name
     * @return User
     */
    User findUserByUserName(String username);
}
