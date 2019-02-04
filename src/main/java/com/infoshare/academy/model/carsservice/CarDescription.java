package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.model.cars.*;

public class CarDescription {

    //Show full description for chosen car type (returns String)
    public static String carDescription(Car car) {
        String description = String.format("Samochód o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm, color: %s, skrzynia biegów: %s, typ nadwozia: %s", car.getId(), car.getMake(), car.getModel(), car.getYear(), car.getFuelSource().getFuel(), car.getEnginePower(), car.getMileage(), car.getColor().getColor(),car.getTransmission().getTransmission(),car.getBodyType().getType());
        return description;
    }

    public static String carOffRoadDescription(CarOffRoad carOffRoad) {
        String descriptionOffRoad = String.format("Samochód terenowy o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm, liczba miejsc: %s, napęd na koła: %s, wciągarka: %s, bagażnik: %s ", carOffRoad.getId(), carOffRoad.getMake(), carOffRoad.getModel(), carOffRoad.getYear(), carOffRoad.getFuelSource().getFuel(), carOffRoad.getEnginePower(), carOffRoad.getMileage(), carOffRoad.getSeats(), carOffRoad.getDrive(), carOffRoad.getHasWinch(), carOffRoad.getHasTrunk());
        return descriptionOffRoad;
    }

    public static String carTruckDescription(CarTruck carTruck) {
        String descriptionTruck = String.format("Samochód ciężarowy o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm, ładowność: %skg, przestrzeń ładunkowa: %sm3, winda: %s "
                , carTruck.getId(), carTruck.getMake(), carTruck.getModel(), carTruck.getYear(), carTruck.getFuelSource().getFuel(), carTruck.getEnginePower(), carTruck.getMileage(), carTruck.getCapacity(), carTruck.getCargoSpace(), carTruck.getHasLift());
        return descriptionTruck;
    }

    //Methods to show simple list of the car type
    public static void carPassengerList() {
        CarMaker.createCarList().stream()
                .map(CarPassenger -> "Samochód osobowy o id=" + CarPassenger.getId() + ": " + CarPassenger.getMake() + " " + CarPassenger.getModel() + ", rok produkcji: " + CarPassenger.getYear() + " " + CarPassenger.getFuelSource())
                .forEach(System.out::println);
    }

    public static void carOffRoadList() {
        CarMaker.createCarOffRoadList().stream()
                .map(CarOffRoad -> "Samochód terenowy o id=" + CarOffRoad.getId() + ": " + CarOffRoad.getMake() + " " + CarOffRoad.getModel() + ", rok produkcji: " + CarOffRoad.getYear())
                .forEach(System.out::println);
    }

    public static void carTruckList() {
        CarMaker.createCarTruckList().stream()
                .map(CarTruck -> "Samochód ciężarowy o id=" + CarTruck.getId() + ": " + CarTruck.getMake() + " " + CarTruck.getModel() + ", rok produkcji: " + CarTruck.getYear())
                .forEach(System.out::println);
    }
}
