package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveUserApp {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        User user = new User();
        user.setLogin("darek");
        user.setPassword("0000");
        user.setEmail("darek@op.pl");
        user.setPhoneNumber((long) 772123124);
        user.setFirstName("Darek");
        user.setLastName("Giza");
        user.setAdult(true);
        user.setAddress(new Address("Al. Królewska 41","20-121","Lublin"));


        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        sessionFactory.close();

    }
}
