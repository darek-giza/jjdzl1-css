package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetUserApp {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        String from = "FROM User";
        Query query = session.createQuery(from);
        List<User> list = query.getResultList();
        for (User user : list) {
            System.out.println(user);
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
