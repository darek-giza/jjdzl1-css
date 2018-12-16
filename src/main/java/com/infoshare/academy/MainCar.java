package com.infoshare.academy;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarReader;

public class MainCar {
    public static void main(String[] args) {
        //Car Objects example
        Car car1 = new Car(2,"opel","vectra",2006,"diesel",80,180000);
        car1.carDescription();

        CarReader.readCar(3);
    }
}
