package com.infoshare.academy.user;

import com.infoshare.academy.database.HibernateConf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {

    SessionFactory sessionFactory = HibernateConf.getSessionFactory();

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user = session.createQuery("Select u FROM User u WHERE id='" + id + "'", User.class).getSingleResult();
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public List<User> getUsersList() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<User> usersList = session.createQuery("Select u FROM User u", User.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return usersList;
    }

    @Override
    public void updateUser(User user, String[] parameters) {

    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public void deleteUserByLogin(String login) {

    }
}
