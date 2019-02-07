package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class NamedParametersApp {

    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(User.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        String userFirstName = "Darek";
        String userLastName = "Giza";
        session.beginTransaction();
        String namedParametersString = "select u.firstName,u.lastName from User u where u.firstName=:firstName and u.lastName=:lastName";

        Query namedParametersQuery=session.createQuery(namedParametersString);
        namedParametersQuery.setParameter("firstName",userFirstName);
        namedParametersQuery.setParameter("lastName",userLastName);

        List<Object[]> result = namedParametersQuery.getResultList();
        for (Object[] values : result) {
            System.out.println("firstName: " + values[0]+ ",lastName: " + values[1]);
        }
    }
}
