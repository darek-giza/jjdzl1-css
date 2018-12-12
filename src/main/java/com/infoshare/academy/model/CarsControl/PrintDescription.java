package com.infoshare.academy.model.CarsControl;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarOffRoad;
import com.infoshare.academy.model.cars.CarPassenger;
import com.infoshare.academy.model.cars.CarTruck;

public class PrintDescription {

    public static String carDescription(Car car) {
        String description = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s", car.getId(), car.getMake(), car.getModel(), car.getYear(), car.getFuelSource(), car.getPower(), car.getMileage());

        System.out.println(description);
        return description;
    }

    public static String carPassengerDescription(CarPassenger carPassenger) {
        String descriptionPassenger = String.format("Samochód nr %s: %s %s, " +
                "rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s," +
                " typ: %s, przeznaczenie: %s, ilość miejsc: %s,skrzynia biegów; %s", carPassenger.getId(), carPassenger.getMake(), carPassenger.getModel(), carPassenger.getYear(), carPassenger.getFuelSource(), carPassenger.getPower(), carPassenger.getMileage(), carPassenger.getType(), carPassenger.getDestiny(), carPassenger.getSeats(), carPassenger.getTransmission());

        System.out.println(descriptionPassenger);
        return descriptionPassenger;
    }

    public static String carOffRosdDescription(CarOffRoad carOffRoad) {
        String descriptionOffRoad = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s,liczba miejsc: %s,napęd: %s,wyciągarka: %s, bagażnik: %s ", carOffRoad.getId(), carOffRoad.getMake(), carOffRoad.getModel(), carOffRoad.getYear(), carOffRoad.getFuelSource(), carOffRoad.getPower(), carOffRoad.getMileage(), carOffRoad.getSeats(), carOffRoad.getDrive(), carOffRoad.getWinch(), carOffRoad.getTrunk());
        System.out.println(descriptionOffRoad);
        return descriptionOffRoad;
    }

    public static String carTruckDescription(CarTruck carTruck) {
        String descriptionTruck = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s,przebieg: %s, ładowność: %s, przestrzeń ładunkowa: %s, winda: %s "
                , carTruck.getId(), carTruck.getMake(), carTruck.getModel(), carTruck.getYear(), carTruck.getFuelSource(), carTruck.getPower(), carTruck.getMileage(), carTruck.getCapacity(), carTruck.getCargoSpace(), carTruck.getLift());
        System.out.println(descriptionTruck);
        return descriptionTruck;
    }

}
