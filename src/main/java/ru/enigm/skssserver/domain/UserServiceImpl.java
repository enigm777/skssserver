package ru.enigm.skssserver.domain;

import ru.enigm.skssserver.model.User;

/**
 * Implementation of {@link UserService}
 *
 * @author Ural Nigmatullin
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkPasswordAndLogin(String username, String password) {
        User user = userRepository.findUserByUserName(username);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }
}
