package com.infoshare.academy.database;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.cars.FuelSourceEnum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarsDAO {
    Connection connection = null;

    public CarsDAO() {
        String url = "jdbc:mysql://localhost:9001/css";
        String user = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM car");

            while (resultSet.next()) {
                Car tempCar = new Car();
                tempCar.setId(resultSet.getInt("id"));
                tempCar.setMake(resultSet.getString("make"));
                tempCar.setModel(resultSet.getString("model"));
                tempCar.setYear(resultSet.getInt("year"));
                tempCar.setMileage(resultSet.getInt("mileage"));

                //tempCar.setFuelSourceEnum(FuelSourceEnum.getFuelEnum(resultSet.getString("fuelSourceEnum")));
                //nie rozpoznaje mi enuma fuel w bazie !!!!

                        cars.add(tempCar);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

}
