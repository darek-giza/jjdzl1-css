package com.infoshare.academy;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarReader;

public class MainCSVTest {
    public static void main(String[] args) {
        //Car Objects example
        CarReader.readCar();
        CarReader.readCar(1);
        CarReader.readCar(7);
    }
}
