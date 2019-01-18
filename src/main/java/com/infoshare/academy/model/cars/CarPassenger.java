package com.infoshare.academy.model.cars;

public class CarPassenger extends Car {
    protected ColorEnum colorEnum;
    protected BodyTypeEnum bodyTypeEnum;
    protected Integer seats;
    protected TransmissionEnum transmissionEnum;

    //Constructor
    public CarPassenger(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, ColorEnum colorEnum, BodyTypeEnum bodyTypeEnum, Integer seats, TransmissionEnum transmissionEnum) {
        super(id, make, model, year, mileage, fuelSourceEnum, enginePower);
        this.colorEnum = colorEnum;
        this.bodyTypeEnum = bodyTypeEnum;
        this.seats = seats;
        this.transmissionEnum = transmissionEnum;
    }

    //Getters
    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public BodyTypeEnum getBodyTypeEnum() {
        return bodyTypeEnum;
    }

    public Integer getSeats() {
        return seats;
    }

    public TransmissionEnum getTransmissionEnum() {
        return transmissionEnum;
    }

    //Setters
    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setBodyTypeEnum(BodyTypeEnum bodyTypeEnum) {
        this.bodyTypeEnum = bodyTypeEnum;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setTransmissionEnum(TransmissionEnum transmissionEnum) {
        this.transmissionEnum = transmissionEnum;
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
                ", fuelSourceEnum=" + fuelSourceEnum +
                ", enginePower=" + enginePower +
                ", colorEnum=" + colorEnum +
                ", bodyTypeEnum=" + bodyTypeEnum +
                ", seats=" + seats +
                ", transmissionEnum=" + transmissionEnum +
                '}';
    }
}



