package com.infoshare.academy.model.cars;

public class CarPassenger extends Car {
    protected String type;
    protected String destiny;
    protected String seats;
    protected String transmission;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public CarPassenger(Integer id, String make, String model, Integer year, String fuelSource, Integer power, Integer mileage, String type, String destiny, String seats, String transmission) {
        super(id, make, model, year, fuelSource, power, mileage);
        this.type = type;
        this.destiny = destiny;
        this.seats = seats;
        this.transmission = transmission;


    }

    public void carPassengerDescription() {
        String descriptionPassenger = String.format("Samochód nr %s: %s %s, " +
                        "rok produkcji: %s, źródło paliwa: %s, moc: %s, przebieg: %s," +
                        " typ: %s, przeznaczenie: %s, ilość miejsc: %s,skrzynia biegów; %s", id, make, model,
                year, fuelSource, power, mileage, type, destiny, seats, transmission);

        System.out.println(descriptionPassenger);
    }
}



