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
        Session session=sessionFactory.getCurrentSession();
        User user = new User();
        user.setLogin("darek");
        user.setEmail("darek@op.pl");
        user.setPassword("0000");
        user.setPhoneNumber((long) 100083053);
        user.setFirstName("Darek");
        user.setLastName("Giza");
        user.setAddress("Al.Królew");
        user.setHouseNumber(11);
        user.setParcelNumber(25);
        user.setPostCode("24-100");
        user.setCity("Puławy");
        user.setAdult(true);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        sessionFactory.close();






    }
}
