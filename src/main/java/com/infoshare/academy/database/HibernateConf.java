package com.infoshare.academy.database;

import com.infoshare.academy.user.Address;
import com.infoshare.academy.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConf {
    public static SessionFactory getSessionFactory() {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Address.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        return sessionFactory;
    }

}
