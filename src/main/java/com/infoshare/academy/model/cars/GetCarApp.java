package com.infoshare.academy.model.cars;

import com.infoshare.academy.database.HibernateConf;
import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class GetCarApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConf.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        //rozpoczecie transakcji
        session.beginTransaction();
        String from = "from Car";

        Query query = session.createQuery(from);
        List<Car> listFromCar = query.getResultList();
        for (Car car : listFromCar) {
            System.out.println(car);
        }
        //zakonczenie transakcji
        session.getTransaction().commit();
        //zamkniecie obiektu SessionFactory
        sessionFactory.close();
    }
}
