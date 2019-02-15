package com.infoshare.academy.model.cars;

import com.infoshare.academy.database.HibernateConf;
import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDetachedCarApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConf.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        Car car = session.get(Car.class, 307);
        session.getTransaction().commit();
        System.out.println("Dane samochodu: " + car);
        car.setMake("Opel");

        //second transaction
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(car);
        session.getTransaction().commit();

        System.out.println("Zaktualizowane dane samochodu: " + car);
        sessionFactory.close();
    }
}
