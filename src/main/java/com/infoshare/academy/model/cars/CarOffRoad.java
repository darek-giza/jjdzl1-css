package com.infoshare.academy.model.cars;

public class CarOffRoad extends Car {

    protected Integer seats;
    protected Integer drive;
    protected Boolean hasWinch;
    protected Boolean hasTrunk;

    //Constructor
    public CarOffRoad(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, Integer seats, Integer drive, Boolean hasWinch, Boolean hasTrunk) {
        super(id, make, model, year, mileage, fuelSourceEnum, enginePower);
        this.seats = seats;
        this.drive = drive;
        this.hasWinch = hasWinch;
        this.hasTrunk = hasTrunk;
    }

    //Getters
    public Integer getSeats() {
        return seats;
    }

    public Integer getDrive() {
        return drive;
    }

    public Boolean getHasWinch() {
        return hasWinch;
    }

    public Boolean getHasTrunk() {
        return hasTrunk;
    }

    //Setters
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public void setHasWinch(Boolean hasWinch) {
        this.hasWinch = hasWinch;
    }

    public void setHasTrunk(Boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    //Methods
    @Override
    public String toString() {
        return "CarOffRoad{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSourceEnum=" + fuelSourceEnum +
                ", enginePower=" + enginePower +
                ", seats=" + seats +
                ", drive=" + drive +
                ", hasWinch='" + hasWinch + '\'' +
                ", hasTrunk='" + hasTrunk + '\'' +
                "} ";
    }
}
