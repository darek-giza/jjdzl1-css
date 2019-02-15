package com.infoshare.academy.database;

import com.infoshare.academy.model.cars.CarOffRoad;
import com.infoshare.academy.model.cars.CarTruck;
import com.infoshare.academy.model.cars.entity.Car;
import com.infoshare.academy.user.Address;
import com.infoshare.academy.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConf {
    public static SessionFactory getSessionFactory() {
        //stworzenie obiektu Configuration
        Configuration conf = new Configuration();
        //wczytanie pliku konfiguracyjnego
        conf.configure("hibernate.cfg.xml");
        //wczytanie adnotacji
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Address.class);
        conf.addAnnotatedClass(Car.class);
        conf.addAnnotatedClass(CarOffRoad.class);
        conf.addAnnotatedClass(CarTruck.class);
        //stworzenie obiektu SessionFactory
        SessionFactory sessionFactory = conf.buildSessionFactory();
        //pobranie sesji
        Session session = sessionFactory.getCurrentSession();
        return sessionFactory;
    }

}
