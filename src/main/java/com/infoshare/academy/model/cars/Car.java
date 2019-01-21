package com.infoshare.academy.model.cars;

public class Car implements Vehicle {

    protected Integer id;
//    protected Boolean isReserved;
    protected String make;
    protected String model;
    protected Integer year;
    protected Integer mileage;
    protected FuelSourceEnum fuelSourceEnum;
    protected Integer enginePower;

    //Constructor
    public Car(){}
    public Car(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelSourceEnum = fuelSourceEnum;
        this.enginePower = enginePower;
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
                '}';
    }

/*    @Override
    public void checkIfReserved() {
        if (this.isReserved) {
            System.out.println("Vehicle id=" + getId() + " is not available.");
        } else {
            System.out.println("Vehicle id=" + getId() + " is available.");
        }
    }*/
}
