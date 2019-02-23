package com.infoshare.academy.user;

import java.time.LocalDate;
import java.util.List;

public interface UsersRepositoryDao {

    void addUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List getUsersList();

    void updateUser(Long id, String login, String password, String email, Long phoneNumber,
                    String firsName, String lastName, LocalDate birthDate,
                    String streetAddress, String postCode, String city);

    void deleteUserById(int id);

    void deleteUserByLogin(String login);
}
