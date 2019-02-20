package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.model.cars.entity.Car;

public class CarDescription {

    public static String carDescription(Car car) {
        String description = String.format("Samochód o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM," +
                " przebieg: %skm, color: %s, skrzynia biegów: %s, typ nadwozia: %s",
                car.getId(), car.getMake(), car.getModel(), car.getYear(), car.getFuelSource().getFuel(),
                car.getEnginePower(), car.getMileage(), car.getColor().getColor(),
                car.getTransmission().getTransmission(), car.getBodyType().getType());
        return description;
    }

    public static void carPassengerList() {
        CarMaker.createCarList().stream()
                .map(CarPassenger -> "Samochód osobowy o id=" + CarPassenger.getId() + ": " + CarPassenger.getMake() +
                        " " + CarPassenger.getModel() + ", rok produkcji: " + CarPassenger.getYear() + " " +
                        CarPassenger.getFuelSource())
                .forEach(System.out::println);
    }
}
