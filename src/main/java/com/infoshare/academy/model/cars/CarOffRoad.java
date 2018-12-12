package com.infoshare.academy.model.cars;

public class CarOffRoad extends Car {

    protected Integer seats;
    protected Integer drive;
    protected String winch;
    protected String trunk;

    public CarOffRoad(Integer id, String make, String model, Integer year, String fuelSource, Integer power, Integer mileage, Integer seats, Integer drive, String winch, String trunk) {
        super(id, make, model, year, fuelSource, power, mileage);
        this.seats = seats;
        this.drive = drive;
        this.winch = winch;
        this.trunk = trunk;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getDrive() {
        return drive;
    }

    public void setDrive(Integer drive) {
        this.drive = drive;
    }

    public String getWinch() {
        return winch;
    }

    public void setWinch(String winch) {
        this.winch = winch;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public void carOffRosdDescription() {
        String descriptionOffRoad = String.format("Samochód nr %s: %s %s, rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s,liczba miejsc: %s,napęd: %s,wyciągarka: %s, bagażnik: %s "
                , id, make, model, year, fuelSource, power, mileage, seats, drive, winch, trunk);
        System.out.println(descriptionOffRoad);
    }
}
