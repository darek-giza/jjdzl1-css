package com.infoshare.academy.model.cars.entity;

import com.infoshare.academy.model.cars.*;
import com.infoshare.academy.model.cars.carEnum.BodyTypeEnum;
import com.infoshare.academy.model.cars.carEnum.ColorEnum;
import com.infoshare.academy.model.cars.carEnum.FuelSourceEnum;
import com.infoshare.academy.model.cars.carEnum.TransmissionEnum;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car implements Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    protected Integer id;
    @Column(name = "car_type")
    protected Integer carType;
    @Column(name = "make")
    protected String make;
    @Column(name = "model")
    protected String model;
    @Column(name = "year")
    protected Integer year;
    @Column(name = "mileage")
    protected Integer mileage;
    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_source")
    protected FuelSourceEnum fuelSource;
    @Column(name = "engine_power")
    protected Integer enginePower;
    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    protected ColorEnum color;
    @Enumerated(EnumType.STRING)
    @Column(name = "body_type")
    protected BodyTypeEnum bodyType;
    @Column(name = "seats")
    protected Integer seats;
    @Enumerated(EnumType.STRING)
    @Column(name = "transmission")
    protected TransmissionEnum transmission;
    @Column(name = "capacity")
    protected Integer capacity;
    @Column(name = "cargo_space")
    protected Integer cargoSpace;
    @Column(name = "has_lift")
    protected Boolean hasLift;
    @Column(name = "drive")
    protected Integer drive;
    @Column(name = "has_winch")
    protected Boolean hasWinch;
    @Column(name = "has_trunk")
    protected Boolean hasTrunk;
    @Column(name = "is_reserved")
    protected Boolean isReserved;

    public Car() {
    }

    public Car(Integer carType, String make, String model, Integer year, Integer mileage,
               FuelSourceEnum fuelSource, Integer enginePower, ColorEnum color, BodyTypeEnum bodyType,
               Integer seats, TransmissionEnum transmission, Integer capacity, Integer cargoSpace,
               Boolean hasLift, Integer drive, Boolean hasWinch, Boolean hasTrunk, Boolean isReserved) {
        this.carType = carType;
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
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.hasLift = hasLift;
        this.drive = drive;
        this.hasWinch = hasWinch;
        this.hasTrunk = hasTrunk;
        this.isReserved = isReserved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public FuelSourceEnum getFuelSource() {
        return fuelSource;
    }

    public void setFuelSource(FuelSourceEnum fuelSource) {
        this.fuelSource = fuelSource;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public BodyTypeEnum getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyTypeEnum bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public Boolean getHasLift() {
        return hasLift;
    }

    public void setHasLift(Boolean hasLift) {
        this.hasLift = hasLift;
    }

    public Integer getDrive() {
        return drive;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public Boolean getHasWinch() {
        return hasWinch;
    }

    public void setHasWinch(Boolean hasWinch) {
        this.hasWinch = hasWinch;
    }

    public Boolean getHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(Boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carType=" + carType +
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
                ", capacity=" + capacity +
                ", cargoSpace=" + cargoSpace +
                ", hasLift=" + hasLift +
                ", drive=" + drive +
                ", hasWinch=" + hasWinch +
                ", hasTrunk=" + hasTrunk +
                ", isReserved=" + isReserved +
                '}';
    }
}


