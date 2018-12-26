package com.infoshare.academy;

import com.infoshare.academy.model.carsservice.CarMaker;

public class MainCSVTest {
    public static void main(String[] args) {

        //Example usage of CarMaker Class:
        System.out.println("*Pokaż samochód z klasy Car o id=5");
        CarMaker.readCar(5);
        System.out.println("*Pokaż samochód z klasy CarPassenger o id=108");
        CarMaker.readCarPassenger(108);
        System.out.println("*Pokaż listę samochodów z klasy Car");
        CarMaker.readCar();

    }
}
