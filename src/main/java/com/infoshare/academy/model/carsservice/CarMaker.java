package com.infoshare.academy.model.carsservice;

import com.infoshare.academy.iostream.FileIO;
import com.infoshare.academy.iostream.FilePath;
import com.infoshare.academy.model.cars.*;

import java.util.ArrayList;
import java.util.List;

public class CarMaker {

    //Methods to read created Cars - all at once or by ID

    public static void readCar() {
        List<Car> carCreated = createCarList();
        for (Car car : carCreated){
            System.out.println(CarDescription.carDescription(car));
        }
    }

/*    public static void readCar() {
        List<Car> carCreated = createCarList();
        System.out.println(carCreated);
    }*/

    public static void readCar(Integer id) {
        List<Car> carCreated = createCarList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(CarDescription.carDescription(car));
            }
        }
    }

/*    public static void readCar(Integer id) {
        List<Car> carCreated = createCarList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(car);
            }
        }
    }*/

    public static void readCarPassenger() {
        List<CarPassenger> carCreated = createCarPassengerList();
        System.out.println(carCreated);
    }

    public static void readCarPassenger(Integer id) {
        List<CarPassenger> carCreated = createCarPassengerList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(car);
            }
        }
    }

    public static void readCarOffRoad() {
        List<CarOffRoad> carCreated = createCarOffRoadList();
        System.out.println(carCreated);
    }

    public static void readCarOffRoad(Integer id) {
        List<CarOffRoad> carCreated = createCarOffRoadList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(car);
            }
        }
    }

    public static void readCarTruck() {
        List<CarTruck> carCreated = createCarTruckList();
        System.out.println(carCreated);
    }

    public static void readCarTruck(Integer id) {
        List<CarTruck> carCreated = createCarTruckList();
        for (Car car : carCreated) {
            if (car.getId().equals(id)) {
                System.out.println(car);
            }
        }
    }

    //Methods to create list of Car objects
    public static List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        StringBuilder carData = FileIO.readFile(FilePath.getCarData());
        String[] carLine = carData.toString().split("\\n");
        for (String s : carLine) {
            String[] carPart = s.split(",");
            Car carObject = returnCar(carPart);
            carList.add(carObject);
        }
        return carList;
    }

    public static List<CarPassenger> createCarPassengerList() {
        List<CarPassenger> carList = new ArrayList<>();
        StringBuilder carData = FileIO.readFile(FilePath.getCarPassengerData());
        String[] carLine = carData.toString().split("\\n");
        for (String s : carLine) {
            String[] carPart = s.split(",");
            CarPassenger carObject = returnCarPassenger(carPart);
            carList.add(carObject);
        }
        return carList;
    }

    public static List<CarOffRoad> createCarOffRoadList() {
        List<CarOffRoad> carList = new ArrayList<>();
        StringBuilder carData = FileIO.readFile(FilePath.getCarOffRoadData());
        String[] carLine = carData.toString().split("\\n");
        for (String s : carLine) {
            String[] carPart = s.split(",");
            CarOffRoad carObject = returnCarOffRoad(carPart);
            carList.add(carObject);
        }
        return carList;
    }

    public static List<CarTruck> createCarTruckList() {
        List<CarTruck> carList = new ArrayList<>();
        StringBuilder carData = FileIO.readFile(FilePath.getCarTruckData());
        String[] carLine = carData.toString().split("\\n");
        for (String s : carLine) {
            String[] carPart = s.split(",");
            CarTruck carObject = returnCarTruck(carPart);
            carList.add(carObject);
        }
        return carList;
    }

    //Methods to return Car objects from String line
    public static Car returnCar(String[] carPart) {
        return new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]));
    }

    public static CarPassenger returnCarPassenger(String[] carPart) {
        return new CarPassenger(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]), ColorEnum.valueOf(carPart[7]), BodyTypeEnum.valueOf(carPart[8]), Integer.parseInt(carPart[9]), TransmissionEnum.valueOf(carPart[10]));
    }

    public static CarOffRoad returnCarOffRoad(String[] carPart) {
        return new CarOffRoad(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]), Integer.parseInt(carPart[7]), Integer.parseInt(carPart[8]), Boolean.parseBoolean(carPart[9]), Boolean.parseBoolean(carPart[10]));
    }

     public static CarTruck returnCarTruck(String[] carPart) {
        return new CarTruck(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]), Integer.parseInt(carPart[7]), Integer.parseInt(carPart[8]), Boolean.parseBoolean(carPart[9]));
    }
}

    /*DEPRECATED METHODS:
        public static List<Car> createCar2() {
            List<Car> carList = new ArrayList<>();
            StringBuilder carData = FileIO.readFile(FilePath.getCarData());
            String[] carLine = carData.toString().split("\\n");
            for (String s : carLine) {
                String[] carPart = s.split(",");
                Car carCreated = new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6]));
                carList.add(carCreated);
            }
            return carList;
        }

    public static List<Car> createCar() {
        List<Car> carList = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(FilePath.getCarData())) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] carPart = line.split(",");
                Car carCreated = (new Car(Integer.parseInt(carPart[0]), carPart[1], carPart[2], Integer.parseInt(carPart[3]), Integer.parseInt(carPart[4]), FuelSourceEnum.valueOf(carPart[5]), Integer.parseInt(carPart[6])));
                carList.add(carCreated);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        }
        return carList;
    }*/
