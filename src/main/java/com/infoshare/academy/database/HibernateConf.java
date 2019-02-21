package com.infoshare.academy.database;

import com.infoshare.academy.car.Car;
import com.infoshare.academy.reservation.Reservation;
import com.infoshare.academy.user.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConf {

    private static SessionFactory sessionFactory = sessionFactory();

    public static SessionFactory sessionFactory() {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Reservation.class);
        conf.addAnnotatedClass(Car.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        return sessionFactory;
    }

    public static synchronized SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
