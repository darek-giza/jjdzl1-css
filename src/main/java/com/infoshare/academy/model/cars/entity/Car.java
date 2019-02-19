package com.infoshare.academy.model.cars.entity;

import com.infoshare.academy.model.cars.*;

import javax.persistence.*;

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
    @Column(name = "is_reserved")
    protected Boolean isReserved;

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
        this.isReserved = isReserved;

    }

    //Getters
    public Integer getId() {
        return id;
    }

    public Integer getCarType() {
        return carType;
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

    public ColorEnum getColor() {
        return color;
    }

    public BodyTypeEnum getBodyType() {
        return bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public Boolean getReserved() {
        return isReserved;
    }


    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
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

    public void setReserved(Boolean reserved) {
        this.isReserved = reserved;
    }

    //Methods


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
                ", isReserved=" + isReserved +
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

