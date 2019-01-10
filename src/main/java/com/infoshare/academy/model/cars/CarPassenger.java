package com.infoshare.academy.model.cars;

public class CarPassenger extends Car {
    protected Color color;
    protected BodyType bodyType;
    protected Integer seats;
    protected Transmission transmission;

    //Constructor
    public CarPassenger(Integer id, String make, String model, Integer year, Integer mileage, FuelSource fuelSource, Integer enginePower, Color color, BodyType bodyType, Integer seats, Transmission transmission) {
        super(id, make, model, year, mileage, fuelSource, enginePower);
        this.color = color;
        this.bodyType = bodyType;
        this.seats = seats;
        this.transmission = transmission;
    }

    //Getters
    public Color getColor() {
        return color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    //Setters
    public void setColor(Color color) {
        this.color = color;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setTransmission(Transmission transmission) {
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



