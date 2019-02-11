package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class CarOffRoad extends Car {

    @Column(name = "drive")
    protected Integer drive;
    @Column(name = "has_winch")
    protected Boolean hasWinch;
    @Column(name = "has_trunk")
    protected Boolean hasTrunk;

    //Constructor
    public CarOffRoad(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, ColorEnum colorEnum, BodyTypeEnum bodyTypeEnum, Integer seats, TransmissionEnum transmissionEnum, Integer drive, Boolean hasWinch, Boolean hasTrunk) {
        super(id, make, model, year, mileage, fuelSourceEnum, enginePower, colorEnum, bodyTypeEnum, seats, transmissionEnum);
        this.drive = drive;
        this.hasWinch = hasWinch;
        this.hasTrunk = hasTrunk;
    }
    //Getters

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
                "drive=" + drive +
                ", hasWinch=" + hasWinch +
                ", hasTrunk=" + hasTrunk +
                ", id=" + id +
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

