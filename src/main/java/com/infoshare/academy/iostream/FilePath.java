package com.infoshare.academy.iostream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath {
    //Collection of file locations
    private static Path carData = Paths.get("src/main/resources/carData.csv");
    private static Path carPassengerData = Paths.get("src/main/resources/carPassengerData.csv");

    //Getters
    public static Path getCarData() {
        return carData;
    }

    public static Path getCarPassengerData() {
        return carPassengerData;
    }
}
