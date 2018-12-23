package com.infoshare.academy.model.cars;

public class Car implements Vehicle {

    protected Integer id;
    protected Boolean isReserved;
    protected String make;
    protected String model;
    protected Integer year;
    protected Integer mileage;
    protected Enum fuelSource;
    protected Integer enginePower;

    //Constructor
    public Car(Integer id, Boolean isReserved, String make, String model, Integer year, Integer mileage, Enum fuelSource, Integer enginePower) {
        this.id = id;
        this.isReserved = isReserved;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelSource = fuelSource;
        this.enginePower = enginePower;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public Boolean getReserved() {
        return isReserved;
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

    public Enum getFuelSource() {
        return fuelSource;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
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

    public void setFuelSource(Enum fuelSource) {
        this.fuelSource = fuelSource;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    //Methods
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", isReserved=" + isReserved +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSource=" + fuelSource +
                ", enginePower=" + enginePower +
                '}';
    }

    @Override
    public void checkIfReserved() {
        if (this.isReserved) {
            System.out.println("Vehicle id=" + getId() + " is not available.");
        } else {
            System.out.println("Vehicle id=" + getId() + " is available.");
        }
    }
}
