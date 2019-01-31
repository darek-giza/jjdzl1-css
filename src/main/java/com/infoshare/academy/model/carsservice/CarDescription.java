package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarOffRoad;
import com.infoshare.academy.model.cars.CarPassenger;
import com.infoshare.academy.model.cars.CarTruck;

public class CarDescription {

    //Show full description for chosen car type (returns String)
    public static String carDescription(Car car) {
        String description=String.format("id="+car.getId()+"   "+car.getMake()+" "+car.getModel())+" "+car.getYear()+" "+car.getFuelSourceEnum();
        //
        //String description = String.format("Samochód o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm", car.getId(), car.getMake(), car.getModel(), car.getYear(), car.getFuelSourceEnum().getFuel(), car.getEnginePower(), car.getMileage());
        //
        return description;
    }

    public static String carPassengerDescription(CarPassenger carPassenger) {
        String descriptionPassenger = String.format("Samochód osobowy o id=%s: %s %s, " +
                "rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm," +
                " typ: %s, kolor: %s, ilość miejsc: %s, skrzynia biegów: %s", carPassenger.getId(), carPassenger.getMake(), carPassenger.getModel(), carPassenger.getYear(), carPassenger.getFuelSourceEnum().getFuel(), carPassenger.getEnginePower(), carPassenger.getMileage(), carPassenger.getBodyTypeEnum().getMessage(), carPassenger.getColorEnum().getColor(), carPassenger.getSeats(), carPassenger.getTransmissionEnum().getTransmission());
        return descriptionPassenger;
    }

    public static String carOffRoadDescription(CarOffRoad carOffRoad) {
        String descriptionOffRoad = String.format("Samochód terenowy o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm, liczba miejsc: %s, napęd na koła: %s, wciągarka: %s, bagażnik: %s ", carOffRoad.getId(), carOffRoad.getMake(), carOffRoad.getModel(), carOffRoad.getYear(), carOffRoad.getFuelSourceEnum().getFuel(), carOffRoad.getEnginePower(), carOffRoad.getMileage(), carOffRoad.getSeats(), carOffRoad.getDrive(), carOffRoad.getHasWinch(), carOffRoad.getHasTrunk());
        return descriptionOffRoad;
    }

    public static String carTruckDescription(CarTruck carTruck) {
        String descriptionTruck = String.format("Samochód ciężarowy o id=%s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %sKM, przebieg: %skm, ładowność: %skg, przestrzeń ładunkowa: %sm3, winda: %s "
                , carTruck.getId(), carTruck.getMake(), carTruck.getModel(), carTruck.getYear(), carTruck.getFuelSourceEnum().getFuel(), carTruck.getEnginePower(), carTruck.getMileage(), carTruck.getCapacity(), carTruck.getCargoSpace(), carTruck.getHasLift());
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
                .map(CarTruck -> "Samochód ciężarowy o id=" + CarTruck.getId() + ": " + CarTruck.getMake() + " " + CarTruck.getModel() + ", rok produkcji: " + CarTruck.getYear())
                .forEach(System.out::println);
    }
}
