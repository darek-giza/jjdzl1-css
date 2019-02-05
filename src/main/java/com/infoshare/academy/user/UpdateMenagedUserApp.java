package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateMenagedUserApp {

    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        User user = session.get(User.class,4);
        user.setEmail("darek_giza@op.pl");
        session.getTransaction().commit();
        System.out.println("Zaktualizowane dane użytkownika: " + user);
        sessionFactory.close();

    }
}

