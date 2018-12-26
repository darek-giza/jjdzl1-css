package com.infoshare.academy.model.cars;

public class CarOffRoad extends Car {

    protected Integer seats;
    protected Integer drive;
    protected String winch;
    protected String trunk;

    //Constructor
    public CarOffRoad(Integer id, String make, String model, Integer year, Integer mileage, FuelSource fuelSource, Integer enginePower, Integer seats, Integer drive, String winch, String trunk) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.seats = seats;
        this.drive = drive;
        this.winch = winch;
        this.trunk = trunk;
    }

    //Getters
    public Integer getSeats() {
        return seats;
    }

    public Integer getDrive() {
        return drive;
    }

    public String getWinch() {
        return winch;
    }

    public String getTrunk() {
        return trunk;
    }

    //Setters
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public void setWinch(String winch) {
        this.winch = winch;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
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
                ", winch='" + winch + '\'' +
                ", trunk='" + trunk + '\'' +
                "} ";
    }
}
