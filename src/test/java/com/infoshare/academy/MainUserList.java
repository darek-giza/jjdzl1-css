package com.infoshare.academy;

import com.infoshare.academy.database.HibernateConf;
import com.infoshare.academy.user.User;
import com.infoshare.academy.user.UsersRepositoryDaoBean;
import org.hibernate.Session;

import java.util.List;

public class MainUserList {
    public static void main(String[] args) {

        UsersRepositoryDaoBean usersRepo = new UsersRepositoryDaoBean();
        List<User> usersList = usersRepo.getUsersList();
        for (User user : usersList) {
            System.out.println(user.toString());
        }


        User userById = usersRepo.getUserById(1);
        System.out.println(userById);
        HibernateConf.getSessionFactory().close();

    }
}
