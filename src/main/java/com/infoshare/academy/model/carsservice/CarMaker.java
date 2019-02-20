package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;
import com.infoshare.academy.model.cars.carEnum.BodyTypeEnum;
import com.infoshare.academy.model.cars.carEnum.ColorEnum;
import com.infoshare.academy.model.cars.carEnum.FuelSourceEnum;
import com.infoshare.academy.model.cars.carEnum.TransmissionEnum;
import com.infoshare.academy.model.cars.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMaker {

    public static void readCar() {
        List<Car> carCreated = createCarList();
        for (Car car : carCreated) {
            System.out.println(CarDescription.carDescription(car));
        }
    }

    public static void readCar(Integer id) {
        List<Car> carCreated = createCarList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(CarDescription.carDescription(car));
            }
        }
    }

    public static List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        StringBuilder carData = FileIO.readFile(FilePath.getCarPassengerData());
        String[] carLine = carData.toString().split("\\n");
        for (String s : carLine) {
            String[] carPart = s.split(",");
            Car carObject = returnCar(carPart);
            carList.add(carObject);
        }
        return carList;
    }

    public static Car returnCar(String[] carPart) {
        return new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]),
                Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]),
                ColorEnum.valueOf(carPart[7]), BodyTypeEnum.valueOf(carPart[8]), Integer.parseInt(carPart[9]),
                TransmissionEnum.valueOf(carPart[10]), Integer.parseInt(carPart[11]), Integer.parseInt(carPart[12]),
                Boolean.parseBoolean(carPart[13]), Integer.parseInt(carPart[14]), Boolean.parseBoolean(carPart[15]),
                Boolean.parseBoolean(carPart[16]),Boolean.parseBoolean(carPart[17]));
    }
}

