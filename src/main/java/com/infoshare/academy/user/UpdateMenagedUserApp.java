package com.infoshare.academy.user;

import org.hibernate.Session;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

@Named
@RequestScoped
public class UpdateMenagedUserApp {
    // TODO: 2019-02-18 this has to be implemented somwehere else (not with main class)

    public static void main(String[] args) {
        Session session = getSession();

        User user = session.get(User.class,4);
        user.setEmail("darek_giza@op.pl");
        session.getTransaction().commit();
        System.out.println("Zaktualizowane dane użytkownika: " + user);
        session.close();

    }

    private static Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }
}

