package com.infoshare.academy.model.cars;

import com.infoshare.academy.iostream.FilePath;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CarReader {

    public static void readCar() throws NumberFormatException {
        List<Car> carCreated = createCar();
        System.out.println(carCreated);
    }

    public static void readCar(Integer id) throws NumberFormatException {
        List<Car> carCreated = createCar();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(car);
            }
        }

    }

    public static void readCarPassenger() {
        List<Car> carCreated = createCarPassenger();
        System.out.println(carCreated);
    }

    public static List<Car> createCar() {
        List<Car> carList = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(FilePath.getCarData())) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] carPart = line.split(",");
                Car carCreated = (new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSource.valueOf(carPart[5]), Integer.parseInt(carPart[6])));
                carList.add(carCreated);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        }
        return carList;
    }

    public static List<Car> createCarPassenger() {
        List<Car> carPassengerList = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(FilePath.getCarPassengerData())) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] carPart = line.split(",");
                Car carCreated = (new CarPassenger(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSource.valueOf(carPart[5]), Integer.parseInt(carPart[6]), Color.valueOf(carPart[7]), BodyType.valueOf(carPart[8]), Integer.parseInt(carPart[9]), Transmission.valueOf(carPart[10])));
                carPassengerList.add(carCreated);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        }
        return carPassengerList;
    }
}
