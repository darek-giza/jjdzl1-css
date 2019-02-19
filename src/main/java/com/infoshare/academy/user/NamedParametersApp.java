package com.infoshare.academy.user;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

@Named
@RequestScoped
public class NamedParametersApp {
    // TODO: 2019-02-18 this has to be implemented somwehere else (not with main class)

    public static void main(String[] args) {
        Session session = getSession();

        String userFirstName = "Darek";
        String userLastName = "Giza";
        String namedParametersString = "select u.firstName,u.lastName from User u where u.firstName=:firstName and u.lastName=:lastName";

        Query namedParametersQuery=session.createQuery(namedParametersString);
        namedParametersQuery.setParameter("firstName",userFirstName);
        namedParametersQuery.setParameter("lastName",userLastName);

        List<Object[]> result = namedParametersQuery.getResultList();
        for (Object[] values : result) {
            System.out.println("firstName: " + values[0]+ ", lastName: " + values[1]);
        }
        session.close();
    }

    private static Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }
}
