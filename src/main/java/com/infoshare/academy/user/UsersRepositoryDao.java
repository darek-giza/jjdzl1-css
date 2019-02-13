package com.infoshare.academy.user;

import java.util.List;

public interface UsersRepositoryDao {
    void addUser(User user);
    User getUserById(int id);
    User getUserByLogin(String login);
    List<User> getUsersList();
    void updateUser(User user, String[] parameters);
    void deleteUserById(int id);
    void deleteUserByLogin(String login);
}
