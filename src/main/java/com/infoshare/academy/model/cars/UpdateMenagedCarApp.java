package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateMenagedCarApp {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(Car.class);
        conf.addAnnotatedClass(CarOffRoad.class);
        conf.addAnnotatedClass(CarTruck.class);

        SessionFactory sessionFactory = conf.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        Car car = session.get(Car.class, 307);
        car.setMake("Fiat");
        session.getTransaction().commit();

        System.out.println("Zaktualizowane dane samochodu: " + car);
        sessionFactory.close();
    }
}
