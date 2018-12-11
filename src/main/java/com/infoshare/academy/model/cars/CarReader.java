package com.infoshare.academy.model.cars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarReader {

    public static void readCar() throws NumberFormatException {
        Car carCreated = createCar();
        System.out.println(carCreated);
    }

    public static Car createCar() {
        Car carCreated = new Car();

        Path path = Paths.get("src/main/resources/carData.csv");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] carPart = line.split(",");
                Car carCreated1 = (new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), carPart[4], Integer.parseInt(carPart[5]), Integer.parseInt(carPart[6])));
                return carCreated1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e){
            System.out.println("Błąd we/wy @" + e);
        }
        return carCreated;
    }
}
