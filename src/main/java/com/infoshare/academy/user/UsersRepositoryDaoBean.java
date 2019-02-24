package com.infoshare.academy.user;


import org.hibernate.Session;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;
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
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User getUserByLogin(String login) {
        Session session = getSession();
        User user = session.get(User.class, login);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public List<User> getUsersList() {
        Session session = getSession();
        List<User> usersList = session.createQuery("Select u FROM User u ").getResultList();
        session.getTransaction().commit();
        session.close();
        return usersList;
    }

    @Override
    public void updateUser(Long id, String login, String password, String email, Long phoneNumber,
                           String firsName, String lastName, LocalDate birthDate,
                           String streetAddress, String postCode, String city) {

        Session session = getSession();
        User user = session.get(User.class, id);
        if (user != null) {
            user.setLogin(login);
            user.setPassword(password);
            user.setEmail(email);
            user.setPhoneNumber(phoneNumber);
            user.setFirstName(firsName);
            user.setLastName(lastName);
            user.setBirthDate(birthDate);
            user.setStreetAddress(streetAddress);
            user.setPostCode(postCode);
            user.setCity(city);
        }
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public void deleteUserById(int id) {
        Session session = getSession();
        User user = session.get(User.class, id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteUserByLogin(String login) {
        Session session = getSession();
        User user = session.get(User.class, login);
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