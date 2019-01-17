package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarOffRoad;
import com.infoshare.academy.model.cars.CarPassenger;
import com.infoshare.academy.model.cars.CarTruck;

public class CarDescription {

    //Show description for chosen car type (returns String)
    public static String carDescription(Car car) {
        String description = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s", car.getId(), car.getMake(), car.getModel(), car.getYear(), car.getFuelSource(), car.getEnginePower(), car.getMileage());
        return description;
    }

    public static String carPassengerDescription(CarPassenger carPassenger) {
        String descriptionPassenger = String.format("Samochód osobowy nr %s: %s %s, " +
                "rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s," +
                " typ: %s, kolor: %s, ilość miejsc: %s, skrzynia biegów; %s", carPassenger.getId(), carPassenger.getMake(), carPassenger.getModel(), carPassenger.getYear(), carPassenger.getFuelSource(), carPassenger.getEnginePower(), carPassenger.getMileage(), carPassenger.getBodyType(), carPassenger.getColor(), carPassenger.getSeats(), carPassenger.getTransmission());
        return descriptionPassenger;
    }

    public static String carOffRosdDescription(CarOffRoad carOffRoad) {
        String descriptionOffRoad = String.format("Samochód terenowy nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s, liczba miejsc: %s, napęd: %s, wyciągarka: %s, bagażnik: %s ", carOffRoad.getId(), carOffRoad.getMake(), carOffRoad.getModel(), carOffRoad.getYear(), carOffRoad.getFuelSource(), carOffRoad.getEnginePower(), carOffRoad.getMileage(), carOffRoad.getSeats(), carOffRoad.getDrive(), carOffRoad.getWinch(), carOffRoad.getTrunk());
        return descriptionOffRoad;
    }

    public static String carTruckDescription(CarTruck carTruck) {
        String descriptionTruck = String.format("Samochód ciężarowy nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s,przebieg: %s, ładowność: %s, przestrzeń ładunkowa: %s, winda: %s "
                , carTruck.getId(), carTruck.getMake(), carTruck.getModel(), carTruck.getYear(), carTruck.getFuelSource(), carTruck.getEnginePower(), carTruck.getMileage(), carTruck.getCapacity(), carTruck.getCargoSpace(), carTruck.getHaveLift());
        return descriptionTruck;
    }

    //Methods to show simple list of the car type
    public static void carPassengerList() {
        CarMaker.createCarPassengerList().stream()
                .map(CarPassenger -> "Samochód osobowy o id=" + CarPassenger.getId() + ": " + CarPassenger.getMake() + " " + CarPassenger.getModel() + ", rok produkcji: " + CarPassenger.getYear())
                .forEach(System.out::println);
    }

    public static void carOffRoadList() {
        CarMaker.createCarOffRoadList().stream()
                .map(CarOffRoad -> "Samochód terenowy o id=" + CarOffRoad.getId() + ": " + CarOffRoad.getMake() + " " + CarOffRoad.getModel() + ", rok produkcji: " + CarOffRoad.getYear())
                .forEach(System.out::println);
    }

    public static void carTruckList() {
        CarMaker.createCarTruckList().stream()
                .map(CarTruck -> "Samochód terenowy o id=" + CarTruck.getId() + ": " + CarTruck.getMake() + " " + CarTruck.getModel() + ", rok produkcji: " + CarTruck.getYear())
                .forEach(System.out::println);
    }
}
