package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;
import org.hibernate.Session;
import java.util.List;
import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

public class CarRepositoryDaoBeen implements CarsRepositoryDao {

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }

    @Override
    public void addCar(Car car) {

    }

    @Override
    public List getCarsById() {
        return null;
    }

    @Override
    public void updateCar(Car car, String[] parameters) {
//        Session session = getSession();
//        Car car = session.get(Car.class, 307);
//        session.getTransaction().commit();
//        System.out.println("Dane samochodu: " + car);
//        car.setMake("Opel");
//        session.update(car);
//        session.getTransaction().commit();
//
//        System.out.println("Zaktualizowane dane samochodu: " + car);
    }

    @Override
    public void deleteCarById(int id) {
        Session session = getSession();
        Car car = session.get(Car.class, 307);
        session.delete(car);
        session.getTransaction().commit();

    }

    @Override
    public void deleteCarByLogin(String login) {
        Session session = getSession();
        Car car = session.get(Car.class, 307);
        session.delete(car);
        session.getTransaction().commit();
    }
}
