package ru.enigm.skssserver.domain;

/**
 * Service interface for authentication
 *
 * @author Ural Nigmatullin
 */
public interface UserService {

    /**
     * Check if password for given username (username is found and password is correct)
     * @param username user name
     * @param password password
     * @return true/false if correct/incorrect
     */
    boolean checkPasswordAndLogin(String username, String password);
}
