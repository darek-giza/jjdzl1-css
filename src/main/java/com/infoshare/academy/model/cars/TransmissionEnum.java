package com.infoshare.academy.model.cars;

public enum Transmission {
    AUTOMATIC("Automatyczna"),
    MANUAL("Manualna"),
    SEMIAUTO("Półautomatyczna")

    ;

    private String transmission;

    Transmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void Messages(String text) {
        this.transmission = text;
    }
}
