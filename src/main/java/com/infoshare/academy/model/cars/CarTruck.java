package com.infoshare.academy.model.cars;

public class CarTruck extends Car {

    protected Integer capacity;
    protected Integer cargoSpace;
    protected String haveLift;


    //Constructor
    public CarTruck(Integer id, String make, String model, Integer year, Integer mileage, FuelSource fuelSource, Integer enginePower, Integer capacity, Integer cargoSpace, String haveLift) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.haveLift = haveLift;
    }

    //Getters
    public Integer getCapacity() {
        return capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public String getHaveLift() {
        return haveLift;
    }

    //Setters
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public void setHaveLift(String  haveLift) {
        this.haveLift = haveLift;
    }

    //Methods
    @Override
    public String toString() {
        return "CarTruck{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSource=" + fuelSource +
                ", enginePower=" + enginePower +
                ", capacity=" + capacity +
                ", cargoSpace=" + cargoSpace +
                ", haveLift='" + haveLift + '\'' +
                "} ";
    }
}
