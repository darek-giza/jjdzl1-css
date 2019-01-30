package com.infoshare.academy;

import com.infoshare.academy.database.CarsDAO;
import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.carsservice.CarDescription;

import java.util.List;

public class MainDBTest {
    public static void main(String[] args) {
        CarsDAO carsDAO = new CarsDAO();

        List<Car> cars = carsDAO.getCarList();
        for (Car car : cars){
            System.out.println(CarDescription.carDescription(car));
        }

    }
}