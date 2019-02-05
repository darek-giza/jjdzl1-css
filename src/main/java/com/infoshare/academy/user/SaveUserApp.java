package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveUserApp {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Users.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Users users = new Users();
        users.setLogin("darek");
        users.setEmail("darek@op.pl");
        users.setPassword("0000");
        users.setPhoneNumber((long) 100083053);
        users.setFirstName("Darek");
        users.setLastName("Giza");
        users.setAddress("Al.Królew");
        users.setHouseNumber(11);
        users.setParcelNumber(25);
        users.setPostCode("24-100");
        users.setCity("Puławy");
        users.setAdult(true);
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        sessionFactory.close();






    }
}
