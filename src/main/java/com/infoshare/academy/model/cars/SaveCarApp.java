package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveCarApp {
    public static void main(String[] args) {
        //stworzenie obiektu Configuration
        Configuration conf = new Configuration();
        //wczytanie pliku konfiguracyjnego
        conf.configure("hibernate.cfg.xml");
        //wczytanie adnotacji
        conf.addAnnotatedClass(Car.class);
        //stworzenie obiektu SessionFactory
        SessionFactory sessionFactory = conf.buildSessionFactory();
        //pobranie sesji
        Session session = sessionFactory.getCurrentSession();
        //stworzenie obiektu
        Car car = new Car();
        car.setCarType(1);
        car.setMake("Mazda");
        car.setModel("6");
        car.setYear(2001);
        car.setMileage(125000);
        car.setFuelSource(FuelSourceEnum.DIESEL);
        car.setEnginePower(125);
        car.setColor(ColorEnum.RED);
        car.setBodyType(BodyTypeEnum.TOURING);
        car.setSeats(5);
        car.setTransmission(TransmissionEnum.MANUAL);
        //rozpoczecie transakcji
        session.beginTransaction();
        //zapisanie samochodu
        session.save(car);
        //zakonczenie transakcji
        session.getTransaction().commit();
        //zamkniecie obiektu SessionFatory
        sessionFactory.close();
    }
}
