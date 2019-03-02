package com.infoshare.academy.car;

import com.infoshare.academy.menuEnum.BodyTypeEnum;
import com.infoshare.academy.menuEnum.ColorEnum;
import com.infoshare.academy.menuEnum.FuelSourceEnum;
import com.infoshare.academy.menuEnum.TransmissionEnum;
import com.infoshare.academy.reservation.Reservation;
import com.infoshare.academy.user.User;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.CharArrayReader;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.stream.Stream;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

@Stateless
public class CarRepositoryDaoBeen implements CarsRepositoryDao {

    private Integer id;

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }


    @Override
    public Car addCar(Car car) {
        Session session = getSession();
        session.save(car);
        session.getTransaction().commit();
        session.close();
        return car;
    }

    @Override
    public Stream<Car> list() {
        Session session = getSession();
        List<Car> carList = session.createQuery("Select c FROM Car c ").getResultList();
        session.getTransaction().commit();
        session.close();
        return (Stream<Car>) carList;

    }




    public Car getCar(Integer id) {
        Session session = getSession();
        Car getCarById = session.get(Car.class,id);
        session.getTransaction().commit();
        session.close();
        System.out.println(getCarById);
        return getCarById;
    }


    @Override
    public Car updateCarMileage(Integer id,Integer mileage) {
        Session session = getSession();
        Car updateCar = session.get(Car.class, id);
        updateCar.setMileage(mileage);
        session.getTransaction().commit();
        session.close();
        return updateCar;
    }


    @Override
    public void deleteCar(Integer id) {
        Session session = getSession();
        Car carToDelete = session.get(Car.class, id);
        session.delete(carToDelete);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Stream<Car> searchCar(Filter filter) {
        return null;
    }
}
