/*
package com.infoshare.academy;
import com.infoshare.academy.menuEnum.*;
import com.infoshare.academy.car.Car;

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

            ResultSet resultSet = statement.executeQuery("SELECT * FROM cars");

            while (resultSet.next()) {
                Car tempCar = new Car();
                tempCar.setId(resultSet.getInt("car_id"));
                tempCar.setMake(resultSet.getString("make"));
                tempCar.setModel(resultSet.getString("model"));
                tempCar.setYear(resultSet.getInt("year"));
                tempCar.setMileage(resultSet.getInt("mileage"));
                tempCar.setFuelSource(FuelSourceEnum.getFuelEnum(resultSet.getString("fuel_source")));
                tempCar.setEnginePower(resultSet.getInt("engine_power"));
                tempCar.setColor(ColorEnum.getColorEnum(resultSet.getString("color")));
                tempCar.setBodyType(BodyTypeEnum.getBodyTypeEnum(resultSet.getString("body_type")));
                tempCar.setSeats(resultSet.getInt("seats"));
                tempCar.setTransmission(TransmissionEnum.getTransmissionEnum(resultSet.getString("transmission")));
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
*/
