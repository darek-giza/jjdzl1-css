package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetCarApp {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Car.class);
        conf.addAnnotatedClass(CarOffRoad.class);
        conf.addAnnotatedClass(CarTruck.class);
        SessionFactory sessionFactory = conf.buildSessionFactory();
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
