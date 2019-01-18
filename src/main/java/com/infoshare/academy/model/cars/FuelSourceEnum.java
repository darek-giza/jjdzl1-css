package com.infoshare.academy.model.cars;

public enum FuelSource {

    PETROL("Bezołowiowa"),
    PETROLANDGAS("LPG"),
    DIESEL("Diesel"),
    CNG("CNG"),
    HYBRID("Hybrydowy"),
    ELECTRIC("Elektryczny")

    ;

    private String fuel;

    FuelSource(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void Messages(String text) {
        this.fuel = text;
    }
}
