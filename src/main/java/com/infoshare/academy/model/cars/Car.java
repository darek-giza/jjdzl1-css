package com.infoshare.academy.model.cars;

import java.sql.ResultSet;

public class Car implements Vehicle {

    protected Integer id;
    //    protected Boolean isReserved;
    protected String make;
    protected String model;
    protected Integer year;
    protected Integer mileage;
    protected FuelSourceEnum fuelSourceEnum;
    protected Integer enginePower;
    protected ColorEnum colorEnum;
    protected BodyTypeEnum bodyTypeEnum;
    protected Integer seats;
    protected TransmissionEnum transmissionEnum;

    //Constructor
    public Car() {
    }

    public Car(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, ColorEnum colorEnum, BodyTypeEnum bodyTypeEnum, Integer seats, TransmissionEnum transmissionEnum) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelSourceEnum = fuelSourceEnum;
        this.enginePower = enginePower;
        this.colorEnum = colorEnum;
        this.bodyTypeEnum = bodyTypeEnum;
        this.seats = seats;
        this.transmissionEnum = transmissionEnum;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public FuelSourceEnum getFuelSourceEnum() {
        return fuelSourceEnum;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public ColorEnum getColorEnum() { return colorEnum; }

    public BodyTypeEnum getBodyTypeEnum() { return bodyTypeEnum; }

    public Integer getSeats() { return seats; }

    public TransmissionEnum getTransmissionEnum() { return transmissionEnum; }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setFuelSourceEnum(FuelSourceEnum fuelSourceEnum) {
        this.fuelSourceEnum = fuelSourceEnum;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setBodyTypeEnum(BodyTypeEnum bodyTypeEnum) {
        this.bodyTypeEnum = bodyTypeEnum;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setTransmissionEnum(TransmissionEnum transmissionEnum) {
        this.transmissionEnum = transmissionEnum;
    }


    //Methods

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSourceEnum=" + fuelSourceEnum +
                ", enginePower=" + enginePower +
                ", colorEnum=" + colorEnum +
                ", bodyTypeEnum=" + bodyTypeEnum +
                ", seats=" + seats +
                ", transmissionEnum=" + transmissionEnum +
                '}';
    }


}





/*    @Override
    public void checkIfReserved() {
        if (this.isReserved) {
            System.out.println("Vehicle id=" + getId() + " is not available.");
        } else {
            System.out.println("Vehicle id=" + getId() + " is available.");
        }
    }*/

