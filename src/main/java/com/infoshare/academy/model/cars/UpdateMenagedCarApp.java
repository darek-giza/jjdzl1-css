package com.infoshare.academy.model.cars;

import com.infoshare.academy.database.HibernateConf;
import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateMenagedCarApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConf.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        Car car = session.get(Car.class, 307);
        car.setMake("Fiat");
        session.getTransaction().commit();

        System.out.println("Zaktualizowane dane samochodu: " + car);
        sessionFactory.close();
    }
}
