package ru.enigm.skssserver.data;

import com.sun.istack.internal.Nullable;
import ru.enigm.skssserver.model.User;

/**
 * Data access object for User
 *
 * @author Ural Nigmatullin
 */
public interface UserDao {

    /**
     * Returns User or null if not found
     * @param username username
     * @return User/null
     */
    @Nullable
    User getUserByUsername(String username);
}
