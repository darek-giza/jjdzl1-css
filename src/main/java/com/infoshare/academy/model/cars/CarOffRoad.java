package com.infoshare.academy.model.cars;

public class CarOffRoad extends Car {

    protected Integer seats;
    protected Integer drive;
    protected Boolean haveWinch;
    protected Boolean haveTrunk;

    //Constructor
    public CarOffRoad(Integer id, String make, String model, Integer year, Integer mileage, FuelSource fuelSource, Integer enginePower, Integer seats, Integer drive, Boolean winch, Boolean trunk) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.seats = seats;
        this.drive = drive;
        this.haveWinch = winch;
        this.haveTrunk = trunk;
    }

    //Getters
    public Integer getSeats() {
        return seats;
    }

    public Integer getDrive() {
        return drive;
    }

    public Boolean getHaveWinch() {
        return haveWinch;
    }

    public Boolean getHaveTrunk() {
        return haveTrunk;
    }

    //Setters
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public void setHaveWinch(Boolean haveWinch) {
        this.haveWinch = haveWinch;
    }

    public void setHaveTrunk(Boolean haveTrunk) {
        this.haveTrunk = haveTrunk;
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
                ", fuelSource=" + fuelSource +
                ", enginePower=" + enginePower +
                ", seats=" + seats +
                ", drive=" + drive +
                ", haveWinch='" + haveWinch + '\'' +
                ", haveTrunk='" + haveTrunk + '\'' +
                "} ";
    }
}
