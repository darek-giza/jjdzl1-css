package com.infoshare.academy.model.cars;

public class Car implements Vehicle {

    protected Integer id;
    //    protected Boolean isReserved;
    protected String make;
    protected String model;
    protected Integer year;
    protected Integer mileage;
    protected FuelSourceEnum fuelSource;
    protected Integer enginePower;
    protected ColorEnum color;
    protected BodyTypeEnum bodyType;
    protected Integer seats;
    protected TransmissionEnum transmission;

    //Constructor
    public Car() {
    }

    public Car(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSource, Integer enginePower, ColorEnum color, BodyTypeEnum bodyType, Integer seats, TransmissionEnum transmission) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelSource = fuelSource;
        this.enginePower = enginePower;
        this.color = color;
        this.bodyType = bodyType;
        this.seats = seats;
        this.transmission = transmission;
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

    public FuelSourceEnum getFuelSource() {
        return fuelSource;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public ColorEnum getColor() { return color; }

    public BodyTypeEnum getBodyType() { return bodyType; }

    public Integer getSeats() { return seats; }

    public TransmissionEnum getTransmission() { return transmission; }

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

    public void setFuelSource(FuelSourceEnum fuelSource) {
        this.fuelSource = fuelSource;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setBodyType(BodyTypeEnum bodyType) {
        this.bodyType = bodyType;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
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
                ", fuelSource=" + fuelSource +
                ", enginePower=" + enginePower +
                ", color=" + color +
                ", bodyType=" + bodyType +
                ", seats=" + seats +
                ", transmission=" + transmission +
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

