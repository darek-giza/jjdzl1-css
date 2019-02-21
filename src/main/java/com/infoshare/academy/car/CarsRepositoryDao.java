package com.infoshare.academy.car;

import java.util.List;

public interface CarsRepositoryDao {
    void addCar(Car car);
    List getCarsById();
    void updateCar(Car car, String[] parameters);
    void deleteCarById(int id);
    void deleteCarByLogin(String login);
}
