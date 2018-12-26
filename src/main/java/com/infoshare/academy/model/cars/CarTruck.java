package com.infoshare.academy.model.cars;

public class CarTruck extends Car {

    protected Integer capacity;
    protected Integer cargoSpace;
    protected String lift;


    //Constructor
    public CarTruck(Integer id, String make, String model, Integer year, Integer mileage, FuelSource fuelSource, Integer enginePower, Integer capacity, Integer cargoSpace, String lift) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.lift = lift;
    }

    //Getters
    public Integer getCapacity() {
        return capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public String getLift() {
        return lift;
    }

    //Setters
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public void setLift(String lift) {
        this.lift = lift;
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
                ", lift='" + lift + '\'' +
                "} ";
    }
}
