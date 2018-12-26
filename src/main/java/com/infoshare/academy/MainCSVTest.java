package com.infoshare.academy;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;
import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.CarReader;

import java.nio.file.Paths;

public class MainCSVTest {
    public static void main(String[] args) {
        //Car Objects example
/*        CarReader.readCar();
        CarReader.readCar(1);
        CarReader.readCar(7);
        System.out.println(FileIO.readFile(FilePath.getCarData()));
        System.out.println(FileIO.readLine(FilePath.getCarData(),1));*/
        CarReader.readCarPassenger();

    }
}
