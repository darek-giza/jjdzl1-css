package com.infoshare.academy.car;

import org.hibernate.Filter;

import java.util.stream.Stream;

public interface CarsRepositoryDao {
     Car addCar(Car car);
     Stream<Car> list();
     Car getCar(Integer id);
     Car updateCarMileage(Integer id,Integer mileage);
     void deleteCar(long id);
     Stream<Car> searchCar(Filter filter);
}
