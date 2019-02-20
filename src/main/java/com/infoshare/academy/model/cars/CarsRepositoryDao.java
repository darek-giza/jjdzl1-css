package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;

import java.util.List;

public interface CarsRepositoryDao {
    void addCar(Car car);
    List getCarsById();
    void updateCar(Car car, String[] parameters);
    void deleteCarById(int id);
    void deleteCarBy(String login);
}
