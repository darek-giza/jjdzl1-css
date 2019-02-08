package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetCarApp {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Car.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        //rozpoczecie transakcji
        session.beginTransaction();
        List<Car> listFromCar = session.createQuery("from Car").getResultList();
        for (Car car : listFromCar) {
            System.out.println(car);
        }
        //zakonczenie transakcji
        session.getTransaction().commit();
        //zamkniecie obiektu SessionFactory
        sessionFactory.close();
    }
}
