package com.infoshare.academy;

import com.infoshare.academy.model.cars.Color;
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

        //!Następne zadanie!
        //Użycie strumieni w celu pokazywania informacji o samochodach, przykłady (trzeba dodać Scanner itp.):
        System.out.println("*Użycie strumieni - pokaż samochody marki 'BMW'");
        carStreamMake();
        System.out.println("*Użycie strumieni - pokaż samochody koloru 'czarnego'");
        carStreamColor();
    }

    public static void carStreamMake() {
        CarMaker.createCarPassengerList().stream()
                .filter(Car -> Car.getMake().equals("BMW"))
                .map(Car -> "Znaleziono samochód o id=" + Car.getId() + ": "+ Car.getMake() + " " + Car.getModel() + ", rok produkcji: " + Car.getYear())
                .forEach(System.out::println);
    }

    public static void carStreamColor() {
        CarMaker.createCarPassengerList().stream()
                .filter(CarPassenger -> CarPassenger.getColor().equals(Color.BLACK))
                .map(CarPassenger -> "Znaleziono samochód o id=" +CarPassenger.getId() + ": "+ CarPassenger.getMake() + " " + CarPassenger.getModel() + ", rok produkcji: " + CarPassenger.getYear())
                .forEach(System.out::println);
    }
}
