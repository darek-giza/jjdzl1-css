package com.infoshare.academy.user;


import org.hibernate.Session;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.jws.soap.SOAPBinding;
import java.util.List;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

@Named
@RequestScoped
public class UsersRepositoryDaoBean implements UsersRepositoryDao {

    @Override
    public void addUser(User user) {
        Session session = getSession();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User getUserById(int id) {
        Session session = getSession();
        User user = session.createQuery("Select u FROM User u WHERE id='" + id + "'", User.class).getSingleResult();
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User getUserByLogin(String login) {
        Session session = getSession();
        User user = (User) session.createQuery("Select u FROM User u WHERE login='" + login + "'", User.class).getSingleResult();
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public List<User> getUsersList() {
        Session session = getSession();
        List<User> usersList = session.createQuery("Select u FROM User u", User.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return usersList;
    }

    @Override
    public void updateUser(User user, String[] parameters){
        // TODO: 17.02.19 implement updating user settings
    }

    @Override
    public void deleteUserById(int id) {
        Session session = getSession();
        User user = session.createQuery("Select u FROM User u WHERE id ='" + id + "'", User.class).getSingleResult();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteUserByLogin(String login) {
        Session session = getSession();
        User user = session.createQuery("Select u FROM User u WHERE login ='" + login + "'", User.class).getSingleResult();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }
}