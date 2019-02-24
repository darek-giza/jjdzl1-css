package com.infoshare.academy.user;

import java.util.List;

public interface UsersRepositoryDao {

    void addUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List getUsersList();

    void updateUser();

    void deleteUserById(int id);

    void deleteUserByLogin(String login);
}
