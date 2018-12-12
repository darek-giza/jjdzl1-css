package com.infoshare.academy.model.cars;

public class Car {

    protected Integer id;
    protected String make;
    protected String model;
    protected Integer year;
    protected Enum fuelSource;
    //protected String fuelSource;
    protected Integer power;
    protected Integer mileage;

    //Constructor
    public Car(Integer id, String make, String model, Integer year, Enum fuelSource, Integer power, Integer mileage) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelSource = fuelSource;
        this.power = power;
        this.mileage = mileage;
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

    public Enum getFuelSource() {
        return fuelSource;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getMileage() {
        return mileage;
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

    public void setFuelSource(Enum fuelSource) {
        this.fuelSource = fuelSource;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    //Methods

}
