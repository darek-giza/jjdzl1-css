package com.infoshare.academy;

import com.infoshare.academy.database.HibernateConf;
import com.infoshare.academy.user.Address;
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

        User user1 = new User(null,"macek123","ajg17h","fkakg1,macek@gmail.com",9421999l,"Macek","Korub",true, new Address("Chopina","20-100","Lublin"));
        User user2= new User(null,"gacek123","fdsa17h","fkakg1,macek@gmail.com",9421999l,"Macek","Korub",true, new Address("Chopina","20-100","Lublin"));
        usersRepo.addUser(user2);
//        usersRepo.deleteUserById(4);

        List<User> usersList2 = usersRepo.getUsersList();
        for (User user : usersList2) {
            System.out.println(user.toString());
        }

        HibernateConf.getSessionFactory().close();

    }
}
