package com.infoshare.academy.model.cars;

public class CarPassenger extends Car {
    protected Enum color;
    protected Enum bodyType;
    protected Integer seats;
    protected Enum transmission;

    //Constructor
    public CarPassenger(Integer id, String make, String model, Integer year, Integer mileage, Enum fuelSource, Integer enginePower, Enum color, Enum bodyType, Integer seats, Enum transmission) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.color = color;
        this.bodyType = bodyType;
        this.seats = seats;
        this.transmission = transmission;
    }

    //Getters
    public Enum getColor() {
        return color;
    }

    public Enum getBodyType() {
        return bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public Enum getTransmission() {
        return transmission;
    }

    //Setters
    public void setColor(Enum color) {
        this.color = color;
    }

    public void setBodyType(Enum bodyType) {
        this.bodyType = bodyType;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setTransmission(Enum transmission) {
        this.transmission = transmission;
    }

    //Methods
    @Override
    public String toString() {
        return "CarPassenger{" +
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



